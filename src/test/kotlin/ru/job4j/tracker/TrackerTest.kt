package ru.job4j.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TrackerTestKt : StringSpec({

    " whenAddNewItemThenTrackerHasSameItem" {
        val tracker = Tracker()
        val created = System.currentTimeMillis()
        val item = Item("test1", "testDescription", created)

        val itemForId = tracker.add(item)
        val result = tracker.findById(itemForId.getId())
        item.getName() shouldBe result?.getName()
    }

    "whenReplaceNameThenReturnNewName"{
        val tracker = Tracker()
        val item1 = Item("test1", "testDescription1", 123L)
        tracker.add(item1)
        val item2 = Item("test2", "testDescription2", 1234L)

        tracker.replace(item1.getId(), item2)
        tracker.findById(item1.getId())?.getName() shouldBe "test2"
    }
    "whenDeleteItemThenReturnNewArray"{
        val tracker = Tracker()
        val first = Item("test1", "testDescription", 123L)
        val second = Item("test2", "testDescription", 223L)
        val third = Item("test3", "testDescription", 323L)
        tracker.add(first)
        tracker.add(second)
        tracker.add(third)
        tracker.delete(second.getId())
        tracker.getSize() shouldBe 2
        tracker.findById(first.getId()) shouldBe first
        tracker.findById(third.getId()) shouldBe third
    }
    "whenFindAllItemThenShowThree"{
        val tracker = Tracker()
        val first = Item("test1", "testDescription", 123L)
        val second = Item("test2", "testDescription", 223L)
        val third = Item("test3", "testDescription", 323L)
        tracker.add(first)
        tracker.add(second)
        tracker.add(third)
        tracker.findAll().size shouldBe 3
    }
    "whenFindByNameThenShowTwoItems"{
        val tracker = Tracker()
        val first = Item("test1", "testDescription", 123L)
        val second = Item("test2", "testDescription", 223L)
        val third = Item("test1", "testDescription", 323L)
        tracker.add(first)
        tracker.add(second)
        tracker.add(third)
        val result = tracker.findByName("test1")
        result.get(0) shouldBe first
        result.get(1) shouldBe third

    }


})