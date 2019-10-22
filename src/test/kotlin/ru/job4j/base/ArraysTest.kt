package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ArraysTest : StringSpec({
    "defrag Array index3 should be index0" {
        var names = arrayOfNulls<String>(5)
        names[3] = "Ivan"
        var expNames = arrayOfNulls<String>(5)
        expNames[0]="Ivan"
        defragment(names) shouldBe expNames
    }

    "defrag Array index234 wshould be index012" {
        var names = arrayOfNulls<String>(5)
        names[2] = "Ivan"
        names[3] = "Ivan1"
        names[4] = "Ivan2"
        var expNames = arrayOfNulls<String>(5)
        expNames[0]="Ivan"
        expNames[1]="Ivan1"
        expNames[2]="Ivan2"
        defragment(names) shouldBe expNames
    }


})