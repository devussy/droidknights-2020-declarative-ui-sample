package pe.devussy.droidknights2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import pe.devussy.droidknights2020.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.compose.setOnClickListener {
            findNavController().navigate(R.id.composeSampleFragment)
        }

        binding.litho.setOnClickListener {
            findNavController().navigate(R.id.lithoSampleFragment)
        }

        binding.epoxy.setOnClickListener {
            findNavController().navigate(R.id.epoxySampleFragment)
        }
    }

    override fun onDestroyView() {
        _binding = null

        super.onDestroyView()
    }
}
