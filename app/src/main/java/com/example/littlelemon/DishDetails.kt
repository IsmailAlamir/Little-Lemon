package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonColor

@Composable
fun DishDetails(dishId: Int) {
    val dish = requireNotNull(DishRepository.getDish(dishId))
    var counter by remember { mutableIntStateOf(1) }

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Image(
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = dish.imageResource),
            contentDescription = dish.name,
        )
        Text(
            modifier = Modifier.padding(10.dp),
            text = dish.name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            modifier = Modifier.padding(10.dp),
            text = dish.description,
            fontSize = 18.sp,
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            TextButton(
                onClick = {
                    if (counter > 1) {
                        counter--
                    }
                }
            ) {
                Text(
                    text = "-",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Text(
                text = counter.toString(),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(16.dp)
            )
            TextButton(
                onClick = {
                    counter++
                }
            ) {
                Text(
                    text = "+",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        Button(
            onClick = { /* TODO */ },
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = LittleLemonColor.yellow),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(text = "Add for $${dish.price * counter}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DishDetailsPreview() {
    DishDetails(dishId = 1)
}
