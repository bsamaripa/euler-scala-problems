package com.bsamaripa.euler

/**
  * Problem 7
  *
  * 10001st prime
  *
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
  * we can see that the 6th prime is 13.
  *
  * What is the 10,001st prime number?
  *
  */

class Problem007 extends EulerSpec {
  def findPrime(n: Int): Int = {
    0 // TODO: Implementation
  }

  test("10001st prime") {
    findPrime(6) shouldEqual 13
    findPrime(10001) shouldEqual __ // TODO: Fix Test
  }
}
