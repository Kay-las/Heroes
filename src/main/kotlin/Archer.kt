class Archer(name: String, damage: Int) : Hero(name, damage) {

    override fun attackEnemy(enemy: Enemy) {
        println("$name стрельнул из лука в " + enemy.name)
        enemy.takeDamage(damage)
    }
}