package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetRecipeDetailUseCase
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetSavedRecipesUseCase
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.ToggleBookmarkUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { ToggleBookmarkUseCase(get()) }
    single { GetSavedRecipesUseCase(get(), get()) }
    single { GetRecipeDetailUseCase(get(), get(), get(), get()) }
}