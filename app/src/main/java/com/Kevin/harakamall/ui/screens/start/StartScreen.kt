package com.Kevin.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Kevin.harakamall.R
import com.Kevin.harakamall.navigation.ROUT_ITEM
import com.Kevin.harakamall.navigation.ROUT_LOGIN
import com.Kevin.harakamall.ui.theme.Orange40

@Composable
fun StartScreen(navController: NavController) {
Column (
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
){ Text(
    text = "Harakamall",
    fontSize = 20.sp,
    color = Color.Blue,
    fontWeight = FontWeight.ExtraBold
)
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = "Find your order!!!",
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Orange40
    )
//circular image
    Image(
        painter = painterResource(R.drawable.home),
        contentDescription = "home",
        modifier = Modifier.size(300.dp).clip(shape = CircleShape)
    )
    Spacer(modifier = Modifier.height(20.dp))


    Button(
        onClick = {
            navController.navigate(ROUT_LOGIN)},
        colors = ButtonDefaults.buttonColors(Orange40),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

    ) {

        Text(text = "get started"
        )
    }
}
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
StartScreen(rememberNavController())

}