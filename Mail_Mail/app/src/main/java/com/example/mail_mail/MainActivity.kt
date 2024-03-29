package com.example.mail_mail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclers = findViewById<RecyclerView>(R.id.emailsRv)
        emails = EmailFetcher.getEmails()
        val emailadapt = EmailAdapter(emails)
        recyclers.adapter = emailadapt;
        recyclers.layoutManager = LinearLayoutManager(this)
    }
}