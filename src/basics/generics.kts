package basics

import java.util.*

class Widget<T>(val id: T, val name: String)

run {
    val widget: Widget<UUID> = Widget<UUID>(UUID.randomUUID(),
            "bob")
}

run {
    val widget = Widget(UUID.randomUUID(), "bob")
}

