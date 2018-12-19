package io.sellmair.link

import android.app.Application
import io.sellmair.link.model.Email
import io.sellmair.link.model.Myself
import io.sellmair.link.model.Token
import io.sellmair.link.model.User
import io.sellmair.link.stuff.RootState

class App : Application() {
    private val state = RootState.Login(
            Myself(
                token = Token(""),
                user = User(
                    id = User.Id(""),
                    name = User.Name(""),
                    email = Email(""))))

}