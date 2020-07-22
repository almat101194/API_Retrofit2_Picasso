package kz.almat.myapplicationtest


import com.google.gson.annotations.SerializedName

data class Post(
    val id: Int,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String,
    val email: String,
    val gender: String,
    @SerializedName("ip_address")
    val ipAddress: String,
    val photo: String,
    val employment: Employment
)