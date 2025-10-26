package ir.rezarasuolzadeh.translator.data.dto.translate.request

import ir.rezarasuolzadeh.translator.data.constant.ENGLISH_TO_PERSIAN
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TranslateRequestDto(
    @SerialName("q")
    var q: String = "",

    @SerialName("langpair")
    var pair: String = ENGLISH_TO_PERSIAN
)