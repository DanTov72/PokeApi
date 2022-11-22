package com.example.pokeapi.base

import androidx.recyclerview.widget.DiffUtil

interface BaseDiffUtilModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean
}

class BaseDiffUtilItemCallback<T : BaseDiffUtilModel<S>, S> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem

}