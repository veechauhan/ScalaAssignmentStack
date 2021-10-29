package edu.KUP

trait Stack[A] {
  def push(value: A): Stack[A] = new NonEmpty[A](value,this)

  def top:A

  def pop: Stack[A]

  def isEmpty:Boolean
}

