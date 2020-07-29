package pe.devussy.droidknights2020.litho

import android.graphics.Typeface
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge

@LayoutSpec
object SectionHeaderSpec {

    @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext,
        @Prop title: String
    ): Component = Text.create(c)
        .paddingDip(YogaEdge.ALL, 16f)
        .text(title)
        .typeface(Typeface.DEFAULT_BOLD)
        .build()
}
