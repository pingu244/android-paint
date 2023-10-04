package woowacourse.paint.customView.colorSelection

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import woowacourse.paint.ColorPalette
import woowacourse.paint.databinding.ViewColorSelectionBinding

class ColorSelectionView(
    context: Context,
    attrs: AttributeSet? = null,
    click: (ColorPalette) -> Unit,
) : ConstraintLayout(context, attrs) {

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, {})

    private val binding: ViewColorSelectionBinding =
        ViewColorSelectionBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        binding.rvColorPalette.adapter = ColorSelectionAdapter(click)
    }
}
