package ru.job4j.oop

import java.util.NoSuchElementException

class SimpleLinkedList<T> : Iterable<T> {
    private var first: Node<T>? = null
    private var last: Node<T>? = null

    fun add(value: T) {
        val newNode = Node<T>(value)
        if (first == null) {
            first = newNode
            last = newNode
        } else {
            last?.next = newNode
            last = newNode
        }
    }

    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T> {
        private var current: Node<T>? = null

        override fun hasNext(): Boolean {
            var result = if (current == null && first != null) {
                true
            } else {
                current?.next != null
            }
            return result
        }

        override fun next(): T {
            var result: Node<T>?
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            if (current == null && first != null) {
                current = first
                result = current
            } else {
                result = current?.next
                current = current?.next
            }
            return result!!.value
        }
    }

    class Node<K>(val value: K, var next: Node<K>? = null)
}

fun main() {
    val list = SimpleLinkedList<String>()
    list.add("Kotlin")
    list.add("is the")
    list.add("best!")
    for (value in list) {
        print("$value ")
    }
}