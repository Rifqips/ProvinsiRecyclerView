package com.rifqipadisiliwangi.recyclerprovinsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val laymngr = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        var adapterProvinsi = ProvinsiAdapter(listProvinsi = arrayListOf(
            ListProvinsi("DKI Jakarta","Jakarta",R.drawable.ic_jakarta),
            ListProvinsi("Bali","Denpasar",R.drawable.ic_bali),
            ListProvinsi("Banten","Serang",R.drawable.ic_banten),
            ListProvinsi("Jawa Barat","Bandung",R.drawable.ic_jabar),
            ListProvinsi("Jambi","Jambi",R.drawable.ic_jambi),
            ListProvinsi("Jawa Tengah","Semarang",R.drawable.ic_jateng),
            ListProvinsi("Jawa Timur","Surabaya",R.drawable.ic_jatim),
            ListProvinsi("Yogyakarta","JakaYogyakartarta",R.drawable.ic_jogja),
            ListProvinsi("Nusa Tenggara Barat","Mataram",R.drawable.ic_ntb),
            ListProvinsi("Nusa Tenggara Timur","Kupang",R.drawable.ic_ntt,)))

        rv_provinsi.layoutManager = laymngr
        rv_provinsi.adapter = adapterProvinsi

    }
}