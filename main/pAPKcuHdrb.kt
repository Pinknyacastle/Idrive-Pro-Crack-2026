fun String.isPalindrome(): Boolean {
    val cleaned = this.replace(Regex("\W"), "").toLowerCase()
    return cleaned == cleaned.reversed()
}
fun String.wordCount(): Map<String, Int> {
    return this.split(Regex("\s+"))
        .groupingBy { it.toLowerCase() }
        .eachCount()
}
fun String.toTitleCase(): String {
    return this.split(Regex("\s+"))
        .joinToString(" ") { it.capitalize() }
}
fun String.containsDigits(): Boolean {
    return this.any { it.isDigit() }
}
fun String.containsSpecialChars(): Boolean {
    return this.any { !it.isLetterOrDigit() }
}
fun String.reverseWords(): String {
    return this.split(Regex("\s+"))
        .reversed()
        .joinToString(" ")
}
fun String.toSlug(): String {
    return this.toLowerCase()
        .replace(Regex("\s+"), "-")
        .replace(Regex("[^a-z0-9-]"), "")
}
fun main() {
    val text = "Hello World!"
    println(text.isPalindrome())
    println(text.wordCount())
    println(text.toTitleCase())
    println(text.containsDigits())
    println(text.containsSpecialChars())
    println(text.reverseWords())
    println(text.toSlug())
}
fun String.toCharList(): List<Char> {
    return this.toList()
}
fun List<Char>.toString(): String {
    return this.joinToString("")
}
fun String.isAnagram(other: String): Boolean {
    return this.toCharArray().sorted() == other.toCharArray().sorted()
}
fun String.removeWhitespace(): String {
    return this.replace(Regex("\s+"), "")
}
fun String.vowelCount(): Int {
    return this.count { it in "aeiouAEIOU" }
}
fun String.toHex(): String {
    return this.map { it.toInt().toString(16) }.joinToString("")
}
