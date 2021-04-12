package kotlinx.extensions

import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

open class ViewHolder(protected val view: View?) {
    fun <T : View> Id(id: Int) = object : ReadOnlyProperty<Any?, T> {
        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            return view?.findViewById(id) ?: throw Exception("View ${property.name} not found")
        }
    }
}