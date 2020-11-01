package org.w20079979.main

import javafx.collections.ObservableList
import org.w20079979.main.models.TaskModel
import org.w20079979.main.models.TaskMemStore

class AppController {

    val tasks = TaskMemStore()
    fun addTask(titleValue: String, descriptionValue: String) {
        var task = TaskModel()
        task.title = titleValue
        task.description = descriptionValue
        tasks.create(task)
    }

    fun listTask() {
        var task = TaskModel()
        println(task.title)
        for (i in task.days) {
            println(i)
        }
    }

    fun showAll(): ObservableList<TaskModel> {
        return tasks.tasks
    }

}

