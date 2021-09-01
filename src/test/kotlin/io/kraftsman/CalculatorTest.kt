package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FunSpec({

    context("A Calculator") {

        context("Can compatible with Int and Double when calculate") {
            test("Should return 2.0 when 1 + 1") {
                val calculator = Calculator()
                calculator.add(1, 1) shouldBe 2.0
            }
            test("Should return 4.0 when 2.0 + 2.0") {
                val calculator = Calculator()
                calculator.add(2.0, 2.0) shouldBe 4.0
            }
        }

    }

})
