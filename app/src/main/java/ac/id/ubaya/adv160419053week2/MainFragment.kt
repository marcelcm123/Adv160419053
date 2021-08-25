package ac.id.ubaya.adv160419053week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val random = Random()
        val no1 = random.nextInt()
        val no2= random.nextInt()
        val soal = no1+no2
        btnSubmit.setOnClickListener {
            val jawaban = txtJawaban.text.toString()
            var skor=0
            if(jawaban==soal.toString()){
                skor= 0+1
                val action = MainFragmentDirections.actionGameFragment(jawaban,skor)
                Navigation.findNavController(it).navigate(action)
            }else{

            }

        }
    }


}