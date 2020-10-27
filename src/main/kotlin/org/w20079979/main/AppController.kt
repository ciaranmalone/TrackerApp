package org.w20079979.main

import org.w20079979.main.models.TaskModel

var task = TaskModel()
class AppController {
    fun writeToDb(titleValue: String, descriptionValue: String) {
        task.title = titleValue;
        task.description = descriptionValue;
    }
}