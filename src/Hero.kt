//class Hero {
//    var name: String = " Неизвестный"
//    var gender: String = "Не указан"
//    var role: String = "Бродяга"
//    var hp: Int = 100
//    var mp: Int = 50
//}
//
//fun main() {
//    ///////
//    val naruto : Hero = Hero()
//    naruto.name =" Наруто Узумаки"
//    naruto.gender = "Мужской"
//    naruto.role = "Хокаге"
//    naruto.hp = 200
//    naruto.mp = 150
//    ///
//    val hero = Hero()
//    print("Введите имя героя")
//    hero.name= readln()
//    print("Введите пол героя"
//    )
//    hero.gender= readln()
//    print("Введите класс")
//    hero.role= readln()
//    print("Введите здоровье")
//    hero.hp= readln().toInt()
//    print(" Введите ману")
//    hero.mp = readln().toInt()
//
//    println("Имя:${hero.name}\nПол: ${hero.gender}\nКласс: ${hero.role}\nЗдоровье ${hero.hp}\nМана ${hero.mp}")
//}
//}
//ф-ция приветсивия
//fun sauHello(){
//    println("Я - $name, и мой путь толькоо начинается ")
//ф-ция выдающая информацию о герое
//fun showStats(){
//    println("Имя:$name | Класс:$role|  HP:$hp| MP:$mp| Level:$level| Element:$element")
//}
//ф-ция медитации, которая востонавливает ману
//fun meditator(){
//    println(" #name  медитирует... ")
//    mp+=20
//    println("Мана восстановлена! Текущая мана: $mp")
//}
//ф-ция поручения урона
//fun takeDemage(){
//    println("$name получает урон")
//    hp-=10
//    println("Осталось здоровья $hp")
//}
///////////////////////////////////ШАГ 5
//fun main() {
//    println("привет, $name") // name- параметр ф-ции
//}
//fun main(){
//    val hero = Hero()
//    hero.greet(name=hero.name)
//    hero.greet(name=Наруто)
//}
//fun takeDamage(amount:Int) {
//    println("$name получает $amount  урона")
//    hp -= amount
//    if (hp < 0) hp = 0
//    println("$ Осталось здоровья:hp")
//
//fun main(){
//    val hero= Hero()
//    hero.takeDamage(30)
//    hero.takeDamage(20)
//}
//fun takeDamage(amount:Int) {
//    println("$name получает $amount  урона")
//    hp -= amount
//    if (hp < 0) hp = 0
//    println("$ Осталось HP врага:hp")
//fun attack(enemy: Enemy,damage:Int){
//    println("$name  атакует врага ${enemy.name}!")
//    enemy.takeDamage(damage)
//}
//val naruto = Hero()
//naruto.name= "Нурато"
//naruto.role= "Шиноби"
//naruto.element= "Ветер"
//val orochimaru =Enemy()
//orochimaru.name =  "Орочимару"
//naruto.ShowStats()
//println("Наруто увидел врага${orochimaru.name}!Его здоровье ${orochimaru.hp}")
//    naruto.attak(orochimaru, 25)
//}
//fun castSpellOn(enemy: Enemy,spellName: String,demage: Int){
//    println("$name использует заклинание $spellName против${enemy.name}")
//    if (element== enemy.element){
//        println(" Стихии совпадают. Урон снижен")
//        val reducedDamage = (demage /2)
//        enemy.takeDemage (redicedDemage)
//    }else{
//        enemy.takeDemage(demage)
//    }
//    mp -=10
//    if (mp<0) mp=0
//    println("Осталось маны: $mp")
//}
//fun duel(opponent:Hero){
//    println("Дуэль между $name и ${opponent.name} начинается")
//    println("$name атакует первым")
//    opponent.takeDemage(15)
//    println("${opponent.name} отвечает")
//    this.takeDemage(15)
//    println("Дуэль завершена")
//    println("Состояние героев")
//    this.showStats()
//    opponent.showStats()
//}
//fun main(){
//    val naruto = Hero()
//    naruto.name =" Наруто"
//    naruto.role = "Шиноби"
//    naruto.element = "Ветер"
//    naruto.mp = 200
//    val kakasi = Hero()
//    kakasi.name =" какаши"
//    kakasi.role = "Шиноби"
//    kakasi.element = "Молния"
//    kakasi.mp = 100
//    val orochimaru = Enemy()
//    orochimaru.name= "Орочимару"
//    orochimaru.element = "Ветер"
//    naruto.castSpellOn(orochimaru,"Расенган",30)
//    naruto.duel(kakasi)
//}
//fun duel (opponent: Hero){
//    println("Дуэль между $name ${opponent.name} начинается")
//
//    println("$name отакует первым!")
//    opponent.takeDemage(15)
//
//    println("${opponent.name}отвечает")
//    this.takeDemage(15)
//
//    println("дуэль завершена")
//    println("Сосотояние героев")
//    this.showStats()
//    opponent.showStats()
//}
//}
