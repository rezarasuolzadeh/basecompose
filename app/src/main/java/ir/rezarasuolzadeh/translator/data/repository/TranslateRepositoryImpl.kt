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
        return remoteTranslateDatasource.translate(request = request.toDto()).fold(
            onSuccess = {
                BaseResult.Success(
                    data = it.toModel()
                )
            },
            onFailure = {
                BaseResult.Error(
                    errorMessage = "عملیات با خطا مواجه شد"
                )
            }
        )
    }

}