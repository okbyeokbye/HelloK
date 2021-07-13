fun main(){

    print("hello ${methodWithArgs(b1=2)}")
    var person=Person("sdfs","sdfsds")

    person.canWalk()


    val abc= arrayOf("hello","abc")
    changeit(abc)
    abc.forEach{
        print(it)

    }
    for(x in 1..1){
        println(x)
    }



}
fun changeit(array:Array<String>){
    array[0]="sohahfhfhfhf"
}

fun methodWithArgs(a1:Int=1,b1:Int):Int{
    return a1+b1
}