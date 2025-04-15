package com.Kevin.harakamall.ui.screens.form

import android.app.Person
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Kevin.harakamall.R
import com.Kevin.harakamall.navigation.ROUT_ITEM
import com.Kevin.harakamall.ui.theme.Orange40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(navController: NavController){
Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center)

 {
     Image(
         painter = painterResource(R.drawable.tree),
         contentDescription = "tree",
         modifier = Modifier.size(300.dp)
     )
    Text(text = "Create an Account",
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
     //variables
     var fullname by remember { mutableStateOf("") }
     var username by remember { mutableStateOf("") }
     var email by remember { mutableStateOf("") }
     var password by remember { mutableStateOf("") }
     var confirmpassword by remember { mutableStateOf("") }

     //fullname
     TextField(
         value = fullname,
         onValueChange = {fullname = it},
         modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
         leadingIcon = { Icon(imageVector = Icons.Default.Person,contentDescription = "") },
         label = {Text(text = "fullname")},
         colors = OutlinedTextFieldDefaults.colors(
             focusedBorderColor = Color.Black,
             unfocusedBorderColor = Color.Black,),
         keyboardOptions = KeyboardOptions(keyboardType  = KeyboardType.Text)
     )
     //end of fullname
     Spacer(modifier = Modifier.height(20.dp))
     //username
     TextField(
         value = username,
         onValueChange = {username= it},
         modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
         leadingIcon = { Icon(imageVector = Icons.Default.Face,contentDescription = "") },
         label = {Text(text = "username")},
         colors = OutlinedTextFieldDefaults.colors(
             focusedBorderColor = Color.Black,
             unfocusedBorderColor = Color.Black,),
         keyboardOptions = KeyboardOptions(keyboardType  = KeyboardType.Text),
     )
         //end of username
         Spacer(modifier = Modifier.height(20.dp))

         TextField(value = password,
         onValueChange = {password = it},
         modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
         leadingIcon = { Icon(imageVector = Icons.Default.Create,contentDescription = "")},
         label = {Text(text = "password")},
         colors = OutlinedTextFieldDefaults.colors(
             focusedBorderColor = Color.Black,
             unfocusedBorderColor = Color.Black,),
         keyboardOptions = KeyboardOptions(keyboardType  = KeyboardType.Text),
             visualTransformation = PasswordVisualTransformation(),
         )
         //end of username
         Spacer(modifier = Modifier.height(20.dp))
             TextField(value = confirmpassword,
             onValueChange = {confirmpassword = it},
             modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
             leadingIcon = { Icon(imageVector = Icons.Default.Check,contentDescription = "")},
             label = {Text(text = "confirm password")},
             colors = OutlinedTextFieldDefaults.colors(
                 focusedBorderColor = Color.Black,
                 unfocusedBorderColor = Color.Black,),
             keyboardOptions = KeyboardOptions(keyboardType  = KeyboardType.Text),
             visualTransformation = PasswordVisualTransformation(),
             )
     //email
     TextField(value = email,
         onValueChange = {email = it},
         modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
         leadingIcon = { Icon(imageVector = Icons.Default.Email,contentDescription = "") },
         label ={ Text(text = "email")},
         colors = OutlinedTextFieldDefaults.colors(
             focusedBorderColor = Color.Black,
             unfocusedBorderColor = Color.Black,
             focusedLeadingIconColor = Orange40),
         keyboardOptions = KeyboardOptions(keyboardType  = KeyboardType.Text),

     )
     Button(
         onClick = {
             navController.navigate(ROUT_ITEM)},
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
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}
