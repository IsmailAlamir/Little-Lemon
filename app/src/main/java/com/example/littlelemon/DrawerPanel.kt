package com.example.littlelemon


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerPanel(){
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Text("Drawer title", modifier = Modifier.padding(16.dp))
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Drawer Item") },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                        label = { Text(text = "Drawer Item") },
                selected = false,
                onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                label = { Text(text = "Drawer Item") },
                selected = false,
                onClick = { /*TODO*/ }
            )
                NavigationDrawerItem(
                    label = { Text(text = "Drawer Item") },
                selected = false,
                onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                label = { Text(text = "Drawer Item") },
                selected = false,
                onClick = { /*TODO*/ }
            )
                // ...other drawer items
            }
        }
    ) {
       Text(text = "sdsdsdsd")
    }

//
//    List(4){
//        Text(text = "item #$it", modifier= Modifier.padding(horizontal=20.dp, vertical = 10.dp))
//    }
//    IconButton(onClick = { /*TODO*/ }) {
//         Icon(ImageVector=Icons.Default.ExitToApp, contentDescription = "Close Icon")
//    }
}

