package com.alorma.qnclone.screen.dashboard.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AmbientContentAlpha
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material.icons.filled.WineBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.alorma.qnclone.ui.onPrimarySurface

@Composable
fun QnAchievementsCard() {
    QnBaseCard(
        icon = Icons.Default.WineBar,
        title = "Achievements"
    ) {
        val imageBgColor = if (MaterialTheme.colors.isLight) {
            MaterialTheme.colors.primary
        } else {
            MaterialTheme.colors.onSurface.copy(alpha = 0.1f)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .preferredSize(56.dp)
                    .clip(RoundedCornerShape(percent = 50))
                    .background(color = imageBgColor)
                    .padding(10.dp),
                imageVector = Icons.Default.AccessibilityNew,
                colorFilter = ColorFilter(
                    color = MaterialTheme.colors.onPrimarySurface,
                    blendMode = BlendMode.SrcIn
                )
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Providers(AmbientContentAlpha provides ContentAlpha.high) {
                    val textStyle = MaterialTheme.typography.subtitle1
                    Text(
                        text = "To infinity and beyond!",
                        style = textStyle,
                        fontWeight = FontWeight.Bold
                    )
                }
                val textStyle = MaterialTheme.typography.body2
                Text(text = "5 cigarettes non-smoked", style = textStyle)
            }
        }
    }
}
