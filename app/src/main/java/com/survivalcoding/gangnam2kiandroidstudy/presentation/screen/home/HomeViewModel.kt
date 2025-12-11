package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home

import androidx.lifecycle.ViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.selector.HomeCategory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    // 카테고리 선택
    fun onSelectCategory(category: HomeCategory) {
        _state.update { current ->
            current.copy(selectedCategory = category)
        }
    }
}