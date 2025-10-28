package ir.rezarasuolzadeh.translator.data.model.translate.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TranslateResponseDto(
    @SerialName(value = "responseData")
    val responseData: TranslateResponseItemDto? = null,

    @SerialName(value = "responseDetails")
    val responseDetails: String? = null,

    @SerialName(value = "responseStatus")
    val responseStatus: Int? = null
)