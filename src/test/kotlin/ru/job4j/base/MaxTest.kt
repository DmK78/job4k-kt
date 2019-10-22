package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxTest : StringSpec({
    "2 2 5 - max is 5"
    max(2, 2, 5) shouldBe 5
    "7 1 1 - max is 7"
    max(7, 1, 1) shouldBe 7
    "2 4 3 - max is 4"
    max(2, 4, 3) shouldBe 4
}
)

