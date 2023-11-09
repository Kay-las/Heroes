class Warrior(name: String, damage: Int) : Hero(name, damage) {

    override fun attackEnemy(enemy: Enemy) {
        println("$name ударил мечем в " + enemy.name)
        enemy.takeDamage(damage)
    }

}