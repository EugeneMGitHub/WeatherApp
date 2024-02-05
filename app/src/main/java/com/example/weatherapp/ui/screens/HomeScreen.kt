package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R
import com.example.weatherapp.ui.theme.DarkGrey
import com.example.weatherapp.ui.theme.LightIcon
import com.example.weatherapp.ui.theme.LightText
import com.example.weatherapp.ui.theme.Poppins
import com.example.weatherapp.ui.theme.ReemKufi
import com.example.weatherapp.ui.theme.WeatherAppTheme
import com.example.weatherapp.ui.theme.White

@Composable
fun HomeScreen() {

    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Search for city",
            fontFamily = ReemKufi,
            color = LightText,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            textAlign = TextAlign.Center
        )
        SearchBox()
        Cards()
        MoreCitiesButton()
        DataBox()
    }

}

@Composable
fun DataBox() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
//        contentAlignment = Alignment.TopStart
    ) {
        Card(
            modifier = Modifier
                .padding(top = 80.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(0.dp)
        ) {

            Row(
                modifier = Modifier
                    .padding(40.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Precipation",
                        fontFamily = Poppins,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = LightText
                    )
                    Text(
                        text = "35 %",
                        fontFamily = Poppins,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = DarkGrey
                    )
                    Text(
                        text = "Humidity",
                        fontFamily = Poppins,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = LightText
                    )
                    Text(
                        text = "30 %",
                        fontFamily = Poppins,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = DarkGrey
                    )
                }

                Spacer(
                    modifier = Modifier
                        .width(1.dp)
                        .height(80.dp)
                        .background(LightText)
                )
                Column {
                    Text(
                        text = "Wind",
                        fontFamily = Poppins,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = LightText
                    )
                    Text(
                        text = "160",
                        fontFamily = Poppins,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = DarkGrey
                    )
                    Text(
                        text = "Pressure",
                        fontFamily = Poppins,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = LightText
                    )
                    Text(
                        text = "450hPa",
                        fontFamily = Poppins,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = DarkGrey
                    )
                }

            }
        }
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
            Image(
                painter = painterResource(id = R.drawable.ic_weather3), contentDescription = "",
                modifier = Modifier.padding(top = 40.dp)
            )
        }
    }
}

@Composable
fun MoreCitiesButton() {
Button(
    onClick = {},
    colors = ButtonDefaults.buttonColors(
        containerColor = White,
        contentColor = LightText
    ),
    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 6.dp) ,
    modifier = Modifier.clip(RoundedCornerShape(8.dp))

){
    Row(verticalAlignment = Alignment.CenterVertically){
        Text(text = "More Cities", fontSize = 14.sp, fontFamily = Poppins)
        Spacer(Modifier.width(10.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_more),
            contentDescription = "",
            tint = LightText,
            modifier = Modifier.size(18.dp)
        )
    }
}
}

@Composable
fun Cards() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CardUI2(
            temperature = "30oC",
            city = "Moskow",
            resourceId = R.drawable.ic_weather2,
            humidity = "77%",
            wind = "3 km/h"
        )

        CardUI2(
            temperature = "25oC",
            city = "Oryol",
            resourceId = R.drawable.ic_weather2,
            humidity = "45%",
            wind = "4 km/h"
        )
    }
}

//@Composable
//fun CardUI(temperature: String, city: String, resourceId: Int, humidity: String, wind: String) {
//Card(
//    colors = CardDefaults.cardColors(
//        containerColor = White
//    ),
//    elevation =CardDefaults.cardElevation(
//        defaultElevation = 0.dp
//    )
//){
@Composable
fun CardUI(temperature: String,city:String,resourceId:Int,humidity:String,wind:String) {
    Card(
    colors = CardDefaults.cardColors(
        containerColor = White
    ),
    elevation =CardDefaults.cardElevation(
        defaultElevation = 0.dp
    )
) {
        Box(
            Modifier
                .width(150.dp)
                .padding(10.dp), contentAlignment = Alignment.TopEnd
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_weather2),
                contentDescription = ""
            )
        }
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = city, fontFamily = Poppins, fontSize = 14.sp, color = LightText)
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = getTemperature(temperature = temperature).toAnnotatedString(),
                fontFamily = Poppins,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(0.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(resourceId),
                    contentDescription = "",
                    Modifier.size(14.dp),
                    tint = LightIcon
                )
                Text(
                    text = humidity,
                    fontFamily = Poppins,
                    fontSize = 12.sp,
                    color = LightText
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    painter = painterResource(R.drawable.ic_wind),
                    contentDescription = "",
                    Modifier.size(14.dp),
                    tint = LightIcon
                )
                Text(
                    text = wind,
                    fontFamily = Poppins,
                    fontSize = 12.sp,
                    color = LightText
                )
            }
        }

    }
}

@Composable
fun CardUI2(temperature: String,city:String,resourceId:Int,humidity:String,wind:String) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        elevation =CardDefaults.cardElevation(
            defaultElevation = 0.dp
        )
    ) {
        Box(
            Modifier
                .width(150.dp)
                .padding(10.dp),
//            contentAlignment = Alignment.TopEnd
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_weather2),
                contentDescription = "",
                modifier = Modifier.align(Alignment.TopEnd)
            )
            Column(
                modifier = Modifier
//                    .padding(10.dp)
                    .padding(top = 15.dp)
                    .align(Alignment.TopStart)
            ) {
                Text(text = city, fontFamily = Poppins, fontSize = 14.sp, color = LightText)
                Spacer(modifier = Modifier.height(0.dp))
                Text(
                    text = getTemperature(temperature = temperature).toAnnotatedString(),
                    fontFamily = Poppins,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.height(0.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(resourceId),
                        contentDescription = "",
                        Modifier.size(14.dp),
                        tint = LightIcon
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = humidity,
                        fontFamily = Poppins,
                        fontSize = 12.sp,
                        color = LightText
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        painter = painterResource(R.drawable.ic_wind),
                        contentDescription = "",
                        Modifier.size(14.dp),
                        tint = LightIcon
                    )
                    Text(
                        text = wind,
                        fontFamily = Poppins,
                        fontSize = 12.sp,
                        color = LightText
                    )
                }
            }

        }


    }
}

fun getTemperature(temperature: String): AnnotatedString.Builder {
    val annotatedString1 = AnnotatedString.Builder(temperature)
        .apply {
            addStyle(
                SpanStyle(
                    fontSize = 18.sp,
                    baselineShift = BaselineShift.Superscript
                ), 2, 3
            )
        }
    return annotatedString1
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBox() {
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        value = text,
        onValueChange = {text = it},
        label = null,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "",
                tint = LightText,
                modifier = Modifier.size(20.dp)
                )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp, bottom = 8.dp)
            .clip(shape = RoundedCornerShape(18.dp)),
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )

    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        HomeScreen()
    }
}