class LazyProperty(val initializer: () -> Int) {

    /* not sure */
    var _lazy: Int? = null
    val lazy: Int
        get() {
            if (this._lazy != null) {
                return this._lazy!!
            } else {
                this._lazy = initializer()
                return _lazy!!
            }

        }
}
