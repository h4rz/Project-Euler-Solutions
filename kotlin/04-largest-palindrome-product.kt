/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 
 * 9009 = 91 * 99. Find the largest palindrome made from the product of two 3-digit numbers.
*/

fun main() {
    var max = 999
    var large = 0
    for ( i in max downTo 100) {
        for (j in i downTo 100) {
            var prod = i * j
            if (prod > large && isPalindrome(prod)) {
                large = prod
            }
        }
    }
    println(large)
}

fun isPalindrome(num: Int): Boolean {
    var res = 0
    var n = num
    while (n > 0) {
        res = res * 10 + n % 10
        n /= 10
    }
    return num == res
}