package com.game.sdk

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.game.sdk.ui.login.LoginFragment


/**
 * Created by Pawns on 2021/3/12
 *
 * Copyright (c) 2021 echo All rights reserved.
 */
class GameSDK private constructor() {

    companion object {
        val instance = Holder.holder
    }
    private object Holder {
        val holder = GameSDK()
    }

    fun init() {

    }

    fun login(activity: AppCompatActivity) {
        val fragmentManager : FragmentManager = activity.supportFragmentManager
        val loginFragment = LoginFragment()
        loginFragment.show(fragmentManager,"TAG")
    }
}