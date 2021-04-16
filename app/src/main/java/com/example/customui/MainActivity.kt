package com.example.customui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customui.databinding.ActivityMainBinding
import com.example.customui.ui.items.*
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.GenericItem
import com.mikepenz.fastadapter.adapters.ItemAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val pickerHeaderAdapter = ItemAdapter<GenericItem>().apply {
            add(HeaderItem(
                text = "Picker Items"
            ))
        }

        val switchHeaderAdapter = ItemAdapter<GenericItem>().apply {
            add(HeaderItem(
                text = "Switch Items"
            ))
        }

        val checkboxHeaderAdapter = ItemAdapter<GenericItem>().apply {
            add(HeaderItem(
                text = "Checkbox Items"
            ))
        }


        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = FastAdapter.with(listOf(pickerHeaderAdapter, ItemAdapter<GenericItem>().apply {
            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 1"
                    override val value = "Jakaś odpoiedź"
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:PickerWithValueItem.Events {
                    override val onClick: (view: View) -> Unit = {

                    }
                }
            ))

            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 2"
                    override val value = null
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:PickerWithValueItem.Events {
                    override val onClick: (view: View) -> Unit = {

                    }
                }
            ))

            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 4"
                    override val value = null
                    override val defaultValue = null
                    override val icon = null
                }
            ))

            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 4a"
                    override val value = null
                    override val defaultValue = null
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                }
            ))

            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 4b"
                    override val value = ""
                    override val defaultValue = null
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                viewStyle = PickerWithValueItem.NullIsNothing
            ))

            add(PickerWithValueItem(
                model = object:PickerWithValueItem.Model {
                    override val title = "Ważny tekst 5"
                    override val value = "Jakaś odpowiedź"
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:PickerWithValueItem.Events {
                    override val onClick: (view: View) -> Unit = {

                    }
                }
            ))
        }, switchHeaderAdapter,  ItemAdapter<GenericItem>().apply {
            add(SwitchItem(
                model = object:SwitchItem.Model {
                    override val title = "Ważny tekst"
                    override val value = "Jakaś odpowiedź"
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:SwitchItem.Events {
                    override fun onCheck() {
                        /* Nothing */
                    }

                    override fun onUncheck() {
                        /* Nothing */
                    }
                },
                viewOptioms = SwitchItem.NormalViewOptions()
            ))

            add(SwitchItem(
                model = object:SwitchItem.Model {
                    override val title = "Ważny tekst 1"
                    override val value = ""
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:SwitchItem.Events {
                    override fun onCheck() {
                        /* Nothing */
                    }

                    override fun onUncheck() {
                        /* Nothing */
                    }
                },
                viewOptioms = SwitchItem.NormalViewOptions()
            ))

            add(SwitchItem(
                model = object:SwitchItem.Model {
                    override val title = "Ważny tekst 1"
                    override val value = ""
                    override val defaultValue = ""
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                },
                events = object:SwitchItem.Events {
                    override fun onCheck() {
                        /* Nothing */
                    }

                    override fun onUncheck() {
                        /* Nothing */
                    }
                },
                viewOptioms = SwitchItem.NormalViewOptions()
            ))

            add(SwitchItem(
                model = object:SwitchItem.Model {
                    override val title = "Ważny tekst 2"
                    override val value = null
                    override val defaultValue = null
                    override val icon = resources.getDrawable(R.drawable.ic_info)
                },
                events = object:SwitchItem.Events {
                    override fun onCheck() {
                        /* Nothing */
                    }

                    override fun onUncheck() {
                        /* Nothing */
                    }
                },
                viewStyle = SwitchItem.NullIsNothing
            ))
        }, checkboxHeaderAdapter, ItemAdapter<GenericItem>().apply {
            add(CheckboxItem(
                model = object:CheckboxItem.Model {
                    override val title = "Ważny tekst"
                    override val value = "Jakaś odpowiedź"
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                }
            ))

            add(CheckboxItem(
                model = object:CheckboxItem.Model {
                    override val title = "Ważny tekst 1"
                    override val value = ""
                    override val defaultValue = "Wybierz"
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                }
            ))

            add(CheckboxItem(
                model = object:CheckboxItem.Model {
                    override val title = "Ważny tekst 1"
                    override val value = ""
                    override val defaultValue = ""
                    override val icon = resources.getDrawable(R.drawable.ic_arrow_down)
                }
            ))

            add(CheckboxItem(
                model = object:CheckboxItem.Model {
                    override val title = "Ważny tekst 2"
                    override val value = null
                    override val defaultValue = null
                    override val icon = resources.getDrawable(R.drawable.ic_info)
                },
                viewStyle = SwitchItem.NullIsNothing
            ))
        }))
    }
}