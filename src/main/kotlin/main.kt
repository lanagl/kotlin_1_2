fun main() {
    val previousPurchaseAmount = 3000_00
    val purchaseAmount = 100_00
    val regularCustomer = true

    val costAmount = if (previousPurchaseAmount < 1_000_00) purchaseAmount else
        if (previousPurchaseAmount < 10_000_00) purchaseAmount - 100_00 else purchaseAmount * 95 / 100

    val cost = if (regularCustomer) costAmount * 99 / 100 else costAmount


    println("Стоимость покупки ${cost / 100} рублей ${cost % 100} копеек")

}