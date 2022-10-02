enum class Currencies(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    Null("")
}

fun findCountry(name: String): Currencies {
    for (enum in Currencies.values()) {
        if (name == enum.name) return enum
    }
    return Currencies.Null
}

fun compareCurrencies(country1: Currencies, country2: Currencies): Boolean {
    return country1.currency == country2.currency
}

fun main() {
    val (country1, country2) = readln().split(" ")
    val firstCountry: Currencies = findCountry(country1)
    val secondCountry: Currencies = findCountry(country2)
    println(compareCurrencies(firstCountry, secondCountry))
}