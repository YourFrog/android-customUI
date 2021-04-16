package com.example.customui.ui.items

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customui.R
import com.example.customui.databinding.ItemPickerBinding
import com.example.customui.databinding.ItemPickerWithValueBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

/**
 *  Item wykorzystywany do wybierania wartości z listy i jej prezentacji
 */
class PickerItem(
    private val model: Model,
    private val events: Events
) : AbstractBindingItem<ItemPickerBinding>() {

    override val type: Int
        get() = R.layout.item_picker.toInt()

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): ItemPickerBinding = ItemPickerBinding.inflate(inflater, parent, false)

    override fun bindView(binding: ItemPickerBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)

        binding.titleView.text = model.title

        binding.containerView.setOnClickListener(events.onClick)
    }

    data class Model (
        val title: String
    )

    data class Events (
        val onClick: (View) -> Unit
    )
}