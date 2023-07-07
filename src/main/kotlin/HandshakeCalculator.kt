private val bitPositionMapToSignals = mapOf(
    1 to Signal.WINK,
    2 to Signal.DOUBLE_BLINK,
    4 to Signal.CLOSE_YOUR_EYES,
    8 to Signal.JUMP
)

object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val actions: MutableList<Signal> = mutableListOf()

        listOf(1, 2, 4, 8).forEach { bitPosition ->
            bitPositionMapToSignals[bitPosition]?.let { signal ->
                if (number and bitPosition == bitPosition) actions.add(
                    signal
                )
            }
        }

        if (number and 16 == 16) {
            actions.reverse()
        }

        return actions.toList()
    }
}
