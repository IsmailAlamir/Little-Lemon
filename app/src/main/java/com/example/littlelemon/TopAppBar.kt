package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar(onClick:()->Unit){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){

        IconButton(onClick = onClick) {
            Image(painter = painterResource(id = R.drawable.ic_hamburger_menu), contentDescription = "Menu Icon",
                modifier= Modifier.size(28.dp))

        }
        Image(painter = painterResource(id = R.drawable.littlelemonlogo), contentDescription = "Little Lemon Logo",
            modifier= Modifier.fillMaxWidth(0.5f)
        )


        IconButton(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.ic_cart), contentDescription = "Menu Icon",
                modifier= Modifier.size(28.dp))

        }
    }
}
