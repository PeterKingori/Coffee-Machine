const val TEN = 10

class EspressoMachine {
    val costPerServing: Float

    constructor(coffeeCapsulesCount: Int, totalCost: Float) {
        costPerServing = totalCost / coffeeCapsulesCount
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float) {
        val pricePerWeightUnit = totalCost / coffeeBeansWeight
        costPerServing = TEN * pricePerWeightUnit
    }
}