package com.example.disneyplus

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.databinding.SanaOzelOnerilerCardBinding
import com.example.disneyplus.databinding.UstKisimCardBinding

class SanaOzelAdapter(var mContext: Context,var sanaOzelOnerilerListesi:List<Filmler>)
    : RecyclerView.Adapter<SanaOzelAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:SanaOzelOnerilerCardBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:SanaOzelOnerilerCardBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = SanaOzelOnerilerCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = sanaOzelOnerilerListesi.get(position)
        val t = holder.tasarim
        t.imageViewSanaOzelFilm.setImageResource(mContext.resources.getIdentifier(film.filmResimAdi,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
       return sanaOzelOnerilerListesi.size
    }
}