package com.game.sdk.model


/**
 * Created by Pawns on 2021/3/12
 *
 * Copyright (c) 2021 echo All rights reserved.
 */
class SDKUser {
    private lateinit var mUserId : String
    private lateinit var mUserName : String

    fun setUserId(userId : String) {
        this.mUserId = userId
    }

    fun getUserId() : String {
        return this.mUserId
    }
}