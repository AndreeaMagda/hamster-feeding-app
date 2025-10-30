 data class Hamster(
    val id: Int,
    val name: String,
    val age: Int,
    val weight: Float,
    val breed: String
)


class HamsterManager(){


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
fun main(){
    println("=======================================")
    println("    HAMSTER FOOD DISPENSER SYSTEM")
    println("=======================================")

   
    var menu= arrayOf("1. Managae Hamster","2. Manage Food Inventory","3. Feeding Operations","4. Reports","0. Exit")
    println(menu[0])
    println(menu[1])
    println(menu[2])
    println(menu[3])
    println(menu[4])
    
    print("Enter choice: ")
    val choice = readln().toInt()

    if (choice == 1) {
        println("You choose: "+menu[0])
    } else if(choice==2){
         println("You choose: "+menu[1])
    }
    else if(choice==3){
         println("You choose: "+menu[2])
    }else if(choice==3){
         println("You choose: "+menu[3])
    }else if(choice==4){
         println("You choose: "+menu[4])
    }

   val manager=HamsterManager()
 manager.addHamster()

   
}

