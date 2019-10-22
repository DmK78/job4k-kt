package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest : StringSpec({
    "1 + 1 = 2" {
        add(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtract(1, 1) shouldBe 0
    }

    "3 * 2 = 6" {
        multiply(3, 2) shouldBe 6
    }

    "8 / 2 = 4" {
        divide(8, 4) shouldBe 2
    }
})