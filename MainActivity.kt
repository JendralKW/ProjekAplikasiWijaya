package com.wijaya.aplikasiwijaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Klub>
    lateinit var imgitem : Array<Int>
    lateinit var nama : Array<String>
    lateinit var detil : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgitem = arrayOf(
            R.drawable.barcelona,
            R.drawable.madrid,
            R.drawable.manu,
            R.drawable.mancity,
            R.drawable.chelsea,
            R.drawable.liverpool,
            R.drawable.arsenal,
            R.drawable.juventus,
            R.drawable.acmilan,
            R.drawable.intermilan,
            R.drawable.munchen,
            R.drawable.dortmund
        )

        nama = arrayOf(
            "Barcelona",
            "Real Madrid",
            "Manchester United",
            "Manchester City",
            "Chelsea",
            "Liverpool",
            "Arsenal",
            "PSG",
            "Juventus",
            "AC Milan",
            "Inter MIlan",
            "Bayer Munchen",
            "Dortmund"
        )

        detil = arrayOf(
            "Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol, yang ikut serta di kompetisi tertinggi sepak bola Spanyol, La Liga.",
            "Real Madrid Club de Fútbol, umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris dengan piala EPL terbanyak di inggris.",
            "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.",
            "Chelsea Football Club adalah sebuah klub sepak bola yang bermarkas di Fulham, London. Didirikan pada 1905, klub ini kini berkompetisi di Liga Utama Inggris dan memainkan pertandingan kandang mereka di Stamford Bridge.",
            "Liverpool Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya.",
            "Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square",
            "Paris Saint-Germain Football Club atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan dengan Stade Saint-Germain.",
            "Juventus Football Club S.p.A., biasa disebut sebagai Juventus dan populer dengan nama Juve, adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte.",
            "Associazione Calcio Milan, sering disebut sebagai A.C. Milan, adalah klub raksasa Italia Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih, sehingga dijuluki rossoneri.",
            "Football Club Internazionale Milano, atau yang dikenal dengan nama Internazionale ataupun juga Inter, dan bahasa sehari-hari dikenal sebagai Inter Milan di luar Italia, adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia. ",
            "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern Munchen, FC Bayern Minga, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bayern",
            "Ballspielverein Borussia 09 e.V. Dortmund umumnya dikenal sebagai Borussia Dortmund, atau BVB, adalah klub sepak bola Jerman yang berbasis di Dortmund, Rhine-Westphalia Utara."
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Klub>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imgitem.indices){
            val klub = Klub(imgitem[i],nama[i],detil[i])
            newArrayList.add(klub)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    // langkah 5 beriisikan data array yang akan jadi isi data
    }
}
