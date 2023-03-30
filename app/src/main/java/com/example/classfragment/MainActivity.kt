package com.example.classfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.classfragment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        val firstFragment = BlankFragment()
//        val secondFragment = SecondFragment()
//
//
//        binding.btnFragment1.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(
//                    R.id.flFragment, firstFragment
//                )
//                addToBackStack(null)
//                commit()
//            }
//        }
//
//
//        binding.btnFragment2.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment, secondFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }
        val images = listOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Unselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Reselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
        })


    }
}