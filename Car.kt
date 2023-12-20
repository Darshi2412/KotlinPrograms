/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.Scanner

fun main(args : Array<String>) {
    val car1 = Car("Toyota",12.6f,4)
    car1.tranformation()
    println()
    car1.power()
    println()
    car1.applyBrake()
    
    
}
open class Vehicle(val engine : String, val battery : Float, val brakes : Int){
    open fun applyBrake(){   
        println("The vehicle has $brakes brakes")
      }
    
    open fun power(){
       println("The car has a battery of $battery v")
    }
    open fun tranformation(){
       println("The engine for car is $engine")
               }
   
}
class Car(engine : String, battery : Float,  brakes : Int) :Vehicle(engine, battery ,brakes ) {
    
   override fun applyBrake(){
       super.applyBrake()
       println("Brakes are there to stop the car")
   }
  override fun power(){
       super.power()
       println("Battery provides power to the car")
   }
   override fun tranformation(){
       super.tranformation()
       println("Engine transform fuel into energy")
   }
}
    
  