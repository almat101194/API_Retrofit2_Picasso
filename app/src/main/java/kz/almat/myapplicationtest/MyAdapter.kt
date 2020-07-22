package kz.almat.myapplicationtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.post_row.view.*

class MyAdapter(private val posts: List<Post>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]
        holder.firstName.text = post.firstName
        holder.lastName.text = post.lastName
        holder.mail.text = post.email
        holder.gender.text = post.gender
        holder.ipAddress.text = post.ipAddress
        holder.company.text = post.employment.position
        holder.position.text = post.employment.position

        Picasso.get().load(post.photo).into(holder.img)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.firstName
        val lastName: TextView = itemView.lastname
        val mail: TextView = itemView.email
        val gender: TextView = itemView.gender
        val ipAddress: TextView = itemView.ipAddress
        val company: TextView = itemView.company
        val position: TextView = itemView.position
        val img: ImageView = itemView.imgView
    }
}
