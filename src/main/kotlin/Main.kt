fun main(args: Array<String>) {
    println("Введите часы:")
    val hours = readln().toInt()
    println("Введите тариф:")
    val rate = readln().toInt()
        open class Work(hours: Int, rate: Int, ) {
            fun getInfo(): String {
            return "Количество часов работы: $hours" +
                    "Тариф оплаты за час работы: $rate"
         }

             fun calculateTotalCost(): Int {
            return hours *  rate
            }
        }
    val work = Work(hours, rate)
    println("Общая стоимость работы: ${work.calculateTotalCost()}")

    println("Введите подоходный налог:")
    val  incomeTax= readln().toDouble()
    class Tax(hours: Int, rate: Int,  incomeTax: Double) : Work(hours, rate){
        fun calculateSalaryAfterTax(): Double {
            val totalCost = calculateTotalCost()
            val taxAmount = totalCost * (incomeTax / 100)
            return totalCost - taxAmount
        }
    }
    val tax = Tax(hours, rate, incomeTax)
    println("Деньги, с учётом налога: ${tax.calculateSalaryAfterTax()}")

    println("Введите Имя:")
    val name = readln().toString()
    println("Введите Мощность:")
    val power = readln().toDouble()
    println("Введите Высоту:")
    val height = readln().toDouble()
    open class Level_One(name: String, power: Double, height: Double){
       open fun quality(): Double{
            val q = power + 0.5*height
            return q
        }
        fun getInfo(): String{
            return "Имя $name" +
                    "Мощность $power" +
                    "Высота $height"
        }
    }


    println("Введите коэффициент излучения:")
    val p = readln().toDouble()
    class Level_Two(p:Double) : Level_One(name, power,height){
       override fun quality(): Double{
            val qp = super.quality() - 0.1 * p
            return qp
        }
    }

    val aerial =  Level_One(name, power, height)
    println(aerial.quality())
     val aerial1 = Level_Two(p)
    println(aerial1.quality())
}

