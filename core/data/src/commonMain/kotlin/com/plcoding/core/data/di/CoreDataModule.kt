package com.plcoding.core.data.di

import com.plcoding.core.data.logging.KermitLogger
import com.plcoding.core.data.networking.HttpClientFactory
import com.plcoding.core.domain.logging.ChirpLogger
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

expect val platformCoreDataModule: Module

val coreDataModule = module {
    singleOf(::KermitLogger) bind ChirpLogger::class
    single {
        HttpClientFactory(get()).create()
    }
}