package com.example.disneyplus

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.databinding.HitFilmlerCardBinding
import com.example.disneyplus.databinding.SanaOzelOnerilerCardBinding

class HitFilmlerAdapter(var mContext: Context, var hitFilmlerListesi:List<Filmler>)
    : RecyclerView.Adapter<HitFilmlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim: HitFilmlerCardBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: HitFilmlerCardBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = HitFilmlerCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = hitFilmlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewHitFilmler.setImageResource(mContext.resources.getIdentifier(film.filmResimAdi,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return hitFilmlerListesi.size
    }
}