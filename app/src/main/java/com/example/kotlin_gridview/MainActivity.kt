package com.example.kotlin_gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridView) as GridView

        val arrayListImage = ArrayList<Int>()

        arrayListImage.add(R.drawable.cupcake)
        arrayListImage.add(R.drawable.donut)
        arrayListImage.add(R.drawable.honeycomb)
        arrayListImage.add(R.drawable.jellybean)
        arrayListImage.add(R.drawable.lollipop)
        arrayListImage.add(R.drawable.nougat)
        arrayListImage.add(R.drawable.cupcake)
        arrayListImage.add(R.drawable.jellybean)

        val name = arrayOf("Cupcake", "Donut", "HoneyComb", "JellyBean",
        "Lollipop", "Nougat", "Cupcake", "JellyBean")

        val customAdapter = CustomAdapter(this@MainActivity, arrayListImage, name)

        //Set Adapter to ArrayList

        gridView.adapter = customAdapter

        //On Click for GridView Item

        gridView.setOnItemClickListener { adapterView, parent, position, l ->
            Toast.makeText(this@MainActivity, "Click on : " + name[position], Toast.LENGTH_LONG).show()
        }
    }
}