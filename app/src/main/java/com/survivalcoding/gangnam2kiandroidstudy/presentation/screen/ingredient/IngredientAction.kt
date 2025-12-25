package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.ingredient

sealed interface IngredientAction {
    data class SelectTab(val index: Int) : IngredientAction
    data object BackClicked : IngredientAction
    data object FollowClicked : IngredientAction
}