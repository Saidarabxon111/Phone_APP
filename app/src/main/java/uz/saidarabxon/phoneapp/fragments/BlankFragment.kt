package uz.saidarabxon.phoneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.saidarabxon.phoneapp.R
import uz.saidarabxon.phoneapp.databinding.FragmentBlankBinding
import uz.saidarabxon.phoneapp.models.Phone

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding
    private lateinit var list:ArrayList<Phone>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding =FragmentBlankBinding.inflate(layoutInflater)
        val phone =arguments?.getSerializable("key")as Phone

        binding.tvAbout.text =phone.about

        return binding.root
    }

   }