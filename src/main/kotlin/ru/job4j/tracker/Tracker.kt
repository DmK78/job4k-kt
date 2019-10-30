package ru.job4j.tracker

import java.util.ArrayList

class Tracker {
    private val items = ArrayList<Item>()

    fun add(item: Item): Item {
        item.setId(generateId())
        item.setTime(System.currentTimeMillis())
        items.add(item)
        return item
    }

    fun delete(id: Int): Boolean = items.remove(findById(id))

    fun getSize(): Int = items.size


    fun replace(id: Int, item: Item): Boolean {
        var findItem = findById(id)
        if (findItem != null) {
            findItem.setName(item.getName())
            findItem.setDesc(item.getDesc())
            return true
        } else return false
    }

    fun findAll(): List<Item> = items

    fun findByName(key: String): List<Item> = items.filter { it.getName().equals(key) }

    fun findById(id: Int): Item? = items.stream().filter { it.getId() == id }.findFirst().orElse(null)

    private fun generateId(): Int {
        return (Math.random() * 1000).toInt()
    }
}
