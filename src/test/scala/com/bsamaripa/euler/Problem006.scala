package com.bsamaripa.euler

/**
  * Problem 6
  *
  * Sum square difference
  *
  * The sum of the squares of the first ten natural numbers is,
  * 1**2 + 2**2 + ... + 10**2 = 385
  *
  * The square of the sum of the first ten natural numbers is,
  * (1 + 2 + ... + 10)**2 = 552 = 3025
  *
  * Hence the difference between the sum of the squares of the first
  * ten natural numbers and the square of the sum is 3025 − 385 = 2640.
  *
  * Find the difference between the sum of the squares of the first
  * one hundred natural numbers and the square of the sum.
  *
  */

class Problem006 extends EulerSpec {
  def sumSquareDifference(n: Int): Int = {
    0 // TODO: Implementation
  }

  test("Sum square difference") {
    sumSquareDifference(10) shouldEqual 2640
    sumSquareDifference(100) shouldEqual __ // TODO: Fix Test
  }
}
