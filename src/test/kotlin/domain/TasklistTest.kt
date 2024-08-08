package domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TasklistTest {
    private val taskList = Tasklist<Task>()

    @Test
    fun `should insert node`() {
        val task = Task(name  = "b", description = "Tchoma tchoma", status = Status.TO_DO)
        val expected = task.toString()

        val actual = taskList.insert(task).toString()

        assertEquals(expected, actual)
    }

//    @Test
//    fun `should find first task`() {
//        val task = Task(name  = "b", description = "Tchoma tchoma", status = Status.TO_DO)
//        val task2 = Task(name  = "c", description = "Tchoma tchoma", status = Status.TO_DO)
//
//        val list = listOf(task, task2)
//        val expected = task.toString()
//
//        taskList.insert(task).insert(task2)
//        val actual = taskList.findById(task.id).toString()
//
//        assertEquals(expected, actual)
//    }
}