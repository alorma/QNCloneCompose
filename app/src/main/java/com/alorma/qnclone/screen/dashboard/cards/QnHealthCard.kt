package com.alorma.qnclone.screen.dashboard.cards

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun QnHealthCard() {
    QnBaseCard(
        icon = Icons.Default.FavoriteBorder,
        title = "Health"
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .preferredSize(40.dp),
                contentAlignment = Alignment.Center,
            ) {
                CircularProgressIndicator(
                    progress = 1f,
                    modifier = Modifier.matchParentSize(),
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.24f)
                )
                CircularProgressIndicator(
                    modifier = Modifier.matchParentSize(),
                    progress = 0.39f,
                )
                Text(
                    text = "39%",
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.primary,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                val textStyle = MaterialTheme.typography.subtitle1
                Text(
                    text = "Remaining nicotine in your bloodstream has fallen to less than half of normal peek daily levels",
                    style = textStyle,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
