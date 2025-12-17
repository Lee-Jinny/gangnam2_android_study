package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home.HomeViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.ingredient.IngredientViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.recipe.SavedRecipesViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.search_recipes.SearchRecipesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        HomeViewModel(
            recipeRepository = get(),
            bookmarkRepository = get(),
            toggleBookmarkUseCase = get(),
        )

    }
    viewModel {
        IngredientViewModel(
            getRecipeDetailUseCase = get()
        )

    }
    viewModel {
        SavedRecipesViewModel(
            getSavedRecipesUseCase = get(),
            toggleBookmarkUseCase = get(),
        )

    }
    viewModel {
        SearchRecipesViewModel(
            recipeRepository = get()
        )

    }
}