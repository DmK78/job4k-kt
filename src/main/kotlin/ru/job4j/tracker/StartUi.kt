package ru.job4j.tracker

class StartUi : Action {
    fun init() {
        println("0 - Добавить заявку")
        println("1 - Показать все заявки")
        println("6 - Выйти")
        do {
            var i = readLine()!!.toInt()
            when (i) {
                0 -> add()
                1 -> showAll()
                6 -> exit()
            }
        } while (true)
    }

    override fun add() {
        println("Добавление заявки")
    }

    override fun showAll() {
        println("Печать всех заявок")
    }

    override fun exit() {
        System.exit(0)
    }
}

fun main() {
    StartUi().init()
}
