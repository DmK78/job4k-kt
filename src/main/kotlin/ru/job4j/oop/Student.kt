package ru.job4j.oop

class Student(var name: String = "") {
    var surName: String = ""
    var email: String = ""
    var phone: String = ""

    constructor(name: String, surName: String) : this(name) {
        this.surName = surName
    }

    constructor(name: String, surName: String, email: String) : this(name,surName) {

        this.email = email
    }

    constructor(name: String, surName: String, email: String, phone: String) : this(name,surName,email) {
        this.phone = phone
    }

    override fun toString(): String {
        return "Student(name='$name', surName='$surName', email='$email', phone='$phone')"
    }


}


fun main(args: Array<String>) {

    val student = Student("Ivan")
    val student1 = Student("Ivan", "Ivanov")
    val student2 = Student("Ivan", "Ivanov", "ivan@mail.ru")
    val student3 = Student("Ivan", "Ivanov", "ivan@mail.ru", "12345")
    println(student.toString())
    println(student1.toString())
    println(student2.toString())
    println(student3.toString())

}