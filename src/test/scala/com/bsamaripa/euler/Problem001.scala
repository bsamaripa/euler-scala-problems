package com.bsamaripa.euler

/**
  * Problem 1
  *
  * Multiples of 3 and 5
  *
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  * The sum of these multiples is 23.
  *
  * Find the sum of all the multiples of 3 or 5 below 1000.
  *
  */

class Problem001 extends EulerSpec {

  def sumNatural(n: Int): Int = {
    0 // TODO: Implementation
  }

  test("Multiples of 3 and 5") {
    sumNatural(10) shouldEqual 23
    sumNatural(1000) shouldEqual __ // TODO: Fix Test
  }
}
