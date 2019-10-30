package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ArraysTest : StringSpec({
    "defrag Array index3 should be index0" {
        var names = arrayOf(null, null, "Ivan", null, null)
        var expNames = arrayOf("Ivan", null, null, null, null)
        defragment(names) shouldBe expNames
    }

    "defrag Array index234 wshould be index012" {
        var names = arrayOf(null, null, "Ivan", "Ivan1", "Ivan2")
        var expNames = arrayOf("Ivan", "Ivan1", "Ivan2", null, null)
        defragment(names) shouldBe expNames
    }


})