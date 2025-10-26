package ir.rezarasuolzadeh.translator.data.repository

import ir.rezarasuolzadeh.translator.ui.base.BaseResult
import ir.rezarasuolzadeh.translator.ui.model.translate.request.TranslateRequestModel

interface TranslateRepository {
    suspend fun translate(request: TranslateRequestModel): BaseResult
}