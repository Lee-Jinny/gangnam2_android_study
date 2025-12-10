package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.search_recipes

import android.graphics.Paint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.survivalcoding.gangnam2kiandroidstudy.R
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.appbar.CustomAppTopBar
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.searchbar.SearchBarContainer
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppTextStyles

@Composable
fun SearchRecipesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        CustomAppTopBar(
            text = stringResource(R.string.search_recipes_title),
            showBackButton = true
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {

            item {
                SearchBarContainer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                )
            }

            item {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp),
                    text = stringResource(R.string.recent_search_subtitle),
                    style = AppTextStyles.normalTextBold,
                    textAlign = TextAlign.Left
                )
            }


        }

    }
}


@Preview(showBackground = true)
@Composable
private fun SearchRecipesScreenPreview() {
    SearchRecipesScreen()
}