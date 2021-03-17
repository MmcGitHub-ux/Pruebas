class Order(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String) {
  println("Soy un constructor de pedidos dentro de la clase")
  override def toString = "Resumen de pedido: (Id: "+orderId +", "+orderDate+", "+orderCustomerId+", "+orderStatus+")"
}

var pedido = new Order(1, "06:00 PM 20210311", 100, "Entregado")


class Order(val orderId: Int, val orderDate: String, val orderCustomerId: Int, val orderStatus: String) {
  println("Soy un constructor de pedidos dentro de la clase")
  override def toString = "Resumen de pedido: (Id: "+orderId +", "+orderDate+", "+orderCustomerId+", "+orderStatus+")"
}


/*Table The effect of constructor parameter settings

Visibility	                              Accessor?	Mutator?
var	                                      Yes	      Yes
val	                                      Yes	      No
Default visibility (no var or val)	      No	      No
Adding the private keyword to var or val	No	      No

Si lo definimos como var podemos ver el valor de un atributo de la clase y cambiarlo
Si lo definimos como val podemos ver el valor de un atributo pero no cambiarlo
si no agreamos ni var ni val: ni verlo ni cambiarlo
si agreamos private a var o val: ni verlo ni cambiarlo pero podermos hacer funcion get(val) o get + set(var)

Ejemplo practico de uso de una de clase:

Implementos un contador que tenga las funciones de incrementar su valor y de decirte cual es el valor actual.

 */

class contador () {
  var valor = 0
  def incremeto ():Unit ={ valor+=1}
  def actual ():Int ={return valor}
}

val c = new contador

c.incremeto()
c.actual()








