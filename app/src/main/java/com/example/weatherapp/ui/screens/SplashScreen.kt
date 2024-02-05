package com.example.weatherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.LightText
import com.example.weatherapp.ui.theme.Primary
import com.example.weatherapp.ui.theme.ReemKufi
import com.example.weatherapp.ui.theme.White
import com.example.weatherapp.R
import com.example.weatherapp.ui.theme.WeatherAppTheme

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.TopStart,
    ){
             WeatherText(
            modifier = Modifier.align(Alignment.Center)

        )
        WeatherPhoto(
            modifier = Modifier.align(Alignment.Center)
                .offset(y = (-200).dp,x = (-10).dp)
        )
    }

}

@Composable
fun WeatherPhoto(
    modifier: Modifier = Modifier,
){
    Box (
        modifier = modifier
            .padding(horizontal = 40.dp)
//            .padding(top = 180.dp)
        ,
        contentAlignment = Alignment.TopCenter){
        Image(
            painter = painterResource(id = R.drawable.ic_weather1),
            contentDescription = ""
        )
    }
}

@Composable
fun WeatherText(
    modifier: Modifier = Modifier,
){
    val annotatedString1 = AnnotatedString.Builder("Find your weather predictions in your City")
        .apply {
            addStyle(
                SpanStyle(
                    color = Primary,
                    fontSize = 30.sp
                ), 0, 4
            )
        }
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = modifier
    ) {
        Card(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .height(350.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Column(
                Modifier
                    .padding(top = 80.dp)
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = annotatedString1.toAnnotatedString(),
                    fontFamily = ReemKufi,
                    fontSize = 28.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Easy steps to predict the weather and make your day easier",
                    fontFamily = ReemKufi,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    color = LightText
                )

                Spacer(modifier = Modifier.height(36.dp))

                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Primary,
                        contentColor = White
                    ),
                    contentPadding = PaddingValues(horizontal = 30.dp, vertical = 10.dp),
                    modifier = Modifier.clip(shape = RoundedCornerShape(8.dp))
                ) {
                    Text(text = "Get Start", fontSize = 18.sp, fontFamily = ReemKufi)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    WeatherAppTheme {
        SplashScreen()
    }
}