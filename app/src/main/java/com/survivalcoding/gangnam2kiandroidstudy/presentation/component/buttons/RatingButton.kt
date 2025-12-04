package com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.survivalcoding.gangnam2kiandroidstudy.R
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppColors
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppTextStyles


@Composable
fun RatingButton(
    rate: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .size(50.dp, 28.dp)
            .border(
                width = 1.dp,
                color = AppColors.primary80,
                shape = RoundedCornerShape(10.dp)
            )
            .background(AppColors.white, RoundedCornerShape(10.dp))
            .padding(horizontal = 10.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text(
            text = rate,
            style = AppTextStyles.smallerTextRegular.copy(
                color = AppColors.primary80
            ),
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.width(5.dp))
        Icon(
            painter = painterResource(R.drawable.ic_star_2),
            contentDescription = "star",
            tint = AppColors.primary80,
            modifier = Modifier
                .size(18.dp)
        )
    }
}

@Composable
fun RatingButtonFilled(
    rate: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .size(50.dp, 28.dp)
            .background(AppColors.primary100, RoundedCornerShape(10.dp))
            .padding(horizontal = 10.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = rate,
            style = AppTextStyles.smallerTextRegular.copy(
                color = AppColors.white
            ),
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.width(5.dp))
        Icon(
            painter = painterResource(R.drawable.ic_star_1),
            contentDescription = "star",
            tint = AppColors.white,
            modifier = Modifier
                .size(18.dp)
        )
    }
}


@Preview
@Composable
private fun RatingButtonPreview() {
    Column {
        RatingButton(rate = "5")
        RatingButtonFilled(rate = "5")
    }
}