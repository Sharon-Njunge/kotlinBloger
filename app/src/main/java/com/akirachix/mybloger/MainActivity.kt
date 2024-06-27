package com.akirachix.mybloger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mybloger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBloger.layoutManager = LinearLayoutManager(this)
        displayBlogger()

    }
    fun displayBlogger(){
        val blogger1 = Bloger("Mark", "The First", "January 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger2 = Bloger("Joe", "The End", "february 2020", "If you're trying to make your website accessible, WAVE is a great first port of call. ")
        val blogger3 = Bloger("Casey", "The Middle", "March 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger4 = Bloger("Alice", "Before", "April 2020", "If you're trying to make your website accessible, WAVE is a great first port of call. ")
        val blogger5 = Bloger("Anna", "After", "May 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger6 = Bloger("Mark", "The First", "January 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger7 = Bloger("Joe", "The End", "february 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger8 = Bloger("Casey", "The Middle", "March 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger9 = Bloger("Alice", "Before", "April 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger10 = Bloger("Anna", "After", "May 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger11 = Bloger("Mark", "The First", "January 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger12 = Bloger("Joe", "The End", "february 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger13 = Bloger("Casey", "The Middle", "March 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger14 = Bloger("Alice", "Before", "April 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")
        val blogger15 = Bloger("Anna", "After", "May 2020", "If you're trying to make your website accessible, WAVE is a great first port of call.")

        val bloggerList = listOf(blogger1, blogger2, blogger3, blogger4, blogger5,blogger6, blogger7, blogger8, blogger9,
            blogger10, blogger11, blogger12,blogger13, blogger14, blogger15)
        val bloggerAdapter = BlogerAdapter(bloggerList)
        binding.rvBloger.adapter = bloggerAdapter
    }
}








