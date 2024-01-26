import kotlin.random.Random
object Stats {

    // Enemies
    object Goblin {
        val hp = listOf(40,50,60)
        val dmg = listOf(3,4,5)
        val drops = listOf(1,2,3)
        val loot = listOf(
            "coin",
            "health_crystal"
        )
    }
    object Trenton {
        val hp = listOf(40,50,60)
        val dmg = listOf(3,4,5)
    }
}