package ru.job4j.base


fun main(args: Array<String>) {
    val names = arrayOfNulls<String>(10)
    names[0] = "Petr Arsentev"
    names[3] = "Dmitry Kolganov"
    val defragmentArray = defragment(names)
    for (name in defragmentArray) {
        println(name + " " + name?.length)
    }


}




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