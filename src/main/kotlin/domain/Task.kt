package domain

import java.util.UUID
import java.util.UUID.randomUUID

data class Task(
    val id: UUID = randomUUID(),
    val name: String,
    val description: String,
    val status: Status
)

enum class Status {
    TO_DO, DOING, DONE
}