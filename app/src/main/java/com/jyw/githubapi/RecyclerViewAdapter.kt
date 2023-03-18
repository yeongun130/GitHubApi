package blackstone.com.githubrepo_rxkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jyw.githubapi.R



class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.mViewHolder>() {

    private val githubRepos: ArrayList<GithubRepo> = ArrayList()

    inner class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id: TextView = itemView.findViewById(R.id.mID)
        var name: TextView = itemView.findViewById(R.id.mName)
        var url: TextView = itemView.findViewById(R.id.mUrl)
        var date: TextView = itemView.findViewById(R.id.mDate)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): mViewHolder = mViewHolder(LayoutInflater.from(p0.context).inflate(
        R.layout.main_item_view, p0, false))

    override fun onBindViewHolder(p0: mViewHolder, p1: Int) {
        p0.id.text = githubRepos[p1].id
        p0.name.text = githubRepos[p1].name
        p0.url.text = githubRepos[p1].url
        p0.date.text = githubRepos[p1].date
    }

    override fun getItemCount(): Int = githubRepos.size

    fun update(githubRepos: ArrayList<GithubRepo>) {
        this.githubRepos.clear()
        this.githubRepos.addAll(githubRepos)
        notifyDataSetChanged()
    }
}