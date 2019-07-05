package com.example.juegodememoriakotlin.View

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import com.example.juegodememoriakotlin.Model.CardInterator
import com.example.juegodememoriakotlin.Presenter.CardAdapter
import com.example.juegodememoriakotlin.Model.CardItem
import com.example.juegodememoriakotlin.Presenter.MainPresenter
import com.example.juegodememoriakotlin.Presenter.Presenter
import com.example.juegodememoriakotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView{

    private var mAdapter: CardAdapter? = null
    private lateinit var mainPresenter: Presenter
    private lateinit var context: Context
    private var listCardsFill = ArrayList<CardItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this
        mainPresenter = Presenter(this)
    }


    override fun requestData(listCards: ArrayList<CardItem>) {
        this.listCardsFill = listCards
        mAdapter = CardAdapter(listCardsFill, context, this)
        grid_main_cards.adapter = mAdapter
    }

    override fun cardClickOk(idImgCard: Int) {
        Log.d("TAG", "Click en item: $idImgCard")

        for (card in listCardsFill){
            if(card.imgInit.equals(idImgCard)){
                card.isVisible = true
            }
        }
        mAdapter!!.notifyDataSetChanged()
    }

    override fun cardClickFail() {
        Log.d("TAG", "Waiting...")
        var handler = Handler()
        handler.postDelayed(Runnable {
            mAdapter!!.notifyDataSetChanged()
        }, 2000)

        var timeLeft: CountDownTimer = object : CountDownTimer(2000,10){
            override fun onFinish() {
                show_chronometer.setText("2000")
            }

            override fun onTick(p0: Long) {
                show_chronometer.setText(p0.toString())
            }
        }
        timeLeft.start()

    }


    override fun sendActionMain(cardOption: Int, indexArray: Int) {
        mainPresenter.validateClikcs(cardOption, indexArray)
    }
}
