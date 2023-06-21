package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recycler.databinding.ResItemLiveBinding
import com.example.recycler.models.Live


// Criando classe do Adapter, essa classe herda de um Adapter da classe RecycleView, e contém o ViewHolder
//basicamente o RecyclerView USA o Adapter que está sendo criando, e esse adapter vai gerenciar os items da lista
class LiveAdapter(private val onItemClicked : (Live) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items : List<Live> = ArrayList()// lista que contém os itens usados

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is LiveViewHolder ->{
                holder.bind(items[position], onItemClicked)
                //como é um objeto do tipo LiveViewHolder, estou passando o método bind com a array que foi criada
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(lives: List<Live>){
        this.items = lives
    }


    //criando ViewHolder, ele é uma representação do layout xml em Kotlin, segura esse layout
    class LiveViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        //esses itens estão sendo exportados diretamente do xml, segurando CTRL e colocando o mouse em cima de title
        // você verá que ele vem do arquivo xml

        private val liveTitle = itemView.findViewById<TextView>(R.id.title)
        private val liveAuthor = itemView.findViewById<TextView>(R.id.author)
        private val liveThumbnail= itemView.findViewById<ImageView>(R.id.thumbnail)

        fun bind(live: Live, onItemClicked: (Live) -> Unit){
            //está substituindo o texto que está no layout pelo texto do objeto live que criamos nos dados mockados
            liveTitle.text = live.title
            liveAuthor.text = live.author

            val requessOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requessOptions)
                .load(live.thumbnailUrl)
                .into(liveThumbnail)

            itemView.setOnClickListener{
                onItemClicked(live)
            }
        }
    }

}