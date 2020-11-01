package org.w20079979.main.models

import javafx.collections.ObservableList

interface TaskStore {
    fun findAll(): ObservableList<TaskModel>
    fun findOne(id: Long): TaskModel?
    fun create(task: TaskModel)
    fun update(task: TaskModel)
}