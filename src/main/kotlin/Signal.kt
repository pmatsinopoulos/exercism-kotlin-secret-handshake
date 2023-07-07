enum class Signal(private val bitPosition: Int) {
    WINK(1),
    DOUBLE_BLINK(2),
    CLOSE_YOUR_EYES(4),
    JUMP(8),
    REVERSE(16) {
        override fun handle(actions: MutableList<Signal>) {
            actions.reverse()
        }
    };

    private fun matches(number: Int) = number and bitPosition == bitPosition
    open fun handle(actions: MutableList<Signal>) {
        actions.add(this)
    }

    fun action(number: Int, actions: MutableList<Signal>) {
        if (matches(number)) handle(actions)
    }
}
