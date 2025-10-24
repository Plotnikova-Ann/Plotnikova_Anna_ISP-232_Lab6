package world//class Quest {
//    var title: String= "Безымянное задание"
//    var duraton: Int =1
//    var reward: Int=100
//    var difficulty: String= "Лёгкий"
//fun int(title: String,duraction:Int,reward:Int,diffiulty:String) {
//    quest.title = title
//    quest.duration=duration
//    quest.reward=reward
//    quest.difficulty=difficulty
//    println("Название квеста: $(quest.title) Время выполнения${quest.dureation}
//            Награда: ${quest.reward} золотых Уровень сложности: ${fquest.difficulty3}")
//
//}
//}
//class Quest(
//    val title: String,
//    val duration: Int,
//    val reward: Int,
//    val difficulty: String
//) {
//    fun printInfo() {
//        println("=== Информация о квесте ===")
//        println("Название квеста: ${this.title}")
//        println("Время выполнения: ${this.duration} часов")
//        println("Награда: ${this.reward} золотых")
//        println("Уровень сложности: ${this.difficulty}")
//        println()
//    }
//    fun isHard(): Boolean {
//        return difficulty.lowercase() == "сложный"
//    }
//    fun goldPerHour(): Int {
//        require(duration >= 0 && reward >= 0) {
//            "Длительность и награда не могут быть отрицательными!"
//        }
//        if (duration == 0) return 0
//        return reward / duration
//    }
//}