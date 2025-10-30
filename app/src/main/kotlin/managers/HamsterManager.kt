import models.Hamster
open class HamsterManager(){


fun addHamster(): Hamster {
    println("Add a new hamster...")
    print("id: "); val id = readln().toInt()
    print("name: "); val name = readln()
    print("age: "); val age = readln().toInt()
    print("weight: "); val weight = readln().toFloat()
    print("breed: "); val breed = readln()

    return Hamster(id = id, name = name, age = age, weight = weight, breed = breed)
}



}

