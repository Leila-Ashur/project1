fun main() {
    val zebra= Migration("dry","high")
    zebra.predictWithWeatherPattern()
    zebra.predictWithRiverLevels()
}
class Migration(val weatherPattern:String,val riverLevel:String){
    fun predictWithWeatherPattern(){
        if (weatherPattern=="wet" ){
            println("Animal migration will be slow.")
        }
        else if (weatherPattern=="dry"){
            println("Animal migration will be high.")
        }
        else{
            println("Can't predict changes.")
        }
    }
    fun predictWithRiverLevels(){
        if (riverLevel=="high"){
            println("Animal migration will be slow.")
        }
        else if (riverLevel=="low"){
            println("Animal migration will be high.")
        }
        else{
            println("Can't predict changes.")
        }
    }
}
