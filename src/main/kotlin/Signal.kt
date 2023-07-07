enum class Signal(private val bitPosition: Int) {

    WINK(1),
    DOUBLE_BLINK(2),
    CLOSE_YOUR_EYES(4),
    JUMP(8);

    fun shallWeAdd(number: Int) = number and bitPosition == bitPosition
}
