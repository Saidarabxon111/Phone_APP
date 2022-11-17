package uz.saidarabxon.phoneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.saidarabxon.phoneapp.R
import uz.saidarabxon.phoneapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
  private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {
            btnPhones.setOnClickListener{
                findNavController().navigate(R.id.phones2)
            }

            btnAdd.setOnClickListener{
                findNavController().navigate(R.id.addFragment)
            }
        }

        return binding.root
    }


}