
  // methods with sigle param
  def singleArgMethod(arg:Int):String = s"$arg little ducks ..."
  val milo = singleArgMethod{
    45
  }

// syntax sugar #2: SIngle Abstract Method
  trait Action{
  def apply(i: Int) = act(i)


  def act(x:Int):Int
  def bile(x:Int,y:Int):Int={
    ???
  }
}

  val aInstance:Action = new Action {
    override def act(x: Int) = x *34
  }

  val afInstance:Action = (x: Int) => x + 1
  val p =  aInstance(34)

  val aThread = new Thread(new Runnable {
    override def run(): Unit = println("Hello, Scala")
  })

  val aSweatThread = new Thread(()=>{
    println("Hello, Bingo")
  })