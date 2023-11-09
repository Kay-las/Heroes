
fun main() {

    val archer: Hero = Archer("Kat", 15)
    val mage: Hero = Mage("Vatras", 20)
    val warrior: Hero = Warrior("Lee", 12)

    val enemy = Enemy("BigBan", 100)


    Main.attackEnemy(enemy, warrior,archer,mage)
}


class Main {
    companion object {
        fun attackEnemy(enemy: Enemy, vararg heroes: Hero?) {
            while (enemy.isAline()) {
                for (hero in heroes){
                    if (enemy.isAline())
                    hero?.attackEnemy(enemy)
                }
            }
        }
    }
}


