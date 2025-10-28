package ir.rezarasuolzadeh.translator.ui.screen.splash

import ir.rezarasuolzadeh.translator.ui.base.BaseAction

sealed interface SplashAction : BaseAction {
    data object OnSplashFinished : SplashAction
}