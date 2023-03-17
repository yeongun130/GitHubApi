package com.jyw.githubapi

import com.google.gson.annotations.SerializedName

class GithubRepo {

    data class GithubRepo(
        @SerializedName("name") val name: String,
        @SerializedName("id") val id: String,
        @SerializedName("bio") val bio: String,
        @SerializedName("followers") val followers: String,
        @SerializedName("following") val following: String)
}