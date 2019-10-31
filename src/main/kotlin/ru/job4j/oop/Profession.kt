package ru.job4j.oop

open class Profession(val professionName: String, val professionDesc: String)

class Doctor(professionName: String, professionDesc: String, var specification: String = "") :
    Profession(professionName, professionDesc)

class CarDriver(professionName: String, professionDesc: String, var license: String = "") :
    Profession(professionName, professionDesc)

class Worker(name: String, surName: String, var profession: Profession)

fun main() {
    val doctor1 = Worker("Ivan", "Ivanov", Doctor("Doctor", "cure people", specification = "dentist"))
    val driver1 = Worker("Semen", "Demchenko", CarDriver("Driver", "drive a car", license = "A"))


}