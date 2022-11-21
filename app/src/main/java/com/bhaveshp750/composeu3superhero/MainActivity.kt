package com.bhaveshp750.composeu3superhero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bhaveshp750.composeu3superhero.model.HeroesDataSource
import com.bhaveshp750.composeu3superhero.ui.theme.ComposeU3SuperHeroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeU3SuperHeroTheme {
                // A surface container using the 'background' color from the theme
                SuperHeroApp()
            }
        }
    }
}

@Composable
fun SuperHeroApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) {
        HeroesList(
            heroes = HeroesDataSource.heroes,
            modifier = Modifier
                .padding(it)
        )
    }
}

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(56.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.h1
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeU3SuperHeroTheme {
        SuperHeroApp()
    }
}