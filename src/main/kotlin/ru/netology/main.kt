package ru.netology

fun main() {
    var amount = 500_000
    val minCommission = 3_500
    val fixCommission = (amount/10_000) * 75
    var commission = if (fixCommission < minCommission) minCommission else fixCommission
    println("Комиссия за перевод: $commission копеек")
}