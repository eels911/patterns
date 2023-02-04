package singleton

fun main() {
    NetworkService.getInstance().success("200 OK")
}

class NetworkService() : Status {

    companion object{

        private var INSTANCE: NetworkService? = null

        fun getInstance() : NetworkService {
            val tmpInstance = INSTANCE

            if(tmpInstance == null){
                val instance = NetworkService()
                INSTANCE = instance
                return instance
            }
            return tmpInstance
        }
    }

    override fun success(message: String){
        println(message)
    }
}

interface Status {
    fun success(message: String)
}