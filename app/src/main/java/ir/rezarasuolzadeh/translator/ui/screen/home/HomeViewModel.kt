package ir.rezarasuolzadeh.translator.ui.screen.home

import androidx.compose.runtime.mutableStateOf
import ir.rezarasuolzadeh.translator.domain.model.translate.request.TranslateRequestModel
import ir.rezarasuolzadeh.translator.domain.repository.TranslateRepository
import ir.rezarasuolzadeh.translator.ui.base.BaseAction
import ir.rezarasuolzadeh.translator.ui.base.BaseViewModel
import ir.rezarasuolzadeh.translator.ui.screen.splash.HomeState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class HomeViewModel(
    private val translateRepository: TranslateRepository
) : BaseViewModel() {

    init {
        CoroutineScope(Dispatchers.IO).launch {
            delay(3000)
            onAction(action = HomeAction.OnGetTranslate)
        }
    }

    private val state = MutableStateFlow(value = HomeState())
    val stateValue = state.asStateFlow()

    var activateDeviceRequest by mutableStateOf(value = TranslateRequestModel())
        private set

    override fun onAction(action: BaseAction) {
        super.onAction(action)
        when (action) {
            is HomeAction.OnGetTranslate -> {
                getTranslate()
            }
        }
    }

    private fun getTranslate() {
        callWebService(
            webService = {
                translateRepository.translate(
                    request = activateDeviceRequest
                )
            },
            onSuccess = { response ->
                // nothing to do yet
            }
        )
    }

    override fun onResetState() {
        // nothing to do yet
    }

}