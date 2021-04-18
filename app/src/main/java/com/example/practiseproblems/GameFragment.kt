package com.example.practiseproblems

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.practiseproblems.databinding.FragmentGameBinding
import com.example.practiseproblems.databinding.FragmentHomeBinding

class GameFragment : Fragment() {

    data class Question(
        val text: String,
        val answers: List<String>
    )

    private var questions: MutableList<Question> = mutableListOf(
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
        Question(
            text = "",
            answers = listOf()
        ),
    )

    lateinit var currentQuestion: Question
    lateinit var answer: MutableList<String>
    private var questionIndex = 0
    private var numQuestion = 2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater,
            R.layout.fragment_game, container, false
        )

        val msg = "Question " + (questionIndex+1)
        binding.questionNo.setText(msg)
        binding.totalQues.setText("/ " + numQuestion)

        return binding.root
    }

}