object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val actions: MutableList<Signal> = mutableListOf()

        Signal.values().forEach { signal ->
            signal.action(number, actions)
        }

        return actions.toList()
    }
}
