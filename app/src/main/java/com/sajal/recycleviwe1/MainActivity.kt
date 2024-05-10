package com.sajal.recycleviwe1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adaptor: MyAdaptor
    private lateinit var itemList:List<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        itemList=generateItemList()

        adaptor= MyAdaptor(itemList)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adaptor

    }
    private fun generateItemList():List<String>{
        val items= mutableListOf<String>()
        items.add("Alice")
        items.add("Bob")
        items.add("Charlie")
        items.add("David")
        items.add("Eva")
        items.add("Frank")
        items.add("Grace")
        items.add("Henry")
        items.add("Ivy")
        items.add("Jack")
        items.add("Katie")
        items.add("Leo")
        items.add("Mia")
        items.add("Noah")
        items.add("Olivia")
        items.add("Peter")
        items.add("Quinn")
        items.add("Rachel")
        items.add("Sam")
        items.add("Taylor")
        items.add("Ursula")
        items.add("Victor")
        items.add("Wendy")
        items.add("Xander")
        items.add("Yasmin")
        return items
    }
}
