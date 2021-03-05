package gteamproject.shere.fragments

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.CarouselView
import gteamproject.shere.R

class HomeFragment : Fragment() {

    // 메인 화면 슬라이드 샘플 이미지가 들어갈 곳
    var sampleImages = intArrayOf(
        R.drawable.paris,
        R.drawable.moscow,
        R.drawable.dubai,
        R.drawable.uk
    )

    var cities = arrayOf("Paris", "Dubai", "United Kingdom", "Moscow")

    lateinit var firstSlide: CarouselView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

        firstSlide.pageCount = cities.size
        firstSlide.setImageListener { position, imageView ->
            imageView.setImageResource(sampleImages[position])
        }

    }

}
