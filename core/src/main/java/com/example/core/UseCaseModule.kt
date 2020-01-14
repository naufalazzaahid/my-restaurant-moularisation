package com.example.core

import com.example.chef_usecase.GetAllChefImpl
import com.example.chef_usecase.InsertChefImpl
import org.koin.dsl.module

val useCaseModule = module {
    single { GetAllChefImpl(get()) }
    single { InsertChefImpl(get()) }
}
