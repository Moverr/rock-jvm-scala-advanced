package lectures.partone

object DarkSugars  extends App {
// methods with sigle param
  def singleArgMethod(arg:Int):String = s"$arg little ducks ..."
  val milo = singleArgMethod{
    45
  }


}
