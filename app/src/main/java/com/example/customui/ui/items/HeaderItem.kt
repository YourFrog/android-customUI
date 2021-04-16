package com.example.customui.ui.items

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.customui.R
import com.example.customui.databinding.ItemHeaderBinding
import com.example.customui.databinding.ItemPickerWithValueBinding
import com.mikepenz.fastadapter.binding.AbstractBindingItem

class HeaderItem (
    private val text: String
) :AbstractBindingItem<ItemHeaderBinding>() {

    override val type: Int
        get() = R.layout.item_header.toInt()

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): ItemHeaderBinding = ItemHeaderBinding.inflate(inflater, parent, false)

    override fun bindView(binding: ItemHeaderBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)

        binding.textView.text = text
    }
}