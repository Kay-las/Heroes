class Mage(name: String, damage: Int) : Hero(name, damage) {

    override fun attackEnemy(enemy: Enemy) {
        println("$name сотворил заклинание на " + enemy.name)
        enemy.takeDamage(damage)
    }
}