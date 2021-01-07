package com.alorma.qnclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import com.alorma.qnclone.screen.dashboard.cards.QnAchievementsCard
import com.alorma.qnclone.screen.dashboard.cards.QnCommunityCard
import com.alorma.qnclone.screen.dashboard.cards.QnHealthCard
import com.alorma.qnclone.screen.dashboard.cards.QnInfoCard
import com.alorma.qnclone.ui.QNAchivementsTheme
import com.alorma.qnclone.ui.QNCommunityTheme
import com.alorma.qnclone.ui.QNHealthTheme
import com.alorma.qnclone.ui.QNInfoTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QNInfoTheme {
                AppScaffold()
            }
        }
    }
}

@Composable
fun AppScaffold() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "QuitNow! Pro")
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Share)
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Settings)
                    }
                }
            )
        }
    ) {
        QNDashboard()
    }
}

@Composable
fun QNDashboard() {
    ScrollableColumn{
        QNInfoTheme {
            QnInfoCard()
        }
        QNAchivementsTheme {
            QnAchievementsCard()
        }
        QNCommunityTheme {
            QnCommunityCard()
        }
        QNHealthTheme {
            QnHealthCard()
        }
        Spacer(modifier = Modifier.preferredHeight(8.dp))
    }
}