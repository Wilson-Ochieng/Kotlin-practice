fun main(){
    birthdayGreeting("Roy",9)
    println(birthdayGreeting("Roy",9))

}


//Passed multiple  parameters
fun birthdayGreeting(name:String,age:Int): String {
    val nameGreeting="Happy Birthday, $name!"
    val ageGreeting ="You are now $age years old!"
    return "$nameGreeting\n ,$ageGreeting"
}