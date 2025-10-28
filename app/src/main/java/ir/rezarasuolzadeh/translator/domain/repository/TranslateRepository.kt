package ir.rezarasuolzadeh.translator.domain.repository

import ir.rezarasuolzadeh.translator.ui.base.BaseResult
import ir.rezarasuolzadeh.translator.domain.model.translate.request.TranslateRequestModel

interface TranslateRepository {
    suspend fun translate(request: TranslateRequestModel): BaseResult
}