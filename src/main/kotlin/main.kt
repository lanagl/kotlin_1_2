fun main(){
    val amount = 30020_00
    val percentCommission = amount * 75 / 100_00

    val commission = if (percentCommission < 35_00) 35_00 else percentCommission

    println("${commission / 100} рублей ${commission % 100} копеек")

}