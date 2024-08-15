// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer>  {
    return this.customers.filter{
        val (del, undel) = it.orders.partition { it.isDelivered }
        undel.size > del.size
    }.toSet()
}