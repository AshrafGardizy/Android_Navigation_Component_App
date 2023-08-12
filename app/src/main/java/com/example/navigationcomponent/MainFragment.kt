package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainFragment : Fragment(),View.OnClickListener {
    private lateinit var navController:NavController
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<AppCompatButton>(R.id.button_gotoA).setOnClickListener(this)
        view.findViewById<AppCompatButton>(R.id.button_gotoB).setOnClickListener(this)
        view.findViewById<AppCompatButton>(R.id.button_gotoC).setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_gotoA ->{navController.navigate(R.id.action_mainFragment_to_AFragment)}
            R.id.button_gotoB->{navController.navigate(R.id.action_mainFragment_to_BFragment)}
            R.id.button_gotoC ->{navController.navigate(R.id.action_mainFragment_to_CFragment)}
        }
    }


}