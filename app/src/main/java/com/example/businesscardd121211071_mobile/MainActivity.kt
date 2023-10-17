package com.example.businesscardd121211071_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardd121211071_mobile.ui.theme.BusinessCardD121211071_MobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardD121211071_MobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )

                {
                    CardText("Jessica Evangeline Winardy", "Informatics Engineering Student")
                }
            }
        }
    }
}


@Composable
fun CardText(name: String, job: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color(199, 231, 244))
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.awan),
            contentDescription = null,
            modifier = Modifier
                .offset(x = 55.dp, y = (-35).dp)
                .size(300.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.foto_jes_fotor_20231017211935),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(175.dp))
            Text(
                text = name,
                fontSize = 32.sp,
                color = Color(6, 113, 183),
                modifier = Modifier.padding(7.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = job,
                fontSize = 16.sp,
                color = Color(225, 137, 166),
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
        ContactText()
    }


@Composable
fun ContactText(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.padding(bottom = 20.dp, start = 50.dp)){
        Row(modifier = Modifier.padding(7.dp)) {
            Icon(
                Icons.Filled.Call,
                contentDescription = "Localized description",
                tint = Color(225, 137, 166),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "+62-878-1631-9469",
                fontSize = 18.sp,
                color = Color(6,113,183),
                fontFamily = FontFamily.SansSerif
            )
        }
        Row(modifier = Modifier.padding(7.dp)){
            Icon(
                Icons.Filled.Share,
                contentDescription = "Localized description",
                tint = Color(225, 137, 166),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "msha.ke/jessicawinardy",
                fontSize = 18.sp,
                color = Color(6,113,183),
                fontFamily = FontFamily.SansSerif
            )
        }

        Row(modifier = Modifier.padding(7.dp)){
            Icon(
                Icons.Filled.Email,
                contentDescription = "Localized description",
                tint = Color(225, 137, 166),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "jessicawinardy@gmail.com",
                fontSize = 18.sp,
                color = Color(6,113,183),
                fontFamily = FontFamily.SansSerif
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardD121211071_MobileTheme {
        CardText("Jessica Evangeline Winardy", "Informatics Engineering Student")

    }
}