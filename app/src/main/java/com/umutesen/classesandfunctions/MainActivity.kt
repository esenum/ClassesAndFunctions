package com.umutesen.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.umutesen.classesandfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var name=""
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        test()

        //Void-Unit
        // mySum(10,20)

        //return
        val result= myMultiply(10,20)
       // binding.textView.text="Result:${result}"


        /*
        button.setOnClickListener{
            println("Clicked")
        }

         */

        //class- it will be declared inside of "onCreate" fun

        //Object-Instance

        val homer= Simpson("Homer Simpson",50,"Nuclear Craft")

        homer.hairColor="Yellow"
        //homer.age=50
        //homer.job="Nuc"
        //homer.name="Homer"
        //println(homer.age)

        println(homer.hairColor)

        //Nullability
        //Nullable (?) && Non-null
        //!! vs ?

        var myString: String?=null
        var myAge:Int?=null

        //1) null safety

        if(myAge!=null){
            println(myAge*10)
        } else{
            println("myAge null")
        }

        //2) safe call
        println(myAge?.compareTo(2))

        //3) elvis
        var myResult=myAge?.compareTo(2)?: -100
        println(myResult)


    }


    fun test(){
        println("test function")
    }

    //Input & Return
    fun mySum(a:Int,b:Int){
        //textView.text ="Result:${a+b}"
    }

    fun myMultiply(x:Int,y:Int): Int {
        return x*y
    }

    fun makeSimpson(view:View){
        name =binding.nameText.text.toString()
        var age =binding.ageText.text.toString().toIntOrNull()
        if(age==null){
            age=0
        }
        val job =binding.jobText.text.toString()

        val simpson=Simpson(name,age,job)

        binding.resultText.text="Name:${simpson.name},Age:${simpson.age},Job:${simpson.job}"

    }
    //scope
    fun scopeExample(view:View){
        println(name)
    }

}

