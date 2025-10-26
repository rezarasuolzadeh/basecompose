package ir.rezarasuolzadeh.translator.data.webservice.translate

import ir.rezarasuolzadeh.translator.data.dto.translate.request.TranslateRequestDto
import ir.rezarasuolzadeh.translator.data.dto.translate.response.TranslateResponseDto

interface RemoteTranslateDataSource {
    suspend fun translate(request: TranslateRequestDto): TranslateResponseDto
}