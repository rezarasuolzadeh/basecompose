package ir.rezarasuolzadeh.translator.ui.model.translate.request

import ir.rezarasuolzadeh.translator.data.constant.ENGLISH_TO_PERSIAN

data class TranslateRequestModel(
    var q: String = "Hello",
    var pair: String = ENGLISH_TO_PERSIAN
)