package ir.rezarasuolzadeh.translator.ui.screen.home

import ir.rezarasuolzadeh.translator.ui.base.BaseAction

sealed interface HomeAction : BaseAction {
    data object OnGetTranslate : HomeAction
}