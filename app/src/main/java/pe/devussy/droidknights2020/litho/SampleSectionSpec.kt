package pe.devussy.droidknights2020.litho

import android.graphics.Color
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.litho.Border
import com.facebook.litho.annotations.FromEvent
import com.facebook.litho.annotations.OnEvent
import com.facebook.litho.annotations.Prop
import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.DataDiffSection
import com.facebook.litho.sections.common.RenderEvent
import com.facebook.litho.sections.common.SingleComponentSection
import com.facebook.litho.sections.widget.ListRecyclerConfiguration
import com.facebook.litho.sections.widget.RecyclerCollectionComponent
import com.facebook.litho.widget.ComponentRenderInfo
import com.facebook.litho.widget.RenderInfo
import pe.devussy.shared.NumberModel
import pe.devussy.shared.dip

@GroupSectionSpec
object SampleSectionSpec {

    @OnCreateChildren
    fun onCreateChildren(
        c: SectionContext?,
        @Prop data: List<NumberModel>
    ): Children = Children.create()
        .apply {
            child(
                SingleComponentSection.create(c)
                    .component(
                        SectionHeader.create(c)
                            .title("Horizontal List")
                    )
            )

            val horizontalItemSpacing = (c?.applicationContext?.dip(8) ?: 0) / 2
            child(
                SingleComponentSection.create(c)
                    .component(
                        RecyclerCollectionComponent.create(c)
                            .itemDecoration(HorizontalItemDecoration(horizontalItemSpacing))
                            .leftPaddingPx(horizontalItemSpacing)
                            .rightPaddingPx(horizontalItemSpacing)
                            .recyclerConfiguration(
                                ListRecyclerConfiguration.create()
                                    .orientation(LinearLayoutManager.HORIZONTAL)
                                    .build()
                            )
                            .section(
                                DataDiffSection.create<NumberModel>(c)
                                    .data(data)
                                    .renderEventHandler(SampleSection.onRenderHorizontal(c))
                            )
                            .canMeasureRecycler(true)
                    )
            )

            child(
                SingleComponentSection.create(c)
                    .component(
                        SectionHeader.create(c)
                            .title("Vertical List")
                    )
            )

            child(
                DataDiffSection.create<NumberModel>(c)
                    .data(data)
                    .renderEventHandler(SampleSection.onRenderVertical(c))
            )
        }
        .build()

    @OnEvent(RenderEvent::class)
    fun onRenderHorizontal(c: SectionContext?, @FromEvent model: NumberModel): RenderInfo? =
        ComponentRenderInfo.create()
            .component(
                Item.create(c)
                    .title(model.value.toString())
                    .titleSize(24f)
                    .backgroundColor(Color.LTGRAY)
                    .border(Border.create(c).build())
                    .build()
            )
            .build()

    @OnEvent(RenderEvent::class)
    fun onRenderVertical(c: SectionContext?, @FromEvent model: NumberModel): RenderInfo? =
        ComponentRenderInfo.create()
            .component(
                Item.create(c)
                    .title("${model.value}: DroidKnights 2020")
                    .titleSize(12f)
                    .build()
            )
            .build()
}

class HorizontalItemDecoration(private val itemSpacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.set(
            itemSpacing,
            0,
            itemSpacing,
            0
        )
    }
}
