package newfarmstudio.redditnewsfeed.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import newfarmstudio.redditnewsfeed.R
import newfarmstudio.redditnewsfeed.common.adapter.ViewType
import newfarmstudio.redditnewsfeed.common.adapter.ViewTypeDelegateAdapter
import newfarmstudio.redditnewsfeed.common.extensions.inflate

class LoadingDelegateAdapter: ViewTypeDelegateAdapter {


    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {}

    class LoadingViewHolder(parent: ViewGroup): RecyclerView.ViewHolder (
        parent.inflate(R.layout.news_item_loading)
    )
}