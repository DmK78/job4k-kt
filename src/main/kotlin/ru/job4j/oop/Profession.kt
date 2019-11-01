package ru.job4j.oop

open class Profession(val professionName: String, val professionDesc: String){
    open fun action(){
        println("do some action")
    }
}

class Doctor(professionName: String, professionDesc: String, var specification: String = "") :
    Profession(professionName, professionDesc){
    init {
        println("doctor was created")
    }
    override fun action() {
        //super.action()
        println("doctor cure people")
    }
}

class CarDriver(professionName: String, professionDesc: String, var license: String = "") :
    Profession(professionName, professionDesc){
    init {
        println("driver was created")
    }
    override fun action() {
        //super.action()
        println("driver drive the car")
    }
}

class Worker(name: String, surName: String, var profession: Profession)

fun main() {
    val doctor1 = Worker("Ivan", "Ivanov", Doctor("Doctor", "cure people", specification = "dentist"))
    doctor1.profession.action()
    val driver1 = Worker("Semen", "Demchenko", CarDriver("Driver", "drive a car", license = "A"))
    driver1.profession.action()



}