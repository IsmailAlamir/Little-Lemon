package com.example.littlelemon

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerPanel(){
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope= rememberCoroutineScope()
    val items = listOf(
        DrawerItem(icon = Icons.Default.Favorite , label= "123", secondaryLabel = "1"),
        DrawerItem(icon = Icons.Default.Favorite , label= "234", secondaryLabel = "2"),
        DrawerItem(icon = Icons.Default.Favorite , label= "345", secondaryLabel = "3")
    )
    var selectedItem by remember {
        mutableStateOf(items[0])
    }

    ModalNavigationDrawer(
        drawerState=drawerState,
//        to disable the swipe
//        gesturesEnabled = false,

//      this is to enable swipe only if it is open
        gesturesEnabled = drawerState.isOpen,
        drawerContent = {
        ModalDrawerSheet {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                    contentAlignment = Alignment.Center
            ){
                Text(text = "Header", style = MaterialTheme.typography.headlineLarge)
            }
            items.forEach{item->
                NavigationDrawerItem(
                    label = {  Text(text = item.label)},
                    selected =item == selectedItem,
                    onClick = {
                        scope.launch { drawerState.close()}
                        selectedItem=item},
                    icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
                    badge= { Text(text = item.secondaryLabel)},
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                )
            }
        }
    },
        content=  {
            TopAppBar(
                onClick = { scope.launch { drawerState.open()} }
    )

})
        }



data class DrawerItem(
    val   icon: ImageVector,
    val label: String,
    val secondaryLabel: String
)

