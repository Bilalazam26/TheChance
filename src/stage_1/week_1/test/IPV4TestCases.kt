package stage_1.week_1.test

import stage_1.week_1.isValidIPv4

fun main() {
    //valid
    println(isValidIPv4("192.168.1.1"))
    println(isValidIPv4("0.0.0.0"))
    println(isValidIPv4("255.255.255.255"))
    println(isValidIPv4("1.2.3.4"))
    //invalid
    println(isValidIPv4("256.100.100.100")) //256 is out of range
    println(isValidIPv4("192.168.1")) // missing segment
    println(isValidIPv4("192.168.1.1.1")) //many segments
    println(isValidIPv4("192.168.01.1")) // leading zero in the 3rd segment
    println(isValidIPv4("192.168.1.a")) //non-numeric char
    println(isValidIPv4("")) // empty string
    println(isValidIPv4("192..168.1")) // empty segment
    println(isValidIPv4(" 192.168.1.1")) // space
}
