package stage_1.week_1.test

import stage_1.week_1.isValidIPv4

fun main() {
    //valid

    val valid1 = "192.168.1.1"
    val valid2 = "0.0.0.0"
    val valid3 = "255.255.255.255"
    val valid4 = "1.2.3.4"


    //invalid

    val invalid1 = "256.100.100.100"
    val invalid2 = "192.168.1"
    val invalid3 = "192.168.1.1.1"
    val invalid4 = "192.168.01.1"
    val invalid5 = "192.168.1.a"
    val invalid6 = ""
    val invalid7 = "192..168.1"
    val invalid8 = " 192.168.1.1"

    val checker = IPV4Checker()

    println(checker.validateIPV4(valid1, true))
    println(checker.validateIPV4(valid2, true))
    println(checker.validateIPV4(valid3, true))
    println(checker.validateIPV4(valid4, true))

    println(checker.validateIPV4(invalid1, false))
    println(checker.validateIPV4(invalid2, false))
    println(checker.validateIPV4(invalid3, false))
    println(checker.validateIPV4(invalid4, false))
    println(checker.validateIPV4(invalid5, false))
    println(checker.validateIPV4(invalid6, false))
    println(checker.validateIPV4(invalid7, false))
    println(checker.validateIPV4(invalid8, false))
}

class IPV4Checker {
    fun validateIPV4(address: String, expected: Boolean): Boolean {
        return isValidIPv4(address) == expected
    }
}
