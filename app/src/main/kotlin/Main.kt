import utils.Components
fun main(){
     val bannerComponent=Components()

    bannerComponent.banner()
    println("HAMSTER FOOD DISPENSER SYSTEM")
    bannerComponent.banner()

     val manager=HamsterManager()
    var menu= arrayOf("1. Managae Hamster","2. Manage Food Inventory","3. Feeding Operations","4. Reports","0. Exit")
    for(x in menu){
     println(x)
    }
    
    print("Enter choice: ")
    val choice = readln().toInt()

    if (choice == 1) {
        println("You choose: "+menu[0])
          manager.addHamster()
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

