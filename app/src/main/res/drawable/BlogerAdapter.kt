package drawable



import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mybloger.R

data class BlogerAdapter(var bloggerList: List<Blogger>):
    RecyclerView.Adapter<BloggerViewHolder>(

    ){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BloggerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.bloger_display_item ,parent,false)
        return  BloggerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BloggerViewHolder, position: Int) {
        val blogger = bloggerList[position]
        holder.tvAuthor.text = blogger.author
        holder.tvTitle.text = blogger.title
        holder.tvDoP.text = blogger.publishingDate
        holder.tvPreview.text = blogger.preview


    }

    override fun getItemCount(): Int {
        return bloggerList.size
    }
}


class BloggerViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvDoP = itemView.findViewById<TextView>(R.id.tvDoP)
    val tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)

}