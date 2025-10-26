package ir.rezarasuolzadeh.translator.data.webservice.translate

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.setBody
import ir.rezarasuolzadeh.translator.data.constant.TRANSLATE_END_POINT
import ir.rezarasuolzadeh.translator.data.dto.translate.request.TranslateRequestDto
import ir.rezarasuolzadeh.translator.data.dto.translate.response.TranslateResponseDto

class KtorRemoteTranslateDataSource(private val httpClient: HttpClient) : RemoteTranslateDataSource {

    override suspend fun translate(request: TranslateRequestDto): TranslateResponseDto {
        return httpClient.get(urlString = TRANSLATE_END_POINT) {
            url {
                parameters.apply {
                    append(name = "q", value = request.q)
                    append(name = "langpair", value = request.pair)
                }
            }
            setBody(body = request)
        }.body()
    }

}