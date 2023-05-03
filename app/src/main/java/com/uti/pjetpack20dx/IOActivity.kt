package com.uti.pjetpack20dx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.PJetpack20DXTheme

class IOActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    buat variabel untuk object
                    var txt_nilai1 by remember {
                        mutableStateOf("")
                    }

//                    buat column
                    Column(modifier = Modifier.padding(10.dp)) {
//                    buat input 1
                        OutlinedTextField(label = {
                                          Text(text = "Isi Nilai 1")
                        },value = txt_nilai1, onValueChange = {
                                                              txt_nilai1 = it
                        }, modifier = Modifier.fillMaxWidth(),
                            colors = TextFieldDefaults.textFieldColors
                                (focusedIndicatorColor = Color.Red,
                            containerColor = Color.Transparent,
                            focusedLabelColor = Color.Blue, 
                            cursorColor = colorResource(id = R.color.color_label)))

                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PJetpack20DXTheme {
//        Greeting("Android")
    }
}