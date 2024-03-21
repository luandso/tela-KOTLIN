package br.senai.sp.jandira.trippromm

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripprommTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaLogin()
                }
            }
        }
    }
}

@Composable
fun TelaLogin() {
    Column(
        Modifier.fillMaxHeight()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End

        )
        {

            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(160.dp)
                    .background(
                        Color(0xFF9F35B6),
                        shape = RoundedCornerShape(2.dp, bottomStart = 16.dp)
                    )
            )
        }
        Box(
            modifier = Modifier
                .height(300.dp)
                .width(200.dp)
                .offset(x = 10.dp, y = 120.dp)


        ) {
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 56.sp,
                color = Color(0xFF9F35B6)

            )
            Text(
                text = "Please sign in to coninue.",
                modifier = Modifier
                    .offset(x = 0.dp, y = 70.dp),
                color = Color(0xFF999999)

            )
        }
        Box(
            modifier = Modifier
                .height(230.dp)
                .width(400.dp)


        )
        {
            Text(text = "")


            OutlinedTextField(
                value = "", onValueChange = {},
                Modifier
                    .width(370.dp)
                    .height(60.dp)
                    .offset(x = 10.dp, y = -20.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFF9F35B6),
                        unfocusedContainerColor = Color(0xFFFFFFFF),
                        unfocusedLeadingIconColor = Color(0xFF9F35B6)
                    ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = null,

                        )
                },
                placeholder = {

                    Text(text = "Email")

                }


            )
            OutlinedTextField(value = "", onValueChange = {},
                modifier = Modifier
                    .height(60.dp)
                    .width(370.dp)
                    .offset(x = 10.dp, y = 70.dp),

                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFF9F35B6),
                        unfocusedContainerColor = Color(0xFFFFFFFF),
                        unfocusedLeadingIconColor = Color(0xFF9F35B6)
                    ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = null,

                        )
                },
                placeholder = {

                    Text(text = "Password")

                }

            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(70.dp)
                    .width(150.dp)
                    .offset(x = 240.dp, y = 150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF9F35B6),
                    contentColor = Color(0xFFFFFFFF)
                ),
            ) {


                Text(text = "SIGN IN")
                Image(
                    painter =
                    painterResource(id = R.drawable.seta),
                    contentDescription = "",
                    modifier = Modifier
                        .width(20.dp)
                        .offset(x = 10.dp),
                )
            }
        }

        Row(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(160.dp)
                    .offset(x = 0.dp, y = 130.dp)
                    .background(
                        Color(0xFF9F35B6),
                        shape = RoundedCornerShape(2.dp, topEnd = 16.dp)
                    )

            )
            Text(
                text = "Don't have on account?",
                modifier = Modifier
                    .offset(x = -30.dp)
            )
            Text(
                text = "Sing Up ",
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .offset(x = -20.dp),
                color = Color(0xFF9F35B6),
                fontWeight = FontWeight.Bold
            )
        }


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    TripprommTheme {
        TelaLogin()
    }
}

@Composable
fun TelaCriarConta() {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .height(40.dp)
                .width(160.dp)
                .offset(x = 240.dp)
                .background(
                    color = Color(0xFF9F35B6),
                    shape = RoundedCornerShape(2.dp, bottomStart = 16.dp)
                )
        )
    }
    Box(
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
            .offset(x = 30.dp, y = 60.dp)


    ) {
        Text(
            text = "Sign Up",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF9F35B6),
            modifier = Modifier
                .offset(x = 85.dp, y = 0.dp)

        )
        Text(
            text = "Create a new account",
            modifier = Modifier
                .offset(x = 85.dp, y = 60.dp),
            color = Color(0xFFA3A3A3)


        )

    }
    Box(
        modifier = Modifier


    ) {
        Image(
            painter =
            painterResource(id = R.drawable.fundo), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .offset(x = 0.dp, y = 160.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.perfil), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .offset(x = 0.dp, y = 165.dp)


        )
        Image(
            painter = painterResource(id = R.drawable.camera), contentDescription = "",
            modifier = Modifier
                .height(100.dp)
                .width(30.dp)
                .offset(x = 210.dp, y = 180.dp)

        )
    }

    Column(modifier = Modifier) {
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 240.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor = Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Username")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 260.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor = Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Phone")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 280.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor = Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Email")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 300.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor = Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Password")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = null,

                    )

            }
        )
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier
                .offset(x = 0.dp, y = 295.dp)
        )
        Text(
            text = "Over 18?",
            modifier = Modifier.offset(x = 40.dp, y = 260.dp)
        )


    }
    Button(
        onClick = {},
        modifier = Modifier
            .height(70.dp)
            .width(380.dp)
            .offset(x = 6.dp, y = 580.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF9F35B6),
            contentColor = Color(0xFFFFFFFF)
        )

    )

    {

        Row {
            Text(
                text = "Create Account",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

            )

        }

    }

    Text(
        text = "Already have an account?",
        modifier = Modifier
            .offset(x = 120.dp, y = 670.dp)
    )
    Text(
        text = "Sign In",
        modifier = Modifier
            .offset(x = 320.dp, y = 670.dp)
            .fillMaxWidth(),
        fontWeight = FontWeight.Bold,
        color = Color(0xFF9F35B6)

    )
    Box(
        modifier = Modifier
            .height(40.dp)
            .width(160.dp)
            .offset(y = 740.dp)
            .background(
                color = Color(0xFF9F35B6),
                shape = RoundedCornerShape(2.dp, topEnd = 16.dp)
            )
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaCriarContaPreview() {
    TripprommTheme {
        TelaCriarConta()
    }
}