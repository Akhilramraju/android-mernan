package com.android.mernan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.mernan.models.Repo
import com.android.mernan.reposlist.ReposAdapter

class MainActivity : AppCompatActivity() {

    private val adapter = ReposAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list : RecyclerView = findViewById(R.id.list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter


        val sampleData = listOf(
                Repo("repo 1"),
                Repo("repo 2"),
                Repo("repo 3"),
                Repo("repo 4"),
                Repo("repo 5"),
                Repo("repo 5"),
                Repo("repo 6"),
                Repo("repo 7"),
                Repo("repo 8"),
                Repo("repo 9"),
                Repo("repo 10")

        )
        adapter.submitList(sampleData)


    }
}