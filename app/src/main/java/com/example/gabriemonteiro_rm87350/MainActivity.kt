package com.example.gabriemonteiro_rm87350

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crie uma lista de objetos Serie com os detalhes necessários (parte g)
        val seriesList = mutableListOf(
            Serie("Nome1", "Genero1", true),
            Serie("Nome2", "Genero2", true),
            Serie("Nome3", "Genero3", false),
            Serie("Nome4", "Genero4", true)
        )

        // Configure o RecyclerView com um LinearLayoutManager e o adapter (partes f e b)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SeriesAdapter(seriesList)
    }
}
