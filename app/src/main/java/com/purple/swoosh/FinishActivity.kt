package com.purple.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.purple.swoosh.Utilities.EXTRA_LEAGUE
import com.purple.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var selectedLeague = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        selectedSkill = intent.getStringExtra(EXTRA_SKILL)

        finishTxt.text = "Looking for a $selectedLeague $selectedSkill league near you..."
    }
}
