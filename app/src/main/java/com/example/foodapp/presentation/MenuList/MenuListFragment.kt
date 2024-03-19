package com.example.foodapp.presentation.MenuList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.foodapp.R
import com.example.foodapp.data.datasource.FoodDataSource
import com.example.foodapp.data.datasource.FoodDataSourceImpl
import com.example.foodapp.databinding.FragmentMenuListBinding
import com.example.foodapp.model.ListMenu
import com.example.foodapp.presentation.MenuList.adapter.ListMenuAdapter


class MenuListFragment : Fragment() {

    private lateinit var binding : FragmentMenuListBinding
    private var adapter : ListMenuAdapter? = null
    private val dataSource : FoodDataSource by lazy {FoodDataSourceImpl()}
    private var isUsingGridMode : Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMenuListBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindMenuList(isUsingGridMode)
        setButtonImage(isUsingGridMode)
        setClickAction()
    }

    private fun setClickAction() {
        binding.btnChangeListMode.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            setButtonImage(isUsingGridMode)
            bindMenuList(isUsingGridMode)
        }

    }

    private fun setButtonImage(usingGridMode: Boolean) {
        val iconResId = if (usingGridMode) R.drawable.ic_grid else R.drawable.ic_list
        binding.btnChangeListMode.setCompoundDrawablesWithIntrinsicBounds(iconResId, 0, 0, 0)
    }

    private fun bindMenuList(isUsingGrid : Boolean) {

        val listMode = if(isUsingGrid) ListMenuAdapter.MODE_GRID else ListMenuAdapter.MODE_LIST
        adapter = ListMenuAdapter(
            listMode = listMode,
            listener = object : ListMenuAdapter.OnItemClickedListener<ListMenu>{
                override fun onItemClicked(item: ListMenu) {
                    navigateToDetail(item)
                }

            })
        binding.rvMenuList.apply {
            adapter = this@MenuListFragment.adapter
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGrid) 2 else 1)
        }
        adapter?.submitData(dataSource.getListMenu())
    }

    private fun navigateToDetail(item: ListMenu) {
        Toast.makeText(requireContext(), item.name  , Toast.LENGTH_SHORT).show()
    }
}