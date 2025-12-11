package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home

import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.selector.HomeCategory

data class HomeState(
    val selectedCategory: HomeCategory = HomeCategory.ALL
)