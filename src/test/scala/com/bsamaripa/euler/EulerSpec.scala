package com.bsamaripa.euler

import org.scalatest._
import org.scalatest.exceptions.TestPendingException
import org.scalatest.matchers.Matcher

class EulerSpec extends FunSuite with Matchers with Stopper {
//  Sequential

  var stopNeeded: Boolean = false

  def  __ : Matcher[Any] = {
    throw new TestPendingException
  }

  override def stopRequested: Boolean = ???

  override def requestStop(): Unit = {
    stopNeeded = true
    messaging
  }

  private def messaging() = {

  }
}

class EulerSuite extends Stepwise(
  new Problem001,
  new Problem002,
  new Problem003,
  new Problem004,
  new Problem005,
  new Problem006,
  new Problem007,
  new Problem008,
  new Problem009,
  new Problem010
)