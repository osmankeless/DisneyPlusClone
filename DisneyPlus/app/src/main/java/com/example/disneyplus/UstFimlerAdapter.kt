package com.example.disneyplus

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.databinding.UstKisimCardBinding

class UstFimlerAdapter(var mContext: Context,var ustFilmlerListesi:List<Filmler>) :RecyclerView.Adapter<UstFimlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim:UstKisimCardBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:UstKisimCardBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = UstKisimCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = ustFilmlerListesi.get(position)
        val t = holder.tasarim
        t.imageViewUstFilmResim.setImageResource(mContext.resources.getIdentifier(film.filmResimAdi,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
       return ustFilmlerListesi.size
    }


}