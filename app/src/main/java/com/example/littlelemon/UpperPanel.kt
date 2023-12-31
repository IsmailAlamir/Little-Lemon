package com.example.littlelemon

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonColor

@Composable
fun UpperPanel(name: String,place:String) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(LittleLemonColor.green)
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = "$name!",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.yellow
        )
        Text(
            text = place,
            fontSize = 24.sp,
            color = LittleLemonColor.cloud
        )
        Row (
            modifier = Modifier
                .padding(top = 18.dp)
        ){

            Text(text = stringResource(id = R.string.description),
                color = LittleLemonColor.cloud ,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 28.dp)
                    .fillMaxWidth(0.6f))

            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Upper Panel Image",
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))

            )


        }


        Button(onClick = {
                         Toast.makeText(context,"Order received. Thank you",Toast.LENGTH_SHORT).show()
                         },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(LittleLemonColor.yellow)
        )
        {
            Text(
                text = "Reserve a table",
                fontSize=18.sp,
                fontWeight = FontWeight.Bold,
                color = LittleLemonColor.charcoal

            )

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
