package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.survivalcoding.gangnam2kiandroidstudy.AppApplication
import com.survivalcoding.gangnam2kiandroidstudy.data.Repository.RecipeRepository
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.selector.HomeCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class HomeViewModel(
    private val repository: RecipeRepository
) : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    init {
        loadRecipes()
    }

    // 전체 로드
    private fun loadRecipes() {
        viewModelScope.launch {
            val recipes = repository.getRecipes()
            _state.update { current ->
                current.copy(
                    recipes = recipes,
                    filteredRecipes = recipes
                )
            }
        }
    }


    // 카테고리 선택
    fun onSelectCategory(category: HomeCategory) {
        _state.update { current ->
            val filtered = if (category == HomeCategory.ALL) {
                current.recipes
            } else {
                current.recipes.filter { it.category == category.label }
            }

            current.copy(
                selectedCategory = category,
                filteredRecipes = filtered
            )
        }
    }


    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val repository =
                    (this[APPLICATION_KEY] as AppApplication).recipeRepository
                HomeViewModel(repository)
            }
        }
    }
}