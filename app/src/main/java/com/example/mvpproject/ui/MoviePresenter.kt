package com.example.mvpproject.ui

import com.example.mvpproject.pojo.DataModel

class MoviePresenter(var view: ViewModel) {


    //private lateinit var view: ViewModel

    fun getDataFromModel(): DataModel {
        val dataModel = DataModel("omar", "bad", 0)
        return dataModel
    }

    fun getName() {
        view.getMovieName(getDataFromModel().name)
    }

}