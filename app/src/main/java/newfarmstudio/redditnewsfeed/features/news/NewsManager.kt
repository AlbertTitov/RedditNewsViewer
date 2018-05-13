package newfarmstudio.redditnewsfeed.features.news

import newfarmstudio.redditnewsfeed.common.RedditNewsItem
import rx.Observable

class NewsManager {

    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.unsafeCreate {

            subscriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title$i",
                        i,
                        1457207701L - i*200,
                        "http://lorempixel.com/200/200/technics/$i",
                        "url"
                ))
            }

            subscriber.onNext(news)
        }
    }
}