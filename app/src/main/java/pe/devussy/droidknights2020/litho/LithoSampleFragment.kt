package pe.devussy.droidknights2020.litho

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.widget.RecyclerCollectionComponent
import pe.devussy.droidknights2020.databinding.FragmentLithoSampleBinding
import pe.devussy.shared.generateNumberModels

class LithoSampleFragment : Fragment() {

    private var _binding: FragmentLithoSampleBinding? = null

    private val binding get() = _binding!!
    private val sectionContext: SectionContext by lazy { SectionContext(context) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLithoSampleBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setComponent(
            RecyclerCollectionComponent.create(sectionContext)
                .disablePTR(true)
                .section(
                    SampleSection.create(sectionContext)
                        .data(generateNumberModels())
                        .build()
                )
                .build()
        )
    }

    override fun onDestroyView() {
        _binding = null

        super.onDestroyView()
    }
}
