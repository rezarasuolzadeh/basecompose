package ir.rezarasuolzadeh.translator.data.dto.translate.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TranslateResponseDto(
    @Json(name = "responseData")
    val responseData: TranslateResponseItemDto? = null,

    @Json(name = "responseDetails")
    val responseDetails: String? = null,

    @Json(name = "responseStatus")
    val responseStatus: Int? = null
)