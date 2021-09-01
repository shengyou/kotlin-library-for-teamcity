package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FunSpec({

    context("A Calculator") {
        test("Should return 2 when 1 + 1") {
            val calculator = Calculator()
            calculator.add(1, 1) shouldBe 2
        }
    }

})
