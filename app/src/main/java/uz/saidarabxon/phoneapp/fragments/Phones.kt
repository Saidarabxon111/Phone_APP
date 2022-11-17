package uz.saidarabxon.phoneapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import uz.saidarabxon.phoneapp.R
import uz.saidarabxon.phoneapp.adapters.RvAdapter
import uz.saidarabxon.phoneapp.databinding.FragmentPhonesBinding
import uz.saidarabxon.phoneapp.models.Phone


class Phones : Fragment(),RvAdapter.RvClick {
  private lateinit var binding: FragmentPhonesBinding
  private lateinit var rvAdapter: RvAdapter
  private lateinit var list:ArrayList<Phone>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentPhonesBinding.inflate(layoutInflater)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
        list = ArrayList()

        rvAdapter = RvAdapter(list,this)
        binding.rv.adapter =rvAdapter

        list.add(Phone("Iphone","> Qo‘sh kamera: 12MP keng (asosiy) va ultrakeng;\n" +
                "> Video yozuv: Dolby Vision HDR, 30 kadr/sekund;\n" +
                "> Akkumulyator avtonomligi: 17 soat video tomoshasi;\n" +
                "> Displey: Super Retina XDR, 6.1 dyuym;\n" +
                "> Suvga chidamlilik: 6 metr/30 daqiqa;\n" +
                "> Ekran rezolyusiyasi: 2532x1170 (460 piksel/dyuym);\n" +
                "> Xotira: 64/128/256GB;\n" +
                "> Chip: A14 Bionic;\n" +
                "> Korpus mahsuloti: alyuminiy;\n" +
                "> Ranglar: ko‘k, yashil, qizil, oq, qora;\n" +
                "> Narxi: 799 AQSh dollari."))
//        list.add(Phone("Iphone"," telefon"))
//        list.add(Phone("Iphone","Zo'r "))
//        list.add(Phone("Iphone","Zo'r telefon"))

        return binding.root

    }

    override fun itemClick(phone: Phone) {
        findNavController().navigate(R.id.blankFragment, bundleOf("key" to phone))
    }


}