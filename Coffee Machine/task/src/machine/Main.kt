package machine

fun main() {
    val coffeeMachine = CoffeeMachine()

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()
        println()
        coffeeMachine.operateMachine(action)
    } while (action != "exit")
}

class CoffeeMachine {
    private var waterInStock = 400
    private var milkInStock = 540
    private var coffeeInStock = 120
    private var cupsInStock = 9
    private var totalMoney = 550

    fun operateMachine(input: String) {
        when (input) {
            "buy" -> buyCoffee()
            "fill" -> fillSupplies()
            "take" -> takeMoney()
            "remaining" -> displayStock()
        }
    }

    private fun displayStock() {
        println("The coffee machine has:")
        println(
            "$waterInStock ml of water\n$milkInStock ml of milk\n$coffeeInStock g of coffee beans\n" + "$cupsInStock disposable cups\n\$$totalMoney of money"
        )
        println()
    }

    private fun buyCoffee() {
        val espressoWater = 250
        val espressoMilk = 0
        val espressoCoffeeBeans = 16
        val espressoPrice = 4

        val latteWater = 350
        val latteMilk = 75
        val latteCoffeeBeans = 20
        val lattePrice = 7

        val cappuccinoWater = 200
        val cappuccinoMilk = 100
        val cappuccinoCoffeeBeans = 12
        val cappuccinoPrice = 6

        do {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
            val option = readln()
            when (option) {
                "1" -> {
                    if (checkAvailableSupplies(espressoWater, espressoMilk, espressoCoffeeBeans)) {
                        buyOption(espressoWater, espressoMilk, espressoCoffeeBeans, espressoPrice)
                        return
                    } else {
                        println()
                        return
                    }
                }

                "2" -> {
                    if (checkAvailableSupplies(latteWater, latteMilk, latteCoffeeBeans)) {
                        buyOption(latteWater, latteMilk, latteCoffeeBeans, lattePrice)
                        return
                    } else {
                        println()
                        return
                    }
                }

                "3" -> {
                    if (checkAvailableSupplies(cappuccinoWater, cappuccinoMilk, cappuccinoCoffeeBeans)) {
                        buyOption(cappuccinoWater, cappuccinoMilk, cappuccinoCoffeeBeans, cappuccinoPrice)
                        return
                    } else {
                        println()
                        return
                    }
                }
            }
            println()
        } while (option != "back")
    }

    private fun buyOption(water: Int, milk: Int, coffee: Int, money: Int) {
        waterInStock -= water
        milkInStock -= milk
        coffeeInStock -= coffee
        totalMoney += money
        cupsInStock--
        println()
    }

    private fun checkAvailableSupplies(
        requiredWater: Int, requiredMilk: Int, requiredCoffee: Int, requiredCups: Int = 1
    ): Boolean {
        var enoughSupplies = false
        if (waterInStock - requiredWater <= 0) {
            println("Sorry, not enough water!")
        } else if (milkInStock - requiredMilk <= 0) {
            println("Sorry, not enough milk!")
        } else if (coffeeInStock - requiredCoffee <= 0) {
            println("Sorry, not enough coffee!")
        } else if (cupsInStock - requiredCups <= 0) {
            println("Sorry, not enough cups!")
        } else {
            enoughSupplies = true
            println("I have enough resources, making you a coffee!")
        }
        return enoughSupplies
    }

    private fun fillSupplies() {
        println("Write how many ml of water you want to add:")
        waterInStock += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milkInStock += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffeeInStock += readln().toInt()
        println("Write how many disposable cups you want to add:")
        cupsInStock += readln().toInt()
        println()
    }

    private fun takeMoney() {
        println("I gave you \$$totalMoney")
        totalMoney = 0
        println()
    }

}



