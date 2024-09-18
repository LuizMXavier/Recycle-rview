package com.devspace.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this,2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }
    }
}

val contacts = listOf(
    Contact(
         "Maria",
        "(55) 11 9854-9857",
        R.drawable.sample1
    ),
    Contact(
        "Pedro",
        "(55) 11 9854-8975",
        R.drawable.sample2
    ),
    Contact(
        "Luiza",
        "(55) 11 9457-9857",
        R.drawable.sample5
    ),
    Contact(
        "Carol",
        "(55) 11 9543-4587",
        R.drawable.sample3
    ),
    Contact(
        "Ana",
        "(55) 11 9854-5487",
        R.drawable.sample4
    ),
    Contact(
        "Aline",
        "(55) 11 9743-9857",
        R.drawable.sample5
    ),
    Contact(
        "Suzana",
        "(55) 11 9854-9857",
        R.drawable.sample6
    ),
    Contact(
        "Sofia",
        "(55) 11 9421-9857",
        R.drawable.sample7
    ),
    Contact(
        "Iuri",
        "(55) 11 9657-4433",
        R.drawable.sample8
    ),
    Contact(
        "Felipe",
        "(55) 11 9854-9857",
        R.drawable.sample9
    ),
    Contact(
        "Augusto",
        "(55) 11 9643-9857",
        R.drawable.sample10
    ),
    Contact(
        "Beatriz",
        "(55) 11 9324-5478",
        R.drawable.sample11
    ),
    Contact(
        "Augusto",
        "(55) 11 9258-9857",
        R.drawable.sample12
    ),
    Contact(
        "Luiza",
        "(55) 11 9147-1234",
        R.drawable.sample13
    ),
)