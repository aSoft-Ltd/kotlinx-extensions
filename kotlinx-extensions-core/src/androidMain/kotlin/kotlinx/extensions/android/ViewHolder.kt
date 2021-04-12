package kotlinx.extensions.android

import android.view.View
import kotlin.properties.ReadOnlyProperty

open class ViewHolder(protected val view: View?) {
    fun <T : View> Id(id: Int) = ReadOnlyProperty<Any?, T> { thisRef, property ->
        view?.findViewById(id) ?: throw Exception("View ${property.name} not found")
    }
}