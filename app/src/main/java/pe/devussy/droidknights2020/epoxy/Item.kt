package pe.devussy.droidknights2020.epoxy

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import pe.devussy.shared.setPadding

@ModelView(autoLayout = ModelView.Size.WRAP_WIDTH_WRAP_HEIGHT)
class Item @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        setPadding(16)
        setTextColor(Color.BLACK)
    }

    @TextProp
    fun setTitle(title: CharSequence) {
        text = title
    }

    @ModelProp
    fun setTitleSize(size: Float) {
        textSize = size
    }

    @ModelProp
    fun setColor(@ColorInt color: Int) {
        setBackgroundColor(color)
    }
}
