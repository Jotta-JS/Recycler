package com.example.recycler

import com.example.recycler.models.Live

class DataSource {
    companion object{

        fun createDataSet() : ArrayList<Live>{

            val list = ArrayList<Live>()

            list.add(
                Live(
                    "Como criar seu primeiro aplicativo com RecyclerViews",
                    "Android Teacher",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )
            list.add(
                Live(
                    "Como criar seu primeiro aplicativo com RecyclerViews",
                    "Android Teacher",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )
            list.add(
                Live(
                    "Como criar seu primeiro aplicativo com RecyclerViews",
                    "Android Teacher",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )
            list.add(
                Live(
                    "Como criar seu primeiro aplicativo com RecyclerViews",
                    "Android Teacher",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )
            list.add(
                Live(
                    "Como criar seu primeiro aplicativo com RecyclerViews",
                    "Android Teacher",
                    "https://i3.ytimg.com/vi/7jvIJPgpcPs/maxresdefault.jpg",
                    "https://youtu.be/7jvIJPgpcPs"
                )
            )

            return list
        }

    }
}