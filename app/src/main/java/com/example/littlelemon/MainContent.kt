package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun MainContent(navController: NavHostController) {
    Column {
        Spacer(modifier = Modifier.height(64.dp))
        UpperPanel(
            name = stringResource(id = R.string.title),
            place = stringResource(id = R.string.place),
        )
        MenuCategoryImplement(Categories)
        LowerPanel(navController, DishRepository.dishes)
    }
}