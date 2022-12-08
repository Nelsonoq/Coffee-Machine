package machine

fun main() {
    println("Write how many cups of coffee you will need:")

    val numberCoffees = readln().toInt()

    val sumWater = 200 * numberCoffees
    val sumMilk = 50 * numberCoffees
    val sumCoffeeBeans = 15 * numberCoffees

    println("For $numberCoffees cups of coffee you will need:")
    println("$sumWater ml of water\n" +
            "$sumMilk ml of milk\n" +
            "$sumCoffeeBeans g of coffee beans")
}
