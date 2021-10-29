package edu.KUP

class NonEmpty[A](value: A, v: Stack[A]) extends Stack[A] {
  def top: A = value

  def pop: Stack[A] = v

  def isEmpty: Boolean = false
}
