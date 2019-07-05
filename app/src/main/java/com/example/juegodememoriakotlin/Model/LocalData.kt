package com.example.juegodememoriakotlin.Model

import com.example.juegodememoriakotlin.R

class LocalData {

    companion object{

        val listFullCards = ArrayList<CardItem>()

        init {

            listFullCards.add(CardItem(R.drawable.ic_car, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_flight,R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_laptop_mac, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_sd_card, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_train, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_headset, R.drawable.ic_empty, false))

            listFullCards.add(CardItem(R.drawable.ic_car, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_flight, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_laptop_mac, R.drawable.ic_empty,false))
            listFullCards.add(CardItem(R.drawable.ic_sd_card, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_train, R.drawable.ic_empty, false))
            listFullCards.add(CardItem(R.drawable.ic_headset, R.drawable.ic_empty, false))

            listFullCards.shuffle()
        }

        fun fillArray(): ArrayList<CardItem>{
            return listFullCards
        }
    }
}