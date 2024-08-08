package domain

class Tasklist<Task>{
    private lateinit var list: List<Task>
    private var head: Node<Task>? = null
    private var size = 0

    private fun isEmpty(): Boolean = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    fun insert(value: Task): Tasklist<Task> {
        head = Node(value = value, next = head)
        size++
        return this
    }

//    fun findById(id: UUID): Task? {
//        if(isEmpty()) {
//            return null
//        }
//        return list.find { it = id }
//    }
}