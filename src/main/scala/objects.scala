object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }
}

HelloWorld.main(Array(" "))

/*Companion Objects
  A companion object is an object with the same name as a class and is defined in the same source file as the associated file.*/

class Order(val orderId:Int,val orderDate:String,val orderCustomerId:Int,val orderStatus:String)
{
  println("I am inside Order Constructor")
  override def toString = "Order("+ orderId+ ","+ orderDate + ","+ orderCustomerId + ","+
    orderStatus +")"
}

object Order {
  def apply(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus:String): Order = {
    new Order(orderId, orderDate, orderCustomerId, orderStatus)
  }
}

val order = Order.apply(1, "2013-10-01 00:00:00.000", 100,"COMPLETE")