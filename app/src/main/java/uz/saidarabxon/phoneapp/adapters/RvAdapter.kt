package uz.saidarabxon.phoneapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import uz.saidarabxon.phoneapp.databinding.ItemRvBinding
import uz.saidarabxon.phoneapp.fragments.Phones
import uz.saidarabxon.phoneapp.models.Phone

class RvAdapter(var list: ArrayList<Phone>,  var rvClick: RvClick) : RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(phone: Phone, position: Int ){

        itemRvBinding.item.text = phone.Pname

            itemRvBinding.card.setOnClickListener {
                rvClick.itemClick(phone)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context) , parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


    interface RvClick {
        fun itemClick(phone: Phone)

    }
}