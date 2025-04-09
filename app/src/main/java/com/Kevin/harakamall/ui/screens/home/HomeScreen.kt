package com.Kevin.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Kevin.harakamall.R

@Composable
fun HomeScreen(navController: NavController){
 Column (modifier = Modifier.fillMaxSize()) {
     Text(
         text = "Harakamall",
         fontSize = 30.sp,
         color = Color.Blue,
         fontWeight = FontWeight.ExtraBold
     )

     Image(
         painter = painterResource(R.drawable.home),
         contentDescription = "Home"
         )

     Text(
         text = "Welcome to my app",
         fontSize = 20.sp,
         fontStyle = FontStyle.Italic


     )
     Text(
         text = " Web applications (e.g., e-commerce applications) that show the value of products and services to users in regions around the world need to present prices in local currencies. However, not only are currencies different around the world, but their formatting in terms of the symbol and placement are different as well.",

     )
     Button(onClick = {},
         colors = ButtonDefaults.buttonColors(Color.Blue),
         shape = RoundedCornerShape(10.dp)
         ) {

         Text(text = "add to cart"
         )
     }


 }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
HomeScreen(rememberNavController())
}




