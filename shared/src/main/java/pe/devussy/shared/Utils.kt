package pe.devussy.shared

fun generateNumberModels(size: Int = 30) = IntArray(size) { it + 1 }.map { NumberModel(it) }
