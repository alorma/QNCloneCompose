package com.alorma.qnclone.screen.dashboard.cards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.alorma.qnclone.ui.onPrimarySurface

@Composable
fun QnBaseCard(
    icon: ImageVector,
    title: String,
    content: @Composable BoxScope.() -> Unit
) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp, start = 8.dp, end = 8.dp)
            .fillMaxWidth()
            .clickable(
                onClick = { },
                indication = rememberRipple(color = MaterialTheme.colors.primary)
            ),
        elevation = 4.dp,
    ) {
        Column {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .preferredHeight(36.dp),
                color = MaterialTheme.colors.primarySurface,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        modifier = Modifier.fillMaxHeight(),
                        imageVector = icon,
                        tint = MaterialTheme.colors.onPrimarySurface
                    )
                    Spacer(modifier = Modifier.preferredWidth(8.dp))
                    Text(text = title, color = MaterialTheme.colors.onPrimarySurface)
                }
            }
            Box(modifier = Modifier.padding(all = 8.dp)) {
                content()
            }
        }
    }
}