package com.bsamaripa.euler

/**
  * Problem 10
  *
  * Summation of primes
  *
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  *
  * Find the sum of all the primes below two million.
  *
  */

class Problem010 extends EulerSpec {
  def sumPrimes(n: Int): Long = {
    0L // TODO: Implementation
  }

  test("Summation of primes") {
    sumPrimes(10) shouldEqual 17L
    sumPrimes(2000000) shouldEqual __ // TODO: Fix Test
  }
}
