const val POPSICLE_PRICE = 7
const val SCOOP_PRICE = 5
const val TOPPING_PRICE = 2

class IceCreamOrder {
    val price: Int

    constructor(popsicles: Int) {
        price = popsicles * POPSICLE_PRICE
    }

    constructor(scoops: Int, toppings: Int) {
        price = scoops * SCOOP_PRICE + toppings * TOPPING_PRICE
    }
}