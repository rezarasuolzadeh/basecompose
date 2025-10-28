package ir.rezarasuolzadeh.translator.data.mapper

import ir.rezarasuolzadeh.translator.data.model.translate.request.TranslateRequestDto
import ir.rezarasuolzadeh.translator.data.model.translate.response.TranslateResponseDto
import ir.rezarasuolzadeh.translator.data.model.translate.response.TranslateResponseItemDto
import ir.rezarasuolzadeh.translator.domain.model.translate.request.TranslateRequestModel
import ir.rezarasuolzadeh.translator.domain.model.translate.response.TranslateResponseItemModel
import ir.rezarasuolzadeh.translator.domain.model.translate.response.TranslateResponseModel

fun TranslateResponseDto.toModel() = TranslateResponseModel(
    responseData = responseData?.toModel(),
    responseDetails = responseDetails,
    responseStatus = responseStatus
)

fun TranslateResponseItemDto.toModel() = TranslateResponseItemModel(
    translatedText = translatedText
)

fun TranslateRequestModel.toDto() = TranslateRequestDto(
    q = q,
    pair = pair
)