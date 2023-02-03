package singleton

fun main() {
    NetworkService.getInstance().success("200 OK")
}

class NetworkService private constructor() : IStatus {

    companion object{

        private var INSTANCE: NetworkService? = null

        fun getInstance() : NetworkService {
            val tmpInstance = INSTANCE

            if(tmpInstance != null){
                return tmpInstance
            }

                val instance = NetworkService()
                INSTANCE = instance
                return instance
        }

    }

    override fun success(message: String){
        println(message)
    }
}

interface IStatus {
    fun success(message: String)
}