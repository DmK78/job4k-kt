package ru.job4j.base

fun draw(size: Int) {

    for (value in 0 until size) {
        val str = if (value < size / 2) "".padStart(value) + "X" + "X".padStart((size - value * 2) - 1)
        else if (value > size / 2) "X".padStart(size - value) + "X".padStart((value - size / 2) * 2)
        else "".padStart(
            value
        ) + "X"
        println(str)
    }

}

fun main() {
    draw(11)
}