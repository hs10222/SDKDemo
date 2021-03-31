package com.game.sdk.callback

import com.game.sdk.model.SDKUser


/**
 * Created by Pawns on 2021/3/13
 *
 * Copyright (c) 2021 echo All rights reserved.
 */
interface SDKListener {

    fun onLoginSuccess(sdkUser: SDKUser)
}