fun main(){
    //Using Named arguments
    val greeting =birthdayGreeting(name="Angel",age=89,isKenyan = true)
    println(greeting)

}
//Passed multiple  parameters
fun birthdayGreeting(name:String,age:Int,isKenyan:Boolean): String {
    val nameGreeting="Happy Birthday, $name!"
    val ageGreeting ="You are now $age years old and you are $isKenyan!"
    return "$nameGreeting\n ,$ageGreeting"
}