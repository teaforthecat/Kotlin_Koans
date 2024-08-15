import java.util.*

fun <I, C : MutableCollection<I>> Collection<I>.partitionTo(a: C, b: C, l: (I) -> Boolean) : Pair<C,C> {
    for (element in this) {
        if (l(element)) {
            a.add(element)
        } else {
            b.add(element)
        }
    }
    return Pair(a,b)
}


fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
            .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
            .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
