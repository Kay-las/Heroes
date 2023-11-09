class Enemy(val name: String, var health: Int): Mortal {

    fun takeDamage(damage: Int){
        if (isAline() && health<=damage){
            health = 0
            println("$name погиб ")
        }else{
            health-= Math.min(health, damage)
            println("$name получил урон $damage осталось $health")
        }
    }
    override fun isAline(): Boolean = health > 0
}