package org.w20079979.main

import tornadofx.App
import tornadofx.*

class mainApp: App(MyView::class)

class MyView: View() {
    override val root = vbox {
        button("Press me")
        label("Hello")
    }
}