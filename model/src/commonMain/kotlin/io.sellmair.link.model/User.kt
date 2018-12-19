package io.sellmair.link.model

data class User(
    val id: Id,
    val name: Name,
    val email: Email) {
    data class Id(val value: String)
    data class Name(val value: String)
}


