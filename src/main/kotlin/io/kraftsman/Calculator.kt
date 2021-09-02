package io.kraftsman

/**
 * A simple Calculator class
 *
 * This class can help you calculate simple `Int` or `Double` number using `add`, `sub`, `multiple`, `div`.
 *
 */
class Calculator {

    /**
     * Add two `Int` and return `Double`
     *
     * @param x
     * @param y
     * @return the sum of two Int
     */
    fun add(x: Int, y: Int): Double {
        return (x + y).toDouble()
    }

    /**
     * Add two `Double` and return `Double`
     *
     * @param x
     * @param y
     * @return the sum of two Double
     */
    fun add(x: Double, y: Double): Double {
        return (x + y)
    }

    /**
     * Sub two `Double` and return `Double`
     *
     * @param x
     * @param y
     * @return the sub result of two Int
     */
    fun sub(x: Int, y: Int): Double {
        return (x - y).toDouble()
    }

    /**
     * Sub two `Double` and return `Double`
     *
     * @param x
     * @param y
     * @return the sub result of two Double
     */
    fun sub(x: Double, y: Double): Double {
        return x - y
    }

    /**
     * Multiple two `Int` and return `Double`
     *
     * @param x
     * @param y
     * @return the multiple result of two Int
     */
    fun multiple(x: Int, y: Int): Double {
        return (x * y).toDouble()
    }

    /**
     * Multiple two `Double` and return `Double`
     *
     * @param x
     * @param y
     * @return the multiple result of two Double
     */
    fun multiple(x: Double, y: Double): Double {
        return x * y
    }

    /**
     * Div two `Int` and return `Double`
     *
     * @param x
     * @param y
     * @return the div result of two Int
     */
    fun div(x: Int, y: Int): Double {
        return (x / y).toDouble()
    }

    /**
     * Div two `Double` and return `Double`
     *
     * @param x
     * @param y
     * @return the div result of two Double
     */
    fun div(x: Double, y: Double): Double {
        return x / y
    }
}
