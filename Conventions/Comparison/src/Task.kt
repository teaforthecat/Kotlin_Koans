data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(b: MyDate): Int {
        val y = year.compareTo(b.year)
        if ( y != 0 ) return y
        val m = month.compareTo(b.month)
        if ( m != 0 ) return m
        val d = dayOfMonth.compareTo(b.dayOfMonth)
        if (d != 0) return d
        return 0 // same
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
