package com.iciciappathon.retailbook.utils

import android.databinding.BindingAdapter
import android.graphics.Bitmap
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import com.bumptech.glide.Glide

object BindingUtils {
    @JvmStatic
    @BindingAdapter("adapter", "layout_manager")
    fun setupRecyclerView(recyclerView: RecyclerView?,
                          adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>,
                          layoutManager: RecyclerView.LayoutManager) {
        recyclerView!!.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun setImageFromUrl(imageView: ImageView?, imageUrl: String?) {
        Glide.with(imageView!!.context).load(imageUrl).into(imageView)
    }

    @JvmStatic
    @BindingAdapter("bitmap")
    fun setImageBitmap(imageView: ImageView?, bitmap: Bitmap?) {
        imageView!!.setImageBitmap(bitmap!!)
    }

    @JvmStatic
    @BindingAdapter("android:src")
    fun setImageViewResource(imageView: ImageView?, resource: Int?) {
        imageView!!.setImageResource(resource!!)
    }
}