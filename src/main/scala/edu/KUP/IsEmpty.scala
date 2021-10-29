package edu.KUP

class IsEmpty[A] extends Stack[A] {
  def error(string: String) = throw new Exception(string)

  def top: A = error("Empty Stack")

  def pop: Stack[A] = error("Empty Stack")

  def isEmpty: Boolean = true
}


