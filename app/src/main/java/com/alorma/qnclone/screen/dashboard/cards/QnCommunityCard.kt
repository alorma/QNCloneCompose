package com.alorma.qnclone.screen.dashboard.cards

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun QnCommunityCard() {
    QnBaseCard(
        icon = Icons.Default.Chat,
        title = "Community"
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
        ) {
            val userTextStyle = MaterialTheme.typography.subtitle1
            Text(
                text = "Alorma",
                style = userTextStyle,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.preferredHeight(4.dp))
            val messageTextStyle = MaterialTheme.typography.body2
            val text = buildAnnotatedString {
                pushStyle(style = SpanStyle(fontWeight = FontWeight.Bold))
                append("@Roc @Esteve")
                pop()
                append(' ')
                append("Bon dia xiquets!")
            }
            Text(text = text, style = messageTextStyle)
        }
    }
}