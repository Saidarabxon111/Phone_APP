package uz.saidarabxon.phoneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import uz.saidarabxon.phoneapp.adapters.RvAdapter
import uz.saidarabxon.phoneapp.databinding.FragmentAddBinding
import uz.saidarabxon.phoneapp.models.Phone


class AddFragment : Fragment() {
  private lateinit var binding: FragmentAddBinding
  private lateinit var rvAdapter: RvAdapter
  private lateinit var list:ArrayList<Phone>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentAddBinding.inflate(layoutInflater)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }


            binding.btnSave.setOnClickListener {
                val phone =Phone(
                    binding.phoneName.text.toString(),
                    binding.aboutPhone.text.toString()

                )

//                rvAdapter = RvAdapter(list,this)


                Toast.makeText(binding.root.context, "saqlandi", Toast.LENGTH_SHORT).show()



        }


        return binding.root

    }



}