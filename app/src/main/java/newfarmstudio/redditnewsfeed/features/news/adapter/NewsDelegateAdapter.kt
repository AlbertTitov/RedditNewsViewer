package newfarmstudio.redditnewsfeed.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import newfarmstudio.redditnewsfeed.R
import newfarmstudio.redditnewsfeed.common.RedditNewsItem
import newfarmstudio.redditnewsfeed.common.adapter.ViewType
import newfarmstudio.redditnewsfeed.common.adapter.ViewTypeDelegateAdapter
import newfarmstudio.redditnewsfeed.common.extensions.getFriendlyTime
import newfarmstudio.redditnewsfeed.common.extensions.inflate
import newfarmstudio.redditnewsfeed.common.extensions.loadImg

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}