package woowacourse.paint

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _color = MutableLiveData<ColorPalette>()
    val color: LiveData<ColorPalette> = _color

    private val _width = MutableLiveData<Float>()
    val width: LiveData<Float> = _width

    private val _isErasing = MutableLiveData<Boolean>()
    val isErasing: LiveData<Boolean> = _isErasing

    fun changeColor(color: ColorPalette) {
        _color.value = color
    }

    fun changeWidth(width: Float) {
        _width.value = width
    }

    fun erase() {
        _isErasing.value = true
    }
}