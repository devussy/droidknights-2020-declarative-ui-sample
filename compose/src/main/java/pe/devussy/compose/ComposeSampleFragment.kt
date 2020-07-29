package pe.devussy.compose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.Composable
import androidx.compose.Recomposer
import androidx.fragment.app.Fragment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.graphics.Color.Companion.LightGray
import androidx.ui.graphics.Color.Companion.Transparent
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Surface
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.Dp
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import pe.devussy.shared.generateNumberModels

class ComposeSampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FrameLayout(inflater.context)
        val data = generateNumberModels()
        view.setContent(Recomposer.current()) {
            VerticalScroller() {
                SectionHeader(title = "Horizontal List")

                HorizontalScroller(modifier = Modifier.padding(horizontal = 4.dp)) {
                    data.forEach {
                        Item(
                            title = it.value.toString(),
                            titleSize = 24f,
                            backgroundColor = LightGray,
                            padding = 4.dp
                        )
                    }
                }

                SectionHeader(title = "Vertical List")

                Column() {
                    data.forEach {
                        Item(
                            title = "${it.value}: DroidKnights 2020",
                            titleSize = 12f
                        )
                    }
                }
            }
        }

        return view
    }

    @Composable
    fun SectionHeader(title: String) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
    }

    @Composable
    private fun Item(
        title: String,
        titleSize: Float,
        backgroundColor: Color = Transparent,
        padding: Dp = 0.dp
    ) {
        Surface(color = backgroundColor, modifier = Modifier.padding(padding)) {
            Text(
                text = title,
                fontSize = titleSize.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
