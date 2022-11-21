package com.meli.pokedex


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.meli.pokedex.ui.PokemonViewModel

@Suppress("UNCHECKED_CAST")
class PokemonViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PokemonViewModel() as T
    }
}