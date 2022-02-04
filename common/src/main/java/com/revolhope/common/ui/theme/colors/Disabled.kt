package com.revolhope.common.ui.theme.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.revolhope.common.ui.theme.colors.alpha

@Composable
fun Color.disableOver(alpha: Float = .4f, other: Color): Color =
    alpha(alpha = alpha).over(other = other)

@Composable
fun Color.disableOverSurface(alpha: Float = .4f): Color =
    alpha(alpha = alpha).overSurface()