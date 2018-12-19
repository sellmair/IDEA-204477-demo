package io.sellmair.link

import android.app.Application
import io.sellmair.link.model.Email
import io.sellmair.link.model.Myself
import io.sellmair.link.model.Token
import io.sellmair.link.model.User
import io.sellmair.link.stuff.RootState
import io.sellmair.quantum.Owner
import io.sellmair.quantum.internal.invoke

class App : Application() {
    private val root: Owner<RootState> = Owner(
        initial = RootState.Login(
            Myself(
                token = Token(""),
                user = User(
                    id = User.Id(""),
                    name = User.Name(""),
                    email = Email("")))))

}