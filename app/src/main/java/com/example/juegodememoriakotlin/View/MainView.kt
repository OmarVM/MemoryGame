package com.example.juegodememoriakotlin.View

import com.example.juegodememoriakotlin.Model.CardItem

interface MainView {

        fun requestData(listCards: ArrayList<CardItem>)
        fun cardClickOk(idImgCard: Int)
        fun cardClickFail()
        fun sendActionMain(cardOption: Int, indexArray: Int)


}