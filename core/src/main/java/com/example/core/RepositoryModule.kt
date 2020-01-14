package com.example.core

import com.example.domain.ChefRepositoryImpl
import org.koin.dsl.module

val repositoryModule =
    module {
        single { ChefRepositoryImpl(get()) }
    }

