package gteamproject.shere.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import gteamproject.shere.R

class FindPlaceFragment : Fragment() {

    private lateinit var findPlaceViewModel: FindPlaceViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_findplace, container, false)
//        dashboardViewModel =
//            ViewModelProvider(this).get(DashboardViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//        return root
    }
}