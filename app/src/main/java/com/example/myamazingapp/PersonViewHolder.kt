package com.example.myamazingapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_person.view.*

class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(person: Person) {
        with(itemView) {
            person.run {
                nameTextView.text = name
                descriptionTextView.text = description

                Glide.with(context).load(avatarUrl).into(avatarImageView)
            }
        }
    }

}