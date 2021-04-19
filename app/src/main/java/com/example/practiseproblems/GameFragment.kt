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
            text = "Predict the output of below C++ programs.\n" +
                    "// Assume that integers take 4 bytes.\n" +
                    "#include<iostream>\n" +
                    "  \n" +
                    "using namespace std;   \n" +
                    "  \n" +
                    "class Test\n" +
                    "{\n" +
                    "  static int i;\n" +
                    "  int j;\n" +
                    "};\n" +
                    "  \n" +
                    "int Test::i;\n" +
                    "  \n" +
                    "int main()\n" +
                    "{\n" +
                    "    cout << sizeof(Test);\n" +
                    "    return 0;\n" +
                    "}",
            answers = listOf("A", "B", "C", "D")
        ),
        Question(
            text = "What is the color of android Mascot?",
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

    var currentQuestion: Question = questions[0]
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

        binding.questionText.setText(questions[0].text)

        answer = currentQuestion.answers.toMutableList()

        binding.optionA.setText(answer[0])
        binding.optionB.setText(answer[1])
        binding.optionC.setText(answer[2])
        binding.optionD.setText(answer[3])
        binding.optionD.setBackgroundResource(R.drawable.option_selected)


        val msg = "Question " + (questionIndex+1)
        binding.questionNo.setText(msg)
        binding.totalQues.setText("/ " + numQuestion)

        return binding.root
    }

}