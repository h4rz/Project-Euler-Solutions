/**
 * The prime factors of 13195 are 5, 7, 13, and 29.
 * What is the largest prime factor of the number 600851475143?
 */

 fun main() {
    val num = 600851475143L
    println(primeFactor(num))
 }

 fun primeFactor(num: Long): Long {
    for ( i in 2..num) {
        val div = num / i
        if (num % i == 0L && div > 1L) {
            return primeFactor(div)
        }
    }
    return num
 }
