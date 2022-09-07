package com.rifqipadisiliwangi.recyclerprovinsi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProvinsiAdapter(val listProvinsi : ArrayList<ListProvinsi>): RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var namaProvinsi = view.findViewById<TextView>(R.id.tv_content_provinsi)
        var namaIbukota = view.findViewById<TextView>(R.id.tv_content_ibukota)
        var imgProvinsi = view.findViewById<ImageView>(R.id.img_content)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_provinsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvinsi.text = listProvinsi[position].provinsi
        holder.namaIbukota.text = listProvinsi[position].provinsi
        holder.imgProvinsi.setImageResource(listProvinsi[position].img)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }
}