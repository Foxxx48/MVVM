package com.fox.mvvm.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.fox.mvvm.R
import com.fox.mvvm.databinding.CategoriesBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class Categories : Fragment() {

    private var binding: CategoriesBinding? = null
    private var categoryAdapter: CategoryAdapter? = null
    val categoriesViewModel: CategoriesViewModel by viewModel()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.categories, container, false)

        initRecyclerCategories()

        loadCategories()

        return binding?.root


    }

    private fun initRecyclerCategories(){
        binding?.recyclerCategories?.layoutManager = LinearLayoutManager(context)
        categoryAdapter = CategoryAdapter()
        binding?.recyclerCategories?.adapter = categoryAdapter

    }

    private fun loadCategories(){
        categoriesViewModel.loadCategories.observe(viewLifecycleOwner, Observer {
            categoryAdapter?.setList(it)
            categoryAdapter?.notifyDataSetChanged()
        })
    }
}