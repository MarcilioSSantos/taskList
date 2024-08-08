package domain

class Node<T>(
    val value: T,
    val next: Node<T>? = null
) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> $next"
        } else {
            "$value"
        }
    }
}