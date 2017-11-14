//multiple inheritance in scala via trait
trait One
{
  def show()  //function show
  {
    println("class one")
  }
  def displayone()
  {
    println("class one normal method")
  }
}
trait Two extends One  
{
  override def show()  //function overriding
  {
    println("class two")
  }
  def displaytwo()
  {
    println("class two normal method")
  }
}
//class four extends two trait and inheritance its features
class four extends One with Two //multiple inheritance

  

object MulInher {
  def main(args:Array[String])
  {
    var obj=new four() //object of the class four
    obj.show()  //calling show it will call show in trait two
    obj.displayone()
    obj.displaytwo()
  }
  
}