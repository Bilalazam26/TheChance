package stage_1.week_1

fun isValidIPv4(address: String): Boolean {
    // Split by '.' and check if we get exactly 4 segments
    val segments = address.split(".")
    if (segments.size != 4) return false

    for (part in segments) {
        // Each part should be a number
        if (!part.matches(Regex("\\d+"))) return false // \\d -> digit  + -> one or more

        // Convert to integer and check range
        val num = part.toIntOrNull() ?: return false
        if (num !in 0..255) return false

        // Check for leading zeros (except "0" itself)
        if (part.length > 1 && part.startsWith("0")) return false
    }

    return true
}