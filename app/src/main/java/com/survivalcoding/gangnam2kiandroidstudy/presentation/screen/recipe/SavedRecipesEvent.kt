package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.recipe

sealed interface SavedRecipesEvent {

    data class NavigateToRecipeDetail(val recipeId: Int) : SavedRecipesEvent
}