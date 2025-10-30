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


   
}