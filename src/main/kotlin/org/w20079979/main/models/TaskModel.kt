package org.w20079979.main.models

data class TaskModel(var id: Long = 0,
                     var title: String="",
                     var description: String = "",
                     var days: ArrayList<Boolean> = arrayListOf()) {
}