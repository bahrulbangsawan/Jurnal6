package org.d3if4118.jurnal6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: GameViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    //
    internal var scoreTeamA = 0

    internal var scoreTeamB = 0
    fun addOneForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    fun addTwoForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    fun addThreeForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    fun addOneForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    fun addTwoForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    fun addThreeForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }


    fun resetScore(v: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }

}
