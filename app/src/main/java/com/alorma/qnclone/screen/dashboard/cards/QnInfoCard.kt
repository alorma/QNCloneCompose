package com.alorma.qnclone.screen.dashboard.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alorma.qnclone.ui.onPrimarySurface

@Composable
fun QnInfoCard() {
    Card(
        modifier = Modifier
            .padding(top = 8.dp, start = 8.dp, end = 8.dp)
            .fillMaxWidth()
            .clickable(
                onClick = { },
                indication = rememberRipple(color = MaterialTheme.colors.primary)
            ),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
        ) {
            AvatarColumn()
            InfoColumn()
        }
    }
}

@Composable
private fun AvatarColumn() {
    val avatarColumnModifier = if (MaterialTheme.colors.isLight) {
        Modifier.background(color = MaterialTheme.colors.primary)
    } else {
        Modifier
    }
    Column(
        modifier = Modifier
            .fillMaxWidth(0.30f)
            .fillMaxHeight()
            .then(avatarColumnModifier),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .padding(8.dp)
                .preferredSize(72.dp)
                .clip(RoundedCornerShape(percent = 50))
                .background(
                    color = MaterialTheme.colors.onSurface
                        .copy(alpha = 0.2f)
                        .compositeOver(
                            MaterialTheme.colors.background
                        )
                )
                .padding(14.dp),
            imageVector = Icons.Default.AccessibilityNew,
            colorFilter = ColorFilter(
                color = MaterialTheme.colors.onPrimarySurface,
                blendMode = BlendMode.SrcIn
            )
        )
        val dateBgColor = if (MaterialTheme.colors.isLight) {
            MaterialTheme.colors.onSurface.copy(alpha = 0.1f)
        } else {
            MaterialTheme.colors.surface
        }
        val dateContentColor = if (MaterialTheme.colors.isLight) {
            MaterialTheme.colors.onPrimary
        } else {
            MaterialTheme.colors.onSurface
        }
        Surface(
            color = dateBgColor,
            contentColor = dateContentColor
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row {
                    Text(
                        text = "7",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.preferredWidth(4.dp))
                    Column {
                        Text(
                            text = "Jan",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "2021",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Your Q day",
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
private fun InfoColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        InfoRow("Days quit", "03:00:00")
        Divider(
            startIndent = 8.dp,
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .fillMaxWidth()
        )

        InfoRow("Cigarettes avoided", "2")
        Divider(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .fillMaxWidth()
        )

        InfoRow("Money saved", "3.15€")
        Divider(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .fillMaxWidth()
        )
        InfoRow("Time won back", "01:00")
    }
}

@Composable
private fun InfoRow(text: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            textAlign = TextAlign.End,
            color = MaterialTheme.colors.primary,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold
        )
    }
}
