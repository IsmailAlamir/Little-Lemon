package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(drawerState:DrawerState?=null ,scope: CoroutineScope?=null){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){

        IconButton(onClick = {
            scope?.launch {
                drawerState?.apply {
                    if (isClosed) open() else close()
                }
            }
        }) {
            Image(painter = painterResource(id = R.drawable.ic_hamburger_menu), contentDescription = "Menu Icon",
                modifier= Modifier.size(24.dp))

        }
        Image(painter = painterResource(id = R.drawable.littlelemonlogo), contentDescription = "Little Lemon Logo",
            modifier= Modifier.fillMaxWidth(0.5f)
                .padding(horizontal = 20.dp))


        IconButton(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.ic_cart), contentDescription = "Menu Icon",
                modifier= Modifier.size(24.dp))

        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TopAppBarPreview(){
//    TopAppBar()
//}