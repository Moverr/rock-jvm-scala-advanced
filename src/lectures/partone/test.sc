val aCondititon:Boolean = false

val aConditionVal = if(aCondititon) 42 else 65

// instructions vs expressions
val aCodeBlock = {
  if(aCondititon)
    43
  else
  45
}

val theUnint = print("Trust Me Mover")

def aFunction(x:Int) :Int= x+3

print(aFunction(34+4))

//recursion stack and tail
 //polymorphism by subtyping

class Animal
class Dog extends Animal

val aDog: Animal = new Dog // Subtyping

trait Carnivore{
  def eat(a:Animal) : Unit
}

class Crocodile extends Animal with Carnivore{
  override def eat(a: Animal): Unit = println("Trust in the Movie")
}

val crock = new  Crocodile
crock.eat(aDog)
crock eat aDog // Natural Language


var aCore = new Carnivore {
  override def eat(a: Animal): Unit = println("Test")
}

//generics :: convariate
abstract  class  MyList[+A]
//singleton
object MyList

//case classes
//exceptions
//val throwsException = throw  new RuntimeException //Nothing

val aPotentialFailure = try{
  throw  new RuntimeException
}
catch {
  case e:RuntimeException=> println(e.getMessage)

}finally {
  println("Trust that Lord works")
}
//Scala is designed around classes and object

// Functional Programming

val incrementer = new Function1[Int,Int] {
  override def apply(v1: Int) = v1+1
}

def mo(v1:Int):Int={
v1+3*v1
}

val anon = (v1:Int)=>v1*67

List(1,2,3,4).map(anon)


val pairs = for{
  num <- List(2,3,4,5,6)
  char <- List('a','b','c','d','f')
}yield  num + " " + char