val storeItem=
    mutableListOf<item>()
val itemCategories=
    mutableListOf<String>()

fun main() {
    var userinput: String
    do {
        println("what would you like to do?")
        println("1.Add an item to the store")
        println("2.Add an object item category")
        println("3.Sell an item")
        println("4.exit store")
        println("5.exit application")

        userinput = readline() ?: ""
        when (userInput) {
            "1" -> additem()
            "2" -> additemcategory()
            "3" -> sellitem()
            "4" -> exitstore()
            "5" -> exitApplication()
            else -> println("Invalid input.Please try again.")
        }

    } while (userInput != "5")

}
fun additem(){
    println("Enter the name of the item:")
    val itemName=readline()?:""
    println("Enter the quantity of the item:")val itemQuantity=
        readline()?.toIntOrNull():0
    val newItem=item(ItemName,itemCategory,itemQuantity)
    storeItem.add(newItem)
    println("Item added sucessfully")
}
fun addItemCategory(){
    printlln("Enter the name oof the category:")
    val category=readline()?:""
    itemCategories.add(category)
    println("category added sucessfully!")
}
fun sellItem(){
    println("Enter the name of the item you want to sell:")
    val itemName=readline()?:""
    val item=storeItem.find{it.name==itemName}
    if(item!=null){
        if(item.quantity>0) {
            item.quantity--
            println("item sold sucessfully!")
        }else{
            println("Sorry,this item is out ofstock.")

        }else{
            println("Item not found in the store.")

        }

    }
 fun exitStore(){
     println("Exiting store..")
 }
}
