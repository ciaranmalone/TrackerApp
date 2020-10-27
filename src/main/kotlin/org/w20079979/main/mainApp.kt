package org.w20079979.main

import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import tornadofx.App
import tornadofx.*
import org.w20079979.main.models.TaskModel
val controller = AppController()
var TitleField: TextField by singleAssign()
var DescriptionField: TextArea by singleAssign()


class mainApp: App(MyView::class)

class MyView: View() {
    override val root = vbox {

        form {
            fieldset("Create Task") {
                field("Title") {
                    TitleField = textfield()
                }
                field("Description") {
                    DescriptionField =textarea {
                        prefRowCount = 5
                    }
                }

            }
            button("Commit") {
                action {  controller.writeToDb(TitleField.text, DescriptionField.text)}
            }
        }

        flowpane {
            for (i in 1..100) {
                button(i.toString()) {
                    setOnAction { }
                }
            }
        }
    }
}