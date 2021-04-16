package com.example.customui.ui.items

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customui.R
import com.example.customui.databinding.ItemCheckboxBinding
import com.example.customui.databinding.ItemSwitchBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

/**
 *  Item wykorzystywany do zatwierdzenia jakieś wartości
 */
class CheckboxItem (
    /**
     *  Dane które można przekazać do wyświetlenia
     */
    private val model: Model,

    /**
     * Sposób interpretacji sposobu wyświetlania wartości
     */
    private val viewStyle: SwitchItem.ViewStyle = SwitchItem.StandardViewStyle
): AbstractBindingItem<ItemCheckboxBinding>() {
    override val type: Int = R.layout.item_checkbox.toInt()

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): ItemCheckboxBinding = ItemCheckboxBinding.inflate(inflater, parent, false)

    override fun bindView(binding: ItemCheckboxBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)

        binding.iconView.setImageDrawable(model.icon)
        binding.titleView.text = model.title

        when {
            viewStyle.isNothing(model.value) && model.defaultValue == null -> {
                binding.valueView.visibility = View.GONE
            }
            viewStyle.isNothing(model.value) -> {
                binding.valueView.text = model.defaultValue
            }
            else -> {
                binding.valueView.text = model.value
            }
        }
    }

    /**
     *  Sposób interpretacji danych w kontrolce
     */
    interface ViewStyle {
        fun isNothing(value: String?): Boolean
    }

    /**
     *  Jedynie null'e są uznawane jako brak wartości
     */
    object NullIsNothing : ViewStyle {
        override fun isNothing(value: String?): Boolean {
            return value == null
        }
    }

    /**
     *  Jedynie puste ciągi znaków uznawane są za brak wartości
     */
    object OnlyEmptyIsNothing : ViewStyle {
        override fun isNothing(value: String?): Boolean {
            if( value == null ) {
                return false
            }

            return value.isEmpty()
        }
    }

    /**
     *  Jeśli nie można wyświetlić oznacza to że brak wartości
     */
    object StandardViewStyle : ViewStyle {
        override fun isNothing(value: String?): Boolean {
            if( value == null ) {
                return true
            }

            return value.isEmpty()
        }
    }

    interface Model {
        /**
         *  Treść komunikatu znajdującego się nad wybraną wartością
         */
        val title: String

        /**
         *  Wartość prezentowana pod treścią
         */
        val value: String?

        /**
         *  Domyślna wartość w polu na wartości w przypadku stwierdzenia braku wartości w value
         */
        val defaultValue: String?

        val icon: Drawable?
    }
}