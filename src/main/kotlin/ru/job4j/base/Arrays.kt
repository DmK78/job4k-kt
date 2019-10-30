package ru.job4j.base

fun defragment(array: Array<String?>): Array<String?> {
    var result = arrayOfNulls<String>(array.size)


    var count = 0
    for (value in array) {
        if (!value.isNullOrBlank()) {
            result[count] = value;
            count++
        }
    }
    return result
}