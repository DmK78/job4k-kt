package ru.job4j.base


fun max(first: Int, second: Int, third: Int) =
    if (first > second && first > third) first else (if (second > third) second else third)

fun main() {
    val one = 2
    val two = 4
    val  three = 6
    val rsl = max(one, two,three)
    println("max from $one and $two and $three is $rsl")
}