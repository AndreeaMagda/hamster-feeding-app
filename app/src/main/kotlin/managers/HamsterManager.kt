
import java.io.File
import models.Hamster

open class HamsterManager() {
    val hamsters: MutableList<Hamster> = mutableListOf()

   
    fun addHamster(): Hamster {
        println("Add a new hamster...")
        print("id: ")
        val id = readln().toInt()
        print("name: ")
        val name = readln()
        print("age: ")
        val age = readln().toInt()
        print("weight: ")
        val weight = readln().toFloat()
        print("breed: ")
        val breed = readln()

        val hamster = Hamster(id = id, name = name, age = age, weight = weight, breed = breed)
        hamsters.add(hamster)
        return hamster
    }

    fun deleteHamsterById(): Hamster {
        println(hamsters)
        print("Enter Hamster ID to delete: ")
        val idToDelete = readln().toInt()
        val hamsterToDelete = hamsters.find { it.id == idToDelete }
        hamsters.remove(hamsterToDelete)
        println("Deleted Hamster: $hamsterToDelete")

        return hamsterToDelete!!
    }
}
