package com.bsamaripa.euler

/**
  * Problem 9
  *
  * Special Pythagorean triplet
  *
  * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  * a**2 + b**2 = c**2
  * For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2.
  *
  * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  *
  * Find the product abc.
  *
  */

class Problem009 extends EulerSpec {

  def pTriplet(a: Int, b: Int, c: Int): Int = {
    0 // TODO: Implementation
  }

  test("Special Pythagorean triplet") {
    pTriplet(3, 4, 5) shouldEqual 50
    pTriplet(???, ???, ???) shouldEqual __ // TODO: Fix Test
  }
}
