package io.kraftsman

class Calculator {
    fun add(x: Int, y: Int): Double {
        return (x + y).toDouble()
    }

    fun add(x: Double, y: Double): Double {
        return (x + y)
    }

    fun sub(x: Int, y: Int): Double {
        return (x - y).toDouble()
    }

    fun sub(x: Double, y: Double): Double {
        return x - y
    }
}
