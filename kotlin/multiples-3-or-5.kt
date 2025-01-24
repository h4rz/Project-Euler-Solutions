/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

fun main() {
    var multiples = mutableSetOf<Int>()
    for (i in 3..999 step 3) {
        multiples.add(i)
    }
    for (i in 5..999 step 5) {
        multiples.add(i)
    }
    println(multiples.sum())
}