package ir.rezarasuolzadeh.translator.domain.model.translate.request

import ir.rezarasuolzadeh.translator.data.network.ENGLISH_TO_PERSIAN

data class TranslateRequestModel(
    var q: String = "Hello",
    var pair: String = ENGLISH_TO_PERSIAN
)