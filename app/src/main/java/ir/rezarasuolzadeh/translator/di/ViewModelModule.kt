package ir.rezarasuolzadeh.translator.di

import ir.rezarasuolzadeh.translator.ui.screen.home.HomeViewModel
import ir.rezarasuolzadeh.translator.ui.screen.splash.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel {
        SplashViewModel()
    }
    viewModel {
        HomeViewModel(translateRepository = get())
    }
}