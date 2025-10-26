package ir.rezarasuolzadeh.translator.data.dto.translate.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TranslateResponseItemDto(
    @SerialName(value = "translatedText")
    val translatedText: String? = null
)