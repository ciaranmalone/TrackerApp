package org.w20079979.main.models
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
var lastId = 0L

internal fun getId(): Long {
    return lastId++
}
class TaskMemStore: TaskStore {

    val tasks = FXCollections.observableArrayList<TaskModel>()

    override fun findAll(): ObservableList<TaskModel> {
        return tasks
    }

    override fun findOne(id: Long) : TaskModel? {
        var foundTask: TaskModel? = tasks.find { p -> p.id == id}
        return foundTask
    }

    override fun create(task: TaskModel) {
        task.id = getId()
        for (x in 0..364) task.days.add(false)
        tasks.add(task)
    }

    override fun update(task: TaskModel) {
        var foundTask = findOne(task.id!!)
        if( task != null){
            task.title = task.title
            task.description = task.description
        }
    }

    internal fun logAll() {
        println(tasks)
    }

}