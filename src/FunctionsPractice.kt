fun main(){
    birthdayGreeting("Roy")
    println(birthdayGreeting("Roy"))

}


//Passed name parameter
fun birthdayGreeting(name:String): String {
    val nameGreeting="Happy Birthday, $name!"
    val ageGreeting ="You are now 5 years old!"
    return "$nameGreeting\n ,$ageGreeting"
}