/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.Scanner

fun main(args : Array<String>) {
    val car1 = Car("Toyota",12.6f,4)
    car1.detailsOfCar()
    println()
    car1.information()
    println()
    car1.power()
    println()
    //car1.setPrice()
    
    
}
abstract class Vehicle(val engine : String, val battery : Float, val brakes : Int){
    
    abstract fun detailsOfCar()
    open fun power(){
         println("Battery provides power to the car")
   
    }
    open fun information(){
               println("Engine transform fuel into energy")
    }
   
}
class Car(engine : String, battery : Float,  brakes : Int) :Vehicle(engine, battery ,brakes ) {
    private var price : Int = 0
    
    private fun setPrice(){
        println("The price are 150000")
    }
    
   override fun detailsOfCar(){
       println("The engine of car is $engine")
        println("The battery of car is of $battery v")
        println("The number of brakes in car are $brakes")
   }
   override fun information(){
       println("The best engines are provided by Maruti Suzuki")
   }
  
}
    
  