package pe.devussy.droidknights2020.litho

import android.graphics.Color
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.*
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge

@LayoutSpec
object ItemSpec {

    @OnCreateLayout
    fun onCreateLayout(
        c: ComponentContext,
        @Prop title: String,
        @Prop(optional = true) titleSize: Float
    ): Component = Text.create(c)
        .paddingDip(YogaEdge.ALL, 16f)
        .text(title)
        .textSizeSp(titleSize)
        .textColor(Color.BLACK)
        .build()
}
