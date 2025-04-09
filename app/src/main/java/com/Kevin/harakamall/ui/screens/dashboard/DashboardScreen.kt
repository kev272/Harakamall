package com.Kevin.harakamall.ui.screens.dashboard



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
import com.Kevin.harakamall.navigation.ROUT_ABOUT
import com.Kevin.harakamall.navigation.ROUT_HOME
import com.Kevin.harakamall.ui.screens.intent.IntentScreen
import com.Kevin.harakamall.ui.theme.Blue34
import com.Kevin.harakamall.ui.theme.Orange1
import com.Kevin.harakamall.ui.theme.Orange40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
Column(modifier = Modifier.fillMaxSize().background(color = Blue34)) {
    //box
Box() {     //Card
    Card (modifier = Modifier.fillMaxWidth().height(300.dp),
        colors = CardDefaults.cardColors(Orange1),
        shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp)){
        TopAppBar(
            title = { Text(text = "Dashboard Section") },
            navigationIcon = {
                IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Menu, contentDescription = "") }

            }
        )
        Text(text = "Welcome to Harakamall,your one time shop for everything you love.",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 20.sp)


    }
//End of card }
    Card(modifier = Modifier.fillMaxWidth()
        .height(180.dp)
        .align(alignment = Alignment.BottomCenter)
        .offset(y = 90.dp)
        .padding(20.dp, end = 20.dp)) {
        Column(modifier = Modifier.fillMaxSize()) { Text(text = "Welcome to Harakamall,your one time shop for everything you love.", textAlign = TextAlign.Center)  }

        }

}
    //end of box
    Spacer(modifier = Modifier.height(90.dp))
    //Row
    Row (modifier = Modifier.padding(start = 20.dp, end = 20.dp)){


  //card1
  Card (modifier = Modifier.
  clickable { navController.navigate(ROUT_HOME) }.
  width(170.dp).
  height(200.dp).
  padding(20.dp),
      ){
      Column (modifier = Modifier.fillMaxSize(),
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center){
          Image(
              painter = painterResource(R.drawable.home),
              contentDescription = "Home",
              modifier = Modifier.size(100.dp)
          )
          Text(text = "Home", fontSize = 15.sp)
      }

  }//end of card 1
        //card2
        Card (modifier = Modifier.
        clickable { navController.navigate(ROUT_ABOUT)}.
        width(170.dp).
        height(200.dp).
        padding(20.dp),
        ){
            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Image(
                    painter = painterResource(R.drawable.about),
                    contentDescription = "About",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "About", fontSize = 15.sp)
            }
        }
        //end of card2
    }//end of row

    //Row2
    Row (modifier = Modifier.padding(20.dp)) {


        //card1
        Card(
            modifier = Modifier.width(170.dp).height(200.dp).padding(20.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.contacts),
                    contentDescription = "Contacts",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Contact", fontSize = 15.sp)
            }

        }//end of card 1
        //card2
        Card(
            modifier = Modifier.width(170.dp).height(200.dp).padding(20.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.location),
                    contentDescription = "Home",
                    modifier = Modifier.size(100.dp)
                )
                Text(text = "Location", fontSize = 15.sp)
            }
        }
        //end of card2
    }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}