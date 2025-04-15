package com.Kevin.harakamall.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun AssignScreen(navController: NavController){

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFEAEAEA))
        ) {
            Column {
                // Top background (Dark Blue with image and logo)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .background(Color(0xFF002140)) // Dark Blue
                ) {
                      Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "Logo",
                            modifier = Modifier.size(150.dp)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "The Most Worth Grocery App",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                // Spacer for visual separation
                Spacer(modifier = Modifier.height(60.dp))
            }

            // Foreground login box
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
                    .background(Color.White, shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                    .padding(horizontal = 24.dp, vertical = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = "The Most WorthGrocery App", textAlign = TextAlign.Center, fontSize = 25.sp)
                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                TextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Username") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                TextField(
                    value = password,
                    onValueChange = { password = it },
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
                ) {
                    Text("Sign Up")
                }

                Text(
                    text = "Already a member? Log in",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }










}


@Preview(showBackground = true)
@Composable
fun AssignScreenPreview(){
    AssignScreen(rememberNavController())
}
