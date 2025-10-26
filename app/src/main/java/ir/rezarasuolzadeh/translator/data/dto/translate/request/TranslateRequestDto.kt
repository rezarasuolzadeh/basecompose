package ir.rezarasuolzadeh.translator.data.dto.translate.request

import ir.rezarasuolzadeh.translator.data.constant.ENGLISH_TO_PERSIAN

data class TranslateRequestDto(
    var q: String = "",
    var pair: String = ENGLISH_TO_PERSIAN
)