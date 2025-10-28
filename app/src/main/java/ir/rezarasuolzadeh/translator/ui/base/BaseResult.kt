package ir.rezarasuolzadeh.translator.ui.base

sealed class BaseResult {
    data class Success<out D>(val data: D): BaseResult()
    data class Error(val errorMessage: String): BaseResult()
}