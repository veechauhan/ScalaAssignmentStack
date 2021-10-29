package edu.KUP

import org.scalatest.flatspec.AnyFlatSpec
import scala.language.postfixOps

class NonEmptyTest extends AnyFlatSpec {
  val emptyStack = new IsEmpty[Int]
  val stack1: Stack[Int] = emptyStack.push(1).push(2)
  val stack2 = new NonEmpty[Int](3, stack1)

  //case 1
  "If we check top of stack2 " should "give 7" in {
    assert(stack2.top == 3)
  }
  //case 2
  "If we check stack2 is empty or not " should "give false" in {
    assert(!stack2.isEmpty)
  }
  //case 3
  "If we perform pop method on stack2 " should "remove top " in {
    assert(stack2.pop.top == 2)
  }
  " we test push method" should "give non empty stack" in {
    val stack3 = emptyStack.push(3)
    assert(!stack3.isEmpty)
  }

}
