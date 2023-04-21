package com.example.listdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listdata.databinding.ListDataBinding

class FollowingAdapter(private val mList: List<Data>) :
    RecyclerView.Adapter<FollowingAdapter.ViewHolder>() {
    private lateinit var nListBinding: ListDataBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        nListBinding =
            ListDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)


        return ViewHolder(nListBinding.root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemDetail = mList[position]
        nListBinding.model = itemDetail
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    }


}