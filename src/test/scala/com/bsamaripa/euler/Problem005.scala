package com.bsamaripa.euler

/**
  * Problem 5
  *
  * Smallest multiple
  *
  * 2520 is the smallest number that can be divided by each of the numbers
  * from 1 to 10 without any remainder.
  *
  * What is the smallest positive number that is evenly divisible
  * by all of the numbers from 1 to 20?
  *
  */

class Problem005 extends EulerSpec {
  def smallestMultiple(x: Int, y: Int): Int = {
    0 // TODO: Implementation
  }

  test("Smallest multiple") {
    smallestMultiple(1, 10) shouldEqual 2520
    smallestMultiple(1, 20) shouldEqual __ // TODO: Fix Test
  }
}
