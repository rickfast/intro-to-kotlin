package oo

data class Widget(val id: Int)

interface WidgetRepository {
    fun findWidget(id: Int): Widget?
    val active: Boolean
}

class InMemoryWidgetRepository : WidgetRepository {
    val data: Map<Int, Widget> = mapOf()
    override fun findWidget(id: Int) =
            data[id]
    override val active = true
}

