package woowacourse.paint.model

import androidx.annotation.ColorRes
import woowacourse.paint.R

enum class ColorPalette(@ColorRes val color: Int) {
    BLACK(R.color.black),
    RED(R.color.red),
    ORANGE(R.color.orange),
    YELLOW(R.color.yellow),
    GREEN(R.color.green),
    BLUE(R.color.blue),
}
