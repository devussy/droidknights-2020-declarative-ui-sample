package pe.devussy.droidknights2020.epoxy

import android.graphics.Color
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.carousel
import pe.devussy.shared.NumberModel

class SampleController : TypedEpoxyController<List<NumberModel>>() {

    override fun buildModels(data: List<NumberModel>?) {
        data ?: return

        sectionHeader {
            id("horizontal list header")
            title("Horizontal List")
        }

        carousel {
            id("carousel")
            data.forEach {
                item {
                    id("carousel", it.value.toString())
                    title(it.value.toString())
                    titleSize(24f)
                    color(Color.LTGRAY)
                }
            }
        }

        sectionHeader {
            id("vertical list header")
            title("Vertical List")
        }

        data.forEach {
            item {
                id("item", it.value.toString())
                title("${it.value}: DroidKnights 2020")
                titleSize(12f)
            }
        }
    }
}
