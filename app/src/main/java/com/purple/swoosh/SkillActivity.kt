package com.purple.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.purple.swoosh.Utilities.EXTRA_LEAGUE
import com.purple.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var selectedLeague = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        beginnerSkillBtn.isChecked = true
        ballerSkillBtn.isChecked = false

        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        ballerSkillBtn.isChecked = true

        selectedSkill = "baller"
    }

    fun onFinishSkillClicked(view: View) {
        if(selectedSkill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishActivity)
        }
        else {
            Toast.makeText(this, "Please choose a skill", Toast.LENGTH_SHORT).show()
        }
    }

}
