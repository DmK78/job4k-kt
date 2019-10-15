package ru.job4j.base.ru.job4j.base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun divide(first: Int, second: Int): Int {
    return first / second
}

fun multiply(first: Int, second: Int): Int {
    return first * second
}

fun main(args: Array<String>) {
    val a = 5
    val b = 6
    print("$a + $b = ${add(a, b)}\n")
    print("$a - $b = ${subtract(a, b)}\n")
    print("$a / $b = ${divide(a, b)}\n")
    print("$a * $b = ${multiply(a, b)}\n")

}