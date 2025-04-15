package com.Kevin.harakamall.ui.screens.logo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Kevin.harakamall.R


@Composable
fun LogoScreen(navController: NavController)
{
    Box(modifier = Modifier.fillMaxSize(),
        ) {

        // Top background section with fixed height
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(Color(0xFF002140))
        ) {

            Column(
                modifier = Modifier
                     .fillMaxSize()
                    .padding(top = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Logo App",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center

                )
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "Logo",
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))

            }
        }

        // Overlapping login card with rounded top corners
        Card(
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(395.dp)
                .align(Alignment.BottomCenter)
                // Offset upward to overlap with the top background section
                .offset(y = (-50).dp)
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 24.dp, vertical = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "The Most Worth Grocery App",
                    color = Color.Red,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center

                    )
                // Optionally add a spacer if you need extra space at the top of the card
                Spacer(modifier = Modifier.height(20.dp))

                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                TextField(
                    value = username,
                    onValueChange = { username = it },
                    shape = RoundedCornerShape(20.dp),
                    label = { Text("Username") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                TextField(
                    value = password,
                    onValueChange = { password = it },
                    shape = RoundedCornerShape(20.dp),
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                Button(
                    onClick = { /* Handle Sign Up */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF3B30)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )
                { Text("SignUp") }
                Text(text = "Already a member?Log In", fontSize = 14.sp, color = Color.Black)

            }
        }
    }






}
@Preview(showBackground = true)
@Composable
fun LogoScreenPreview(){
    LogoScreen(rememberNavController())
}
