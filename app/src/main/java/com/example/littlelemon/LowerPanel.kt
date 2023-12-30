package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        DishesList(Dishes)
    }
}


@Composable
fun WeeklySpecial(){
    Card (

        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White),

            ){
        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )
    }

}

@Composable
fun DishesList(dishes: List<Dish>) {
    LazyColumn(modifier = Modifier
            .wrapContentWidth(Alignment.Start)
            .padding(12.dp) ,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        // using lazyColumn
        state = rememberLazyListState()) {
        items(dishes) { dish ->
            MenuDish(dish = dish)
        }
    }
}


@Composable
fun MenuDish(dish :Dish) {
    Card (
        colors = CardDefaults.cardColors(
            containerColor = Color.White),

        ){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ){
            Column {
                Text(
                    text = dish.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = dish.description,
                    color = Color(R.color.gray),
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(text = dish.price,
                    color = Color(R.color.gray),
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                modifier= Modifier.size(85.dp),
                contentScale = ContentScale.FillHeight,
                painter = painterResource(id = dish.image),
                contentDescription = dish.name+ " Image")

        }


    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )

}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
data class Dish(
    val name: String,
    val image: Int,
    val description: String,
    val price: String
)

val Dishes = listOf(
    Dish(name = "Greek Salad", image = R.drawable.greeksalad, description ="Experience the taste of the Mediterranean with our Greek ..." , price = "$ 12.55"),
    Dish(name = "Bruschetta", image = R.drawable.bruschetta, description ="Elevate your palate with our Tomato Basil Bruschetta. ..." , price = "$ 5.89"),
    Dish(name = "Lemon Dessert", image = R.drawable.lemondessert, description ="Satisfy your sweet cravings with our Zesty Lemon Delight ..." , price = "$ 2.50"),
    Dish(name = "Grilled Fish", image = R.drawable.grilledfish, description ="Elevate your palate with our Tomato ..." , price = "$ 7.45"),
)

