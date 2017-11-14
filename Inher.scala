
abstract class Parent(name:String)//parent class
{
  //functions of parent class
  def statement = name + " is a " + typeOfAnimal 
  def typeOfAnimal: String
}
//class cat extends parent class 
class Cat(name:String) extends Parent(name){
  override def typeOfAnimal = "Cat"
}
//class Tiger extends parent class
class Tiger(name:String) extends Parent(name){
  override def typeOfAnimal = "Tiger"
}
//object of main class
object inher {
  def main(args:Array[String])
  {
     var obj1=new Cat("Tom")//object of class cat
      println(obj1.statement)
      var obj2=new Tiger("Gadu")//object of class tiger
     println(obj2.statement)
  }
 
}