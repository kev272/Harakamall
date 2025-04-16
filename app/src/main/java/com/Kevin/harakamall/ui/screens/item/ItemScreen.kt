package com.Kevin.harakamall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Kevin.harakamall.R
import com.Kevin.harakamall.navigation.ROUT_INTENT
import com.Kevin.harakamall.ui.theme.Orange40
import com.Kevin.harakamall.ui.theme.White50

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        //TopApp bar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Orange40,
                titleContentColor = White50,
                navigationIconContentColor = White50,
                actionIconContentColor = White50
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }
                IconButton(onClick = {navController.navigate(ROUT_INTENT)}) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = ""
                    )
                }

            }
        )
        //end of topapp bar
        Image(
            painter = painterResource(R.drawable.tree),
            contentDescription = "Home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //Search bar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            placeholder = { Text(text = "Search...") }
        )
        //End of search bar
        Spacer(modifier = Modifier.height(20.dp))
//vertical scroll code
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){//Row
            Row() {
                Image(
                    painter = painterResource(R.drawable.car2),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(130.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Ferrari",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Sports car",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.200000",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500000"
                    )


                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Button(onClick = {}) { Text(text = "Add to cart") }



                }
            }
            Row() {
                Image(
                    painter = painterResource(R.drawable.car2),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(130.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Ferrari",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Sports car",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.200000",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500000"
                    )


                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Button(onClick = {}) { Text(text = "Add to cart") }



                }
            }
            Row() {
                Image(
                    painter = painterResource(R.drawable.car2),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(130.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Ferrari",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Sports car",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.200000",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500000"
                    )


                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Button(onClick = {}) { Text(text = "Add to cart") }



                }
            }
            Row() {
                Image(
                    painter = painterResource(R.drawable.car2),
                    contentDescription = "Home",
                    modifier = Modifier.width(200.dp).height(130.dp)
                        .clip(shape = RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = "Ferrari",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Sports car",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.200000",
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Ksh.1500000"
                    )


                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }
                    Button(onClick = {}) { Text(text = "Add to cart") }



                }
            }

            //End Row  }

    }

}
@Preview(showBackground = true)
@Composable
fun ItemScreenPreview() {
    ItemScreen(rememberNavController())

}}