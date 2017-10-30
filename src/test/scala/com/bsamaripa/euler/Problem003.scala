package com.bsamaripa.euler

/**
  * Problem 3
  *
  * Largest prime factor
  *
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143?
  *
  */

class Problem003 extends EulerSpec {
  def largestPrimeFactor(n: Long): Int = {
    0 // TODO: Implementation
  }

  test("Largest prime factor") {
    largestPrimeFactor(13195L) shouldEqual 29
    largestPrimeFactor(600851475143L) shouldEqual __ // TODO: Fix Test
  }
}
