package com.example.customui.ui.items

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.customui.R
import com.example.customui.databinding.ItemPickerWithValueBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

/**
 * Item wykorzystywany do informowania o ważnych rzeczach
 */
class InformationItem : AbstractBindingItem<ItemPickerWithValueBinding>() {
    override val type: Int
        get() = R.layout.item_picker_with_value.toInt()

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): ItemPickerWithValueBinding = ItemPickerWithValueBinding.inflate(inflater, parent, false)
}