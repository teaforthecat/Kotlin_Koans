import java.util.HashMap





fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun <K,V> buildMutableMap(init: HashMap<K,V>.() -> Unit): Map<K,V> {
    val map = HashMap<K,V>()
    map.init()
    return map
}
