package com.example.chef_usecase

import org.koin.dsl.module

val chefUseCaseModule = module {
    single { GetAllChefImpl(get()) }
    single { InsertChefImpl(get()) }
}
