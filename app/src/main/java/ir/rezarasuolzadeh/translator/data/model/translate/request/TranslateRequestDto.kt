package ir.rezarasuolzadeh.translator.data.model.translate.request

import ir.rezarasuolzadeh.translator.data.network.ENGLISH_TO_PERSIAN
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TranslateRequestDto(
    @SerialName("q")
    var q: String = "",

    @SerialName("langpair")
    var pair: String = ENGLISH_TO_PERSIAN
)