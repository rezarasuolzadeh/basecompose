package ir.rezarasuolzadeh.translator.data.remote.translate

import ir.rezarasuolzadeh.translator.data.model.translate.request.TranslateRequestDto
import ir.rezarasuolzadeh.translator.data.model.translate.response.TranslateResponseDto

interface RemoteTranslateDataSource {
    suspend fun translate(request: TranslateRequestDto): TranslateResponseDto
}