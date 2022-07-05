package com.example.disneyplus

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneyplus.databinding.EnCokIzlenenlerCardBinding
import com.example.disneyplus.databinding.UstKisimCardBinding

class EnCokIzlenenAdapter(var mContext: Context, var enCokIzlenenListesi:List<Filmler>) : RecyclerView.Adapter<EnCokIzlenenAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim: EnCokIzlenenlerCardBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: EnCokIzlenenlerCardBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = EnCokIzlenenlerCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = enCokIzlenenListesi.get(position)
        val t = holder.tasarim
        t.imageViewEnCokZlenen.setImageResource(mContext.resources.getIdentifier(film.filmResimAdi,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return enCokIzlenenListesi.size
    }


}