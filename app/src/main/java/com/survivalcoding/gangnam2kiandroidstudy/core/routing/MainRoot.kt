package com.survivalcoding.gangnam2kiandroidstudy.core.routing

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.navigation.BottomNavBar
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.navigation.bottomNavItemList
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home.HomeRoot
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.notifications.NotificationsScreen
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.profile.ProfileScreen
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.recipe.SavedRecipesRoot
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppColors

@Composable
fun MainRoot() {
    val mainBackStack = rememberNavBackStack(Route.Home)

    val currentKey = mainBackStack.lastOrNull() ?: Route.Home

    Scaffold(
        containerColor = AppColors.white,
        bottomBar = {
            BottomNavBar(
                items = bottomNavItemList,
                currentRoute = currentKey,
                onItemClick = { route ->
                    if (route != currentKey) {
                        mainBackStack.clear()
                        mainBackStack.add(route)
                    }
                }
            )
        }
    ) { innerPadding ->
        NavDisplay(
            modifier = Modifier.padding(innerPadding),
            backStack = mainBackStack,
            entryDecorators = listOf(
                rememberSaveableStateHolderNavEntryDecorator(),
                rememberViewModelStoreNavEntryDecorator()
            ),
            entryProvider = entryProvider {

                entry<Route.Home> {
                    HomeRoot()
                }

                entry<Route.SavedRecipes> {
                    SavedRecipesRoot()

                }

                entry<Route.Profile> {
                    ProfileScreen()

                }
                entry<Route.Notifications> {
                    NotificationsScreen()
                }
            }
        )
    }
}
