package com.game.sdk.ui.login

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.game.sdk.R
import com.game.sdk.ui.BaseFragment


/**
 * Created by Pawns on 2021/3/12
 *
 * Copyright (c) 2021 echo All rights reserved.
 */
class LoginFragment : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.login_fragment,container,false)
        initView(view)
        return view
    }

    fun initView(view: View) {
        val imClose = view.findViewById<ImageView>(R.id.im_close)
        imClose.setOnClickListener { dismiss() }
    }
}