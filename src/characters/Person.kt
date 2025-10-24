package characters//fun main() {
//    println("=== ТЕСТИРОВАНИЕ ГЕРОЕВ И ВРАГОВ ===")
//    val naruto = Hero(
//        name = "Наруто",
//        gender = "мужской",
//        role = "Шиноби",
//        level = 5,
//        element = "Ветер",
//        hp = 150,
//        mp = 200
//    )
//    val kakashi = Hero(
//        name = "Какаши",
//        gender = "мужской",
//        role = "Шиноби",
//        level = 15,
//        element = "Молния",
//        hp = 250,
//        mp = 300
//    )
//    naruto.showStats()
//    kakashi.showStats()
//    println("Герой жив? ${naruto.isAlive()}")
//    val deadHero = Hero(
//        name = "Артур",
//        gender = "мужской",
//        role = "Рыцарь",
//        level = 1,
//        element = "Свет",
//        hp = 0,
//        mp = 50
//    )
//    println("Герой жив? ${deadHero.isAlive()}")
//    val easyQuest = Quest(
//        title = "Сбор трав",
//        duration = 2,
//        reward = 100,
//        difficulty = "Лёгкий"
//    )
//    val hardQuest = Quest(
//        title = "Охота на дракона",
//        duration = 10,
//        reward = 1000,
//        difficulty = "Сложный"
//    )
//    naruto.canAcceptQuest(easyQuest)
//    naruto.canAcceptQuest(hardQuest)
//    kakashi.canAcceptQuest(hardQuest)
//}