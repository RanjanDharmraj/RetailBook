package com.iciciappathon.retailbook.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductDatail(

    @SerializedName("id")
    @Expose
    val productId: String,

    @SerializedName("productName")
    @Expose
    val productName: String,

    @SerializedName("productDescription")
    @Expose
    val productDescription: String,

    @SerializedName("productCategory")
    @Expose
    val productCategory: String,

    @SerializedName("productSubCategory")
    @Expose
    val productSubCategory: String,

    @SerializedName("productPrice")
    @Expose
    val productPrice: Double,

    @SerializedName("productMrp")
    @Expose
    val productMrp: Double,

    @SerializedName("productImageUrl")
    @Expose
    val productImageUrl: String

    )