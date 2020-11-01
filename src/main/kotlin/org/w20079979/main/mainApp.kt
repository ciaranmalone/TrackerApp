package org.w20079979.main

import javafx.collections.FXCollections
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import org.w20079979.main.models.TaskMemStore
import tornadofx.App
import tornadofx.*
import org.w20079979.main.models.TaskModel


val controller = AppController()
var TitleField: TextField by singleAssign()
var DescriptionField: TextArea by singleAssign()
val tasks = TaskMemStore()
val Tabs = controller.showAll()

class mainApp: App(MyView::class)

fun returnDays(name:String) {
  //  var foundTask = tasks.find {p -> p.title == String}
}

class MyView: View() {
    override val root = borderpane {
        top {
            hbox {

            }
        }
        center {
            tabpane {
                tab("Create Task") {
                    form {
                        fieldset("Create Task") {
                            field("Title") {
                                TitleField = textfield()
                            }
                            field("Description") {
                                DescriptionField = textarea {
                                    prefRowCount = 5
                                }
                            }

                        }
                        button("Commit") {
                            action {
                                controller.addTask(TitleField.text, DescriptionField.text)
                            }
                        }
                    }
                }
                tab("Tasks") {

                    flowpane {
                        children.bind(Tabs) {
                            Label(it.title)
                        }
                    }
                }

            }
        }
    }
}

