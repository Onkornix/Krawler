import kotlin.random.Random
class Enemy(){


    private val enemyList = listOf(
        "goblin",
        "trenton"
    )
    private val enemyStatMap = mapOf(
        "goblin" to Stats.Goblin,
        "trenton" to Stats.Trenton
    )

    var hp: Int = 0
    var dmg: Int = 0

    init {
        println()
        val chosenEnemy = enemyList[Random.nextInt(from = 0, until = 1)]
        hp = enemyStatMap.getValue(chosenEnemy).hp[Random.nextInt(from=0,until=2)]
        dmg = enemyStatMap.getValue(chosenEnemy).dmg[Random.nextInt(from=0,until=2)]
    }

}