package ru.job4j.tracker

import java.util.ArrayList

class Tracker {
    private val items = ArrayList<Item>()

    fun add(item: Item): Item = item?.let {
        it.setId(generateId())
        it.setTime(System.currentTimeMillis())
        items.add(it)
        return it
    }

    fun delete(id: Int): Boolean = items.remove(findById(id))

    fun getSize(): Int = items.size

    fun replace(id: Int, item: Item): Boolean = findById(id)?.let {
        it.setName(item.getName())
        it.setDesc(item.getDesc())
        return true
    } ?: false

    fun findAll(): List<Item> = items

    fun findByName(key: String): List<Item> = items.filter { it.getName().equals(key) }

    fun findById(id: Int): Item? = items.stream().filter { it.getId() == id }.findFirst().orElse(null)

    private fun generateId(): Int {
        return (Math.random() * 1000).toInt()
    }
}
