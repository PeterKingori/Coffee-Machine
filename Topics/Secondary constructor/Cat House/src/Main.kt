class Kitty {
    private var color: String = ""
    private var age: Int = 0

    constructor(color: String) {
        this.color = color
    }

    constructor(age: Int) {
        this.age = age
    }

    constructor(color: String, age: Int) {
        this.color = color
        this.age = age
    }

    constructor(age: Int, color: String) {
        this.color = color
        this.age = age
    }

    constructor(color: String, age: Double) {
        this.color = color
        this.age = age.toInt()
    }

    constructor(age: Double, color: String) {
        this.color = color
        this.age = age.toInt()
    }
}