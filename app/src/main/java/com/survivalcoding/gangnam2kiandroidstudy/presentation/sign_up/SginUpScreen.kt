package com.survivalcoding.gangnam2kiandroidstudy.presentation.sign_in

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.survivalcoding.gangnam2kiandroidstudy.R
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.auth.AppCheckBox
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.auth.AuthBottomText
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.auth.CenterTextDivider
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.auth.SocialLoginRow
import com.survivalcoding.gangnam2kiandroidstudy.presentation.component.buttons.BigButton
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

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {

        item {
            Column(
                modifier = Modifier.padding(top = 10.dp),
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
        }

        item { Spacer(Modifier.height(20.dp)) }

        item {
            InputField(
                value = nameInput,
                label = stringResource(R.string.label_name),
                onValueChange = { nameInput = it },
                placeholderText = stringResource(R.string.placeholder_name),
            )
        }

        item { Spacer(Modifier.height(20.dp)) }

        item {
            InputField(
                value = emailInput,
                label = stringResource(R.string.label_email),
                onValueChange = { emailInput = it },
                placeholderText = stringResource(R.string.placeholder_email),
            )
        }

        item { Spacer(Modifier.height(20.dp)) }

        item {
            InputField(
                value = passwordInput,
                label = stringResource(R.string.label_password),
                onValueChange = { passwordInput = it },
                placeholderText = stringResource(R.string.placeholder_password),
            )
        }

        item { Spacer(Modifier.height(20.dp)) }

        item {
            InputField(
                value = confirmPasswordInput,
                label = stringResource(R.string.label_confirm_password),
                onValueChange = { confirmPasswordInput = it },
                placeholderText = stringResource(R.string.placeholder_confirm_password),
            )
        }

        item {
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
        }

        item {
            BigButton(
                text = stringResource(R.string.button_sign_up),
            )
        }

        item {
            CenterTextDivider(stringResource(R.string.divider_sign_in_with))
        }

        item {
            SocialLoginRow()
        }

        item { Spacer(Modifier.height(20.dp)) }

        item {
            AuthBottomText(
                promptText = stringResource(R.string.prompt_already_member),
                actionText = stringResource(R.string.action_sign_in_again),
                onActionClick = { /* Navigate to SignIn */ }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview(modifier: Modifier = Modifier.padding(horizontal = 30.dp)) {
    SignUpScreen(modifier = modifier.fillMaxSize())
}