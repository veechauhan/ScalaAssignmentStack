package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class IsEmptyTest extends AnyFlatSpec {
  val emptyStack: Stack[Int] = new IsEmpty[Int]
  val nonEmptyStack: Stack[Int] = emptyStack.push(5)

  //case 1
  "if we check stack is empty or not " should "give true " in {
    assert(emptyStack.isEmpty)
  }

  //case 2
  "If we check stack is empty or not " should "give false" in {
    assert(!nonEmptyStack.isEmpty)

  }

}
