package com.survivalcoding.gangnam2kiandroidstudy.presentation.sign_in

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.survivalcoding.gangnam2kiandroidstudy.R
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons.BigButton
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.checkbox.AppCheckBox
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.textfields.InputField
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppColors
import com.survivalcoding.gangnam2kiandroidstudy.ui.theme.AppTextStyles

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
) {
    var nameInput by remember { mutableStateOf("") }
    var emailInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var confirmPasswordInput by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }

    Column(
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .padding(top = 10.dp),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = stringResource(R.string.signup_title),
                style = AppTextStyles.largeTextBold,
            )
            Spacer(Modifier.height(5.dp))
            Text(
                text = stringResource(R.string.signup_subtitle),
                style = AppTextStyles.smallerTextRegular,
                lineHeight = 17.sp,
                modifier = Modifier.size(195.dp, 34.dp)
            )
        }

        Spacer(Modifier.height(20.dp))

        InputField(
            value = nameInput,
            label = stringResource(R.string.label_name),
            onValueChange = {},
            placeholderText = stringResource(R.string.placeholder_name),
        )
        Spacer(Modifier.height(20.dp))

        InputField(
            value = emailInput,
            label = stringResource(R.string.label_email),
            onValueChange = {},
            placeholderText = stringResource(R.string.placeholder_email),
        )

        Spacer(Modifier.height(20.dp))

        InputField(
            value = passwordInput,
            label = stringResource(R.string.label_password),
            onValueChange = {},
            placeholderText = stringResource(R.string.placeholder_password),
        )
        Spacer(Modifier.height(20.dp))
        InputField(
            value = confirmPasswordInput,
            label = stringResource(R.string.label_confirm_password),
            onValueChange = {},
            placeholderText = stringResource(R.string.placeholder_confirm_password),
        )

        Row(
            modifier = Modifier.padding(top = 20.dp, bottom = 26.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AppCheckBox(
                checked = checked,
                onCheckedChange = { checked = it }
            )

            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = stringResource(R.string.accept_terms),
                style = AppTextStyles.smallerTextRegular.copy(color = AppColors.secondary100)
            )

        }



        BigButton(
            text = stringResource(R.string.button_sign_up),
        )

        Row(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 60.dp)
                .height(17.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.dp,
                color = AppColors.gray4
            )

            Text(
                modifier = Modifier.padding(horizontal = 7.dp),
                text = stringResource(R.string.divider_sign_in_with),
                style = AppTextStyles.smallerTextRegular.copy(
                    color = AppColors.gray4
                )
            )

            HorizontalDivider(
                modifier = Modifier.weight(1f),
                thickness = 1.dp,
                color = AppColors.gray4
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 91.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(44.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(10.dp),
                        clip = false,
                        ambientColor = Color(0x1A696969),
                    )
                    .background(
                        color = AppColors.white,
                        shape = RoundedCornerShape(10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_google),
                    contentDescription = "google sign in",
                    tint = Color.Unspecified
                )
            }

            Spacer(Modifier.width(25.dp))

            Box(
                modifier = Modifier
                    .size(44.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(10.dp),
                        clip = false,
                        ambientColor = Color(0x1A696969),
                    )
                    .background(
                        color = AppColors.white,
                        shape = RoundedCornerShape(10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_facebook),
                    contentDescription = "facebook sign in",
                    tint = Color.Unspecified
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.prompt_already_member),
                style = AppTextStyles.smallerTextBold
            )
            Spacer(Modifier.width(2.dp))
            Text(
                text = stringResource(R.string.action_sign_in_again),
                style = AppTextStyles.smallerTextBold.copy(
                    color = AppColors.secondary100
                )
            )
        }


    }
}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview(modifier: Modifier = Modifier.padding(horizontal = 30.dp)) {
    SignUpScreen(modifier = modifier.fillMaxSize())
}