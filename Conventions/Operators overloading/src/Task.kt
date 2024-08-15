import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

class TimeIntervalWithAmount(val timeInterval: TimeInterval, val amount: Int)  {

}

operator fun TimeInterval.times(amount: Int) = TimeIntervalWithAmount(this, amount)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalWithAmount: TimeIntervalWithAmount): MyDate {
    return this.addTimeIntervals(timeIntervalWithAmount.timeInterval, timeIntervalWithAmount.amount)
}
fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
