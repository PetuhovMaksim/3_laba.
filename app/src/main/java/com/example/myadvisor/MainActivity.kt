package com.example.myadvisor

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adviceList = listOf(
            Advice("Террария", R.drawable.terraria,
                "Terraria — приключенческая песочница с элементами платформера и видом сбоку."),
            Advice("ПАБГ мобайл", R.drawable.pubgm,
                "PUBG (Playerunknowns Battlegrounds) — это шутер в жанре «Королевская битва»," +
                        " в котором до 100 игроков сражаются друг с другом."),
            Advice("Idle Slayer", R.drawable.idle_slayer,
                "Idle Slayer — игра в жанре кликер, в которой игрок управляет бесстрашным охотником на монстров."),
            Advice("Шашки", R.drawable.checkers,
                "Шашки — логическая настольная игра для двух игроков," +
                        " в которой фишки передвигаются определённым образом по клеткам шашечной доски. ")
        )

        findViewById<RecyclerView>(R.id.adviceList).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdviceAdapter(adviceList)
        }
    }
}
