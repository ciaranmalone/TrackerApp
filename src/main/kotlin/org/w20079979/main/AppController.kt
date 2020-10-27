package org.w20079979.main

import org.w20079979.main.models.TaskModel

var task = TaskModel()

class AppController {
    fun addTask(titleValue: String, descriptionValue: String) {
        task.title = titleValue;
        task.description = descriptionValue;
        for (x in 0..364) task.days.add(false)
    }

    fun listTask() {
        println("All tasks")
        println(task.title)
        for (i in task.days) {
            println(i)
        }
    }

}

