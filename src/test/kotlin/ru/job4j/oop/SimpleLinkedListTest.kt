package ru.job4j.oop

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.base.defragment

internal class SimpleLinkedListTest : StringSpec({
    "linkedListShouldHave2Lenght" {
        var list = SimpleLinkedList<String>()
        list.add("Hello")
        list.add("Kotlin")
        var count: Int = 0
        for (value in list) {
            count++
        }
        count shouldBe 2
    }

    "linkedListShouldHaveStartAndEndValues" {
        var list = SimpleLinkedList<String>()
        list.add("Start")
        list.add("and")
        list.add("again")
        list.add("Start!")
        var count: Int = 0
        for (value in list) {
            when(count++){
                0->value shouldBe "Start"
                3->value shouldBe "Start!"
            }
        }
    }


})