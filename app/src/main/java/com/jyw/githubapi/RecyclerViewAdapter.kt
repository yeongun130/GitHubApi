package com.jyw.githubapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.mViewHolder>() {

    private val githubRepos: ArrayList<GithubRepo> = ArrayList()

    inner class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id: TextView = itemView.findViewById(R.id.mID)
        var name: TextView = itemView.findViewById(R.id.mName)
        var bio: TextView = itemView.findViewById(R.id.mbio)
        var followers: TextView = itemView.findViewById(R.id.mfollowers)
        var following: TextView = itemView.findViewById(R.id.mfollowing)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): mViewHolder = mViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.recyclerview_row, p0, false))

    override fun onBindViewHolder(p0: mViewHolder, p1: Int) {
        p0.id.text = githubRepos[p1].toString()
        p0.name.text = githubRepos[p1].toString()
        p0.bio.text = githubRepos[p1].toString()
        p0.followers.text = githubRepos[p1].toString()
        p0.following.text = githubRepos[p1].toString()
    }

    override fun getItemCount(): Int = githubRepos.size

    fun update(githubRepos: ArrayList<GithubRepo>) {
        this.githubRepos.clear()
        this.githubRepos.addAll(githubRepos)
        notifyDataSetChanged()
    }
}