package com.example.listdata

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listdata.databinding.ImagesHolderBinding

class ViewPagerTabAdapter(private val mList: List<Title>) :
    RecyclerView.Adapter<ViewPagerTabAdapter.ViewHolder>() {
    private lateinit var binding:ImagesHolderBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.images_holder, parent, false)


        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]
        binding.model=itemsViewModel






    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {




    }
}