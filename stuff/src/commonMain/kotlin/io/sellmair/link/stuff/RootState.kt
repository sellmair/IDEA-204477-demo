package io.sellmair.link.stuff

import io.sellmair.link.model.Myself


sealed class RootState {
    data class Login(val state: Myself) : RootState()
    data class Main(val state: Myself) : RootState()
}




