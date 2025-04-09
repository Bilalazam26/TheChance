package stage_1.week_1


/*
validation process:
1. split by '.'
2. check number of segments
3. iterate over segments:
    - segment consists of 1 digit ore more
    - check that the integer value of the segment is in range 0..255
    - check if there is any leading zeros -> "012" X
*/

fun isValidIPv4(address: String): Boolean {
    val segments = address.split(".")// Split by '.' and check if we get exactly 4 segments
    if (segments.size != 4) return false

    for (part in segments) {
        // Each segment should be a number one or more digits
        if (!part.matches(Regex("\\d+"))) return false // \\d -> digit  + -> one or more

        // Convert to integer and check range
        val num = part.toIntOrNull() ?: return false
        if (num !in 0..255) return false

        // Check for leading zeros (except "0" itself)
        if (part.length > 1 && part.startsWith("0")) return false
    }
    return true
}