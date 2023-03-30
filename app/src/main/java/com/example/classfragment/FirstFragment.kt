package com.example.classfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.classfragment.databinding.FragmentBlankBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


private lateinit var binding: FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_blank, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentBlankBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
    }


}