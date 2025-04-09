package stage_1.week_1.test

import stage_1.week_1.isValidIPv4

fun main() {

    checkIPV4(
        name = "valid IPV4 address no.1",
        address = "192.168.1.1",
        expected = true
    )
    checkIPV4(
        name = "valid IPV4 address no.2",
        address = "0.0.0.0",
        expected = true
    )
    checkIPV4(
        name = "valid IPV4 address no.3",
        address = "255.255.255.255",
        expected = true
    )
    checkIPV4(
        name = "valid IPV4 address no.4",
        address = "1.2.3.4",
        expected = true
    )

    checkIPV4(
        name = "invalid IPV4 address exceeds 255",
        address = "256.100.100.100",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address missing segment",
        address = "192.168.1",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address many segments",
        address = "192.168.1.1.1",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address leading zero",
        address = "192.168.01.1",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address non-numeric char",
        address = "192.168.1.a",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address empty address",
        address = "",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address empty segment",
        address = "192..168.1",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address space in segment",
        address = " 192.168.1.1",
        expected = false
    )
    checkIPV4(
        name = "invalid IPV4 address special char",
        address = "192.168.1.#",
        expected = false
    )



}

fun checkIPV4(name: String, address: String, expected: Boolean) {
    println("$name:")
    println(
        if (isValidIPv4(address) == expected) {
            "passed\n"
        } else {
            "failed\n"
        }
    )
}