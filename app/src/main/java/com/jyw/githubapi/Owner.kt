package com.jyw.githubapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.jyw.githubapi.databinding.ActivityOwnerBinding

class Owner : AppCompatActivity() {

    val binding by lazy { ActivityOwnerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("owner", binding.input.text)
            startActivity(intent)
        }
    }
}