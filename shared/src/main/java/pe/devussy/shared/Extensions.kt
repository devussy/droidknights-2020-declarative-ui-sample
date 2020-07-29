package pe.devussy.shared

import android.content.Context
import android.view.View
import androidx.annotation.Dimension

fun View.setPadding(@Dimension(unit = Dimension.DP) padding: Int) {
    val paddingPixel = context.dip(padding)
    setPadding(paddingPixel, paddingPixel, paddingPixel, paddingPixel)
}

fun Context.dip(@Dimension(unit = Dimension.DP) value: Int) =
    (value * resources.displayMetrics.density).toInt()
