object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val actions: MutableList<Signal> = mutableListOf()
        if (number and 1 == 1) {
            actions.add(Signal.WINK)
        }
        if (number and 2 == 2) {
            actions.add(Signal.DOUBLE_BLINK)
        }
        if (number and 4 == 4) {
            actions.add(Signal.CLOSE_YOUR_EYES)
        }
        if (number and 8 == 8) {
            actions.add(Signal.JUMP)
        }
        if (number and 16 == 16) {
            actions.reverse()
        }
        return actions.toList()
    }
}
