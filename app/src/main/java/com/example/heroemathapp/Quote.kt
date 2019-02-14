package com.example.heroemathapp

class Quote{

    private val quotes = arrayOf("Great Job.... Now its time to be a hero thanks to your help.",
        "Way to Go....Now off into the night to save the day", "Keep it up.....We need more heroes like you",
        "Lets do what real heroes do....Good job")

    private val badQuotes = arrayOf("Ha Ha Ha....Wrong answer hero boy. See you later PJ pest.", "Hey PJ Pest, great job with that wrong answer.",
        "PJ Pest go home and try again, some hero you are.")

    fun getString() : String{
        val random = (0..(quotes.size - 1)).random()
        return quotes[random]
    }

    fun getBadString() : String{
        val random = (0..(badQuotes.size - 1)).random()
        return badQuotes[random]
    }
}