package com.kola.potterapi.ui
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
import com.kola.potterapi.R

class CharactersAdapter(val characters: List<Result>): RecyclerView.Adapter<CharactersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CharactersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent, false)
        return CharactersViewHolder(view)
    }

    override fun getItemCount(): Int {
        return characters.size
    }

 
    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        return holder.bind(characters[position])
    }


}

class  CharactersViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
    private val id:TextView = itemView.findViewById(R.id.character_id)
    private val wand:TextView = itemView.findViewById(R.id.character_wand)
    private val patronus:TextView = itemView.findViewById(R.id.character_patronus)

    fun bind(character: Result) {
        id.text = "Title: "+character.characterId
        wand.text = character.wand
        patronus.text = "Rating : "+character.patronus.toString()
    }
}
