package ru.job4j.base

fun draw(size: Int) {

    for (row in 0 ..  size) {
        for (cell in 0 ..  size) {
            if(row==cell){
                print("X")
            } else if(row==size-cell){
                print("X")
            }else print(" ")
            if(cell==size){
                println()
            }
        }
    }
}

fun main() {
    draw(25)
}