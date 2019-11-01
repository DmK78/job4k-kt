package ru.job4j.tracker

class StartUi private constructor(): Action {
    override fun add() {
        println("Добавление заявки")
    }

    override fun showAll() {
        println("Печать всех заявок")
    }

    override fun exit() {
        return
    }

    companion object {
        fun init() {
            println("0 - Добавить заявку")
            println("1 - Показать все заявки")
            println("6 - Выйти")
            val startUi = StartUi()
            do {
                var i = readLine()!!.toInt()
                when (i) {
                    0 -> startUi.add()
                    1 -> startUi.showAll()
                    6 -> return
                }
            } while (true)
        }
    }
}

fun main(args: Array<String>) {
    StartUi.init()
}
