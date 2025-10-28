package ir.rezarasuolzadeh.translator.domain.model.translate.response

data class TranslateResponseModel(
    val responseData: TranslateResponseItemModel? = null,
    val responseDetails: String? = null,
    val responseStatus: Int? = null
)