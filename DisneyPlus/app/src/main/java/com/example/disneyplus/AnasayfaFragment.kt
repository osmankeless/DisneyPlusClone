package com.example.disneyplus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.disneyplus.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
       tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.rvUst.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        tasarim.rvSanaOzel.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        tasarim.recyclerViewHitFilmler.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        tasarim.rvEnCokIzlenen.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val ustFilmlerListesi = ArrayList<Filmler>()
        val f1 =Filmler(1,"Obi-Van Kenobi","obivankenobi")
        val f2 =Filmler(2,"Mandalorian","mandalorian")
        val f3 =Filmler(3,"Kaçış","kacis")
        val f4 =Filmler(4,"Enkanto","enkanto")
        val f5 =Filmler(5,"Punisher","punisher")
        val f6 =Filmler(6,"Thor Ragnarok","thorragnarok")
        val f7 =Filmler(7,"The Walking Dead","walkingdead")

        ustFilmlerListesi.add(f1)
        ustFilmlerListesi.add(f2)
        ustFilmlerListesi.add(f3)
        ustFilmlerListesi.add(f4)
        ustFilmlerListesi.add(f5)
        ustFilmlerListesi.add(f6)
        ustFilmlerListesi.add(f7)

        val sanaOzelOnerilerListesi = ArrayList<Filmler>()
        val s1 =Filmler(1,"Enkanto","enkantoo")
        val s2 =Filmler(2,"Loki","loki")
        val s3 =Filmler(3,"Free Guy","freeguy")
        val s4 =Filmler(4,"Kaçış","kaciss")
        val s5 =Filmler(5,"Grey's Anatomy","greysanatomy")
        val s6 =Filmler(6,"Mandalorian","mandaloriann")
        val s7 =Filmler(7,"Prison Break","prisonbreak")
        val s8 =Filmler(8,"The Kardashians","thekardashians")


        sanaOzelOnerilerListesi.add(s1)
        sanaOzelOnerilerListesi.add(s2)
        sanaOzelOnerilerListesi.add(s3)
        sanaOzelOnerilerListesi.add(s4)
        sanaOzelOnerilerListesi.add(s5)
        sanaOzelOnerilerListesi.add(s6)
        sanaOzelOnerilerListesi.add(s7)
        sanaOzelOnerilerListesi.add(s8)

        val hitFilmlerListesi = ArrayList<Filmler>()

        val h1 = Filmler(1,"Shang-Chi","shangchi")
        val h2 = Filmler(2,"İnanılmaz Aile 2","inanaile")
        val h3 = Filmler(3,"Daredevil","daredevil")
        val h4 = Filmler(4,"Iron Fist","ironfist")
        val h5 = Filmler(5,"Soprano","soprano")
        val h6 = Filmler(6,"Atlanta","atlanta")
        val h7 = Filmler(7,"Rise","rise")
        val h8 = Filmler(8,"The Kardashians","thekardashians")

        hitFilmlerListesi.add(h1)
        hitFilmlerListesi.add(h2)
        hitFilmlerListesi.add(h3)
        hitFilmlerListesi.add(h4)
        hitFilmlerListesi.add(h5)
        hitFilmlerListesi.add(h6)
        hitFilmlerListesi.add(h7)
        hitFilmlerListesi.add(h8)

        val enCokIzlenenListesi = ArrayList<Filmler>()

        val e1 = Filmler(1,"Dropout","dropout")
        val e2 = Filmler(2,"Princess","princess")
        val e3 = Filmler(3,"Lost","lost")
        val e4 = Filmler(4,"Modern family","modernfam")
        val e5 = Filmler(5,"How I Met Your Mother","howimetmot")
        val e6 = Filmler(6,"Family Guy","famguy")
        val e7 = Filmler(7,"Walking Dead","walkingdeadd")
        val e8 = Filmler(8,"Kaçış","kaciss")

        enCokIzlenenListesi.add(e1)
        enCokIzlenenListesi.add(e2)
        enCokIzlenenListesi.add(e3)
        enCokIzlenenListesi.add(e4)
        enCokIzlenenListesi.add(e5)
        enCokIzlenenListesi.add(e6)
        enCokIzlenenListesi.add(e7)
        enCokIzlenenListesi.add(e8)










        val ustFilmlerdapter = UstFimlerAdapter(requireContext(),ustFilmlerListesi)
        tasarim.rvUst.adapter = ustFilmlerdapter

        val sanaOzelAdapter = SanaOzelAdapter(requireContext(),sanaOzelOnerilerListesi)
        tasarim.rvSanaOzel.adapter = sanaOzelAdapter

        val hitFilmlerAdapter = HitFilmlerAdapter(requireContext(),hitFilmlerListesi)
        tasarim.recyclerViewHitFilmler.adapter = hitFilmlerAdapter

        val enCokIzlenenAdapter = EnCokIzlenenAdapter(requireContext(),enCokIzlenenListesi)
        tasarim.rvEnCokIzlenen.adapter = enCokIzlenenAdapter






        return tasarim.root
    }


}