fun main() {
    val itemPrice = 100_00
    val itemCount = 11
    val isMusicLover = false

    var totalPrice = itemPrice * itemCount
    val discount: Int =
        if (totalPrice <= 1000_00) 0
        else if (totalPrice <= 10000_00) 100_00
        else (totalPrice * .05).toInt()
    totalPrice -= discount
    if (isMusicLover) totalPrice = (totalPrice * 0.99).toInt()

    println(totalPrice)
}