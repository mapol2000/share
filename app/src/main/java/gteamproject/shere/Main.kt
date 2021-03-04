package gteamproject.shere

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import gteamproject.shere.fragments.HomeFragment
import gteamproject.shere.fragments.MagazineFragment
import gteamproject.shere.fragments.MypageFragment
import gteamproject.shere.fragments.PlaceFragment

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val placeFragment = PlaceFragment()
        val magazineFragment = MagazineFragment()
        val mypageFragment = MypageFragment()

        makeCurrentFragment(homeFragment)

        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_place -> makeCurrentFragment(placeFragment)
                R.id.ic_magazine -> makeCurrentFragment(magazineFragment)
                R.id.ic_mypage -> makeCurrentFragment(mypageFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}