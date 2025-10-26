package ir.rezarasuolzadeh.translator.data.repository

import ir.rezarasuolzadeh.translator.data.mapper.toDto
import ir.rezarasuolzadeh.translator.data.mapper.toModel
import ir.rezarasuolzadeh.translator.data.webservice.translate.RemoteTranslateDataSource
import ir.rezarasuolzadeh.translator.ui.base.BaseResult
import ir.rezarasuolzadeh.translator.ui.model.translate.request.TranslateRequestModel

class TranslateRepositoryImpl(
    private val remoteTranslateDatasource: RemoteTranslateDataSource
) : TranslateRepository {

    override suspend fun translate(request: TranslateRequestModel): BaseResult {
        val result = remoteTranslateDatasource.translate(request = request.toDto())
        return when(result.responseStatus) {
            in 200..202 -> {
                BaseResult.Success(
                    data = result.toModel()
                )
            }
            in 400..403 -> {
                return BaseResult.Error(
                    errorMessage = "عملیات با خطا مواجه شد"
                )
            }
            in 500..504 -> {
                return BaseResult.Error(
                    errorMessage = "عملیات با خطا مواجه شد"
                )
            }
            else -> {
                return BaseResult.Error(
                    errorMessage = "عملیات با خطا مواجه شد"
                )
            }
        }
    }

}