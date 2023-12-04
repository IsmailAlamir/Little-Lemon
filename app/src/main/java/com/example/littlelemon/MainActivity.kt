package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    UpperPanel(
                        name = stringResource(id = R.string.title),
                        place = stringResource(id = R.string.place),
                    )
                }
            }
        }
    }
}


@Composable
fun UpperPanel(name: String,place:String) {
    Column {
        Text(
            text = "$name!",
            fontSize=32.sp,
            color=Color(R.color.primary)

        )
        Text(
            text = place,
            fontSize=32.sp,
            color=Color(R.color.primary)

        )
        Row {
           Column {
               Button(onClick = { /*TODO*/ },
                   shape = RoundedCornerShape(16.dp),
                   colors = ButtonDefaults.buttonColors(colorResource(id= R.color.primary))
               )
               {
                   Text(
                       text = "Reserve a table",
                       fontSize=18.sp
                   )

               }

               Text(
                   text = "At Little Lemon, we believe in creating more than just a dining experience",
                   fontSize=18.sp

               )

           }
//            Image(painter = id=R.drawable.foodpic, contentDescription = )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    UpperPanel(
        name = stringResource(id = R.string.title),
        place = stringResource(id = R.string.place),
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleLemonTheme {
    }
}