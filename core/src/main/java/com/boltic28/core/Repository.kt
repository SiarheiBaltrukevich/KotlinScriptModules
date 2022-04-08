package com.boltic28.core

class Repository {

    private var _counter = 0
    val counter: String
        get() = _counter.toString()

    val success = "connected"
}