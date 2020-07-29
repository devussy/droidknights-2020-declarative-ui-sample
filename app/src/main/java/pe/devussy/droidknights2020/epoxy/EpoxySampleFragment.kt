package pe.devussy.droidknights2020.epoxy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.Carousel
import pe.devussy.droidknights2020.databinding.FragmentEpoxySampleBinding
import pe.devussy.shared.generateNumberModels

class EpoxySampleFragment : Fragment() {

    private var _binding: FragmentEpoxySampleBinding? = null

    private val binding get() = _binding!!
    private val controller by lazy { SampleController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEpoxySampleBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Carousel.setDefaultGlobalSnapHelperFactory(null)
        binding.epoxyRecyclerView.setController(controller)
    }

    override fun onResume() {
        super.onResume()

        controller.setData(generateNumberModels())
    }

    override fun onDestroyView() {
        _binding = null

        super.onDestroyView()
    }
}
