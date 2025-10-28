package ir.rezarasuolzadeh.translator.ui.routes

import kotlinx.serialization.Serializable

sealed interface MainRoutes {

    @Serializable
    data object Splash : MainRoutes

    @Serializable
    data object Home : MainRoutes

}