package edu.KUP

object Main extends App {
  val obj = new IsEmpty[Int]
  var obj1 = obj.push(1).push(2).push(3).push(4)
  val obj2 = new NonEmpty[Int](5, obj1)
  obj.push(8)
//  obj1.pop
//  val obj3 = new NonEmpty[Int](5,obj2)
//  print(obj.top)
//  print(obj2.pop.top)
  print(obj.isEmpty)
}
