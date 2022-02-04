package com.revolhope.common.ui.theme.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Color.alpha(alpha: Float): Color =
    copy(alpha = alpha)