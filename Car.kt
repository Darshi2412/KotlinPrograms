/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.Scanner

fun main(args : Array<String>) {
    val student = Student("John",22)
    student.Introduction()
    student.calculateMarks(40,55,63)
    
    println()
    
    val businessman = Businessman("Amar",50)
    businessman.Introduction()
   	businessman.calculateIncome(500000)
  
}
abstract class Person(name : String, age : Int){
    abstract fun Introduction()	//abstraction
    
   
}
class Student(var name : String, var age : Int) : Person(name,age) {
    
    override fun Introduction(){
        println("I am Student")
        println("My Name is ${name}")
        println("My Age is ${age}")
    }
    private var percentage : Float = 0.0f
    // encapsulation
    fun calculateMarks(subject1 : Int, subject2 : Int, subject3 : Int){
        percentage = (subject1+subject2+subject3)/3.0f
       
        println("My Percentage are $percentage")
       
    } 
}
class Businessman(var name : String ,var age : Int) : Person(name, age){	//inheritence
    private var finalIncome : Int = 0
    override fun Introduction(){
        println("I am Businessman")
        println("My Name is ${name}")
        println("My Age is ${age}")
    }
    //encapsulation
    fun calculateIncome(income : Int){
        if(income < 250000){
            println("Your income is $income")
        }
        else if(income >= 250000 || income < 500000){
            finalIncome=(income*5)/100
            println("Your income is $finalIncome")
        }
        else if(income >= 500000 || income < 1000000){
            finalIncome=(income*20)/100
            println("Your income is $finalIncome")
        }
        else{
            finalIncome=(income*30)/100
            println("Your income is $finalIncome")
        }
        
    }
    
}
    
  