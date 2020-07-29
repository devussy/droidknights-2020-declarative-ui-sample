package pe.devussy.droidknights2020.epoxy

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import pe.devussy.shared.setPadding

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class SectionHeader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        setPadding(16)
        typeface = Typeface.DEFAULT_BOLD
    }

    @TextProp
    fun setTitle(title: CharSequence) {
        text = title
    }
}
