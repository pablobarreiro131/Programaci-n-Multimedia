package Teoria

class GetSet(
    val name: String,
    var age: Int
) {
    val isOlderThanOne
        get()=this.age>1

    var overWeight = false

    var weight = 0.0
        set(value){
            field=value
        }

}