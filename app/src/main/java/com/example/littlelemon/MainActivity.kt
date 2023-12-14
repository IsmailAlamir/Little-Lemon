package com.example.littlelemon

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HomeScreen()
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    Scaffold(

    ) {

    Column {
        TopAppBar(drawerState=drawerState , scope=scope)

        UpperPanel(
            name = stringResource(id = R.string.title),
            place = stringResource(id = R.string.place),
        )
        LowerPanel()
    }
    }
}





}
//    Scaffold (
////        drawerContent ={ DrawerPanel(scaffoldState = snackBarHostState, scope = scope)}
//        topBar ={
//        TopAppBar(scaffoldState= scaffoldState, scope=scope)
//    }){
//    Column {
//        UpperPanel(
//            name = stringResource(id = R.string.title),
//            place = stringResource(id = R.string.place),
//        )
//        LowerPanel()
//    }
//}

