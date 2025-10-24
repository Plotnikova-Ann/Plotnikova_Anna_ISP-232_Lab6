package characters//class Enemy(
//    val name: String,
//    var hp: Int,
//    val element: String
//) {
//    fun takeDamage(amount: Int) {
//        println("$name получает $amount урона!")
//        hp -= amount
//        if (hp < 0) hp = 0
//        println("Осталось HP врага: $hp")
//        if (hp == 0) {
//            println("🎉 Враг $name побежден!")
//        }
//    }
//    fun isStrong(): Boolean {
//        return hp > 100
//    }
//    fun getThreatLevel(): String {
//        if (hp < 0) {
//            return "Некорректное здоровье"
//        }
//        return when {
//            hp <= 50 -> "Низкий"
//            hp <= 150 -> "Средний"
//            else -> "Высокий"
//        }
//    }
//}