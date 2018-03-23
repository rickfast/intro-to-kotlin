package oo

data class Widget(val id: Int)

interface WidgetRepository {
    fun findWidget(id: Int): Widget?
    fun isActive() = true
}

class InMemoryWidgetRepository : WidgetRepository {
    val data: Map<Int, Widget> = mapOf()
    override fun findWidget(id: Int) =
            data[id]
}

interface Monitorable {
    fun isActive() = false
}

class SomeWidgetRepository : WidgetRepository, Monitorable {
    override fun findWidget(id: Int) = Widget(1)
    override fun isActive(): Boolean {
        val active = super<Monitorable>.isActive()
        return active
    }
}