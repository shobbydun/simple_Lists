package com.example.simple_lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview=findViewById<ListView>(R.id.listview)
        val jina= arrayOf("victoria","cartia","carine","kirsten","lawrence")
        val majinaadapter:ArrayAdapter<String> =
            ArrayAdapter(this,android.R.layout.simple_list_item_1,jina)
        listview.adapter=majinaadapter

        listview.setOnItemClickListener { adapterView, view, position , id ->
            Toast.makeText(this,"you have pressed"+jina[position],Toast.LENGTH_SHORT).show()
        }
    }

}
