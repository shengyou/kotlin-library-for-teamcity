package io.kraftsman

class Calculator {
    fun add(x: Int, y: Int): Double {
        return (x + y).toDouble()
    }

    fun add(x: Double, y: Double): Double {
        return (x + y)
    }

    fun div(x: Int, y: Int): Double {
        return (x / y).toDouble()
    }

    fun div(x: Double, y: Double): Double {
        return x / y
    }
}
