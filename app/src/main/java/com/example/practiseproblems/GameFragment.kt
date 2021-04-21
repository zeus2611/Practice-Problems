package com.example.practiseproblems

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.practiseproblems.databinding.FragmentGameBinding

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
    )

    lateinit var currentQuestion: Question
    lateinit var answer: MutableList<String>
    private var questionIndex = 0
    private var numQuestion = 2
    var correctAns = 0
    var wrongAns = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater,
            R.layout.fragment_game, container, false
        )

        randomizeQuestions()

        binding.game = this

        binding.questionNo.setText("Question " + (questionIndex+1))
        binding.totalQues.setText("/ " + numQuestion)

        var answerIndex = 0

        binding.optionA.setOnClickListener { view: View ->
            binding.optionA.setBackgroundResource(R.drawable.option_selected)
            binding.optionB.setBackgroundResource(R.drawable.option_button)
            binding.optionC.setBackgroundResource(R.drawable.option_button)
            binding.optionD.setBackgroundResource(R.drawable.option_button)
            binding.nextButton.setBackgroundResource(R.drawable.option_selected)
            binding.submitButton.setBackgroundResource(R.drawable.option_selected)
            answerIndex = 1;
        }
        binding.optionB.setOnClickListener { view: View ->
            binding.optionA.setBackgroundResource(R.drawable.option_button)
            binding.optionB.setBackgroundResource(R.drawable.option_selected)
            binding.optionC.setBackgroundResource(R.drawable.option_button)
            binding.optionD.setBackgroundResource(R.drawable.option_button)
            binding.nextButton.setBackgroundResource(R.drawable.option_selected)
            binding.submitButton.setBackgroundResource(R.drawable.option_selected)
            answerIndex = 2;
        }
        binding.optionC.setOnClickListener { view: View ->
            binding.optionA.setBackgroundResource(R.drawable.option_button)
            binding.optionB.setBackgroundResource(R.drawable.option_button)
            binding.optionC.setBackgroundResource(R.drawable.option_selected)
            binding.optionD.setBackgroundResource(R.drawable.option_button)
            binding.nextButton.setBackgroundResource(R.drawable.option_selected)
            binding.submitButton.setBackgroundResource(R.drawable.option_selected)
            answerIndex = 3;
        }
        binding.optionD.setOnClickListener { view: View ->
            binding.optionA.setBackgroundResource(R.drawable.option_button)
            binding.optionB.setBackgroundResource(R.drawable.option_button)
            binding.optionC.setBackgroundResource(R.drawable.option_button)
            binding.optionD.setBackgroundResource(R.drawable.option_selected)
            binding.nextButton.setBackgroundResource(R.drawable.option_selected)
            binding.submitButton.setBackgroundResource(R.drawable.option_selected)
            answerIndex = 4;
        }

        binding.backButton.visibility = View.GONE

        //Next Button Function
        binding.nextButton.setOnClickListener { view: View ->
            if(answerIndex == 0){
                questionIndex++
                if (questionIndex < numQuestion) {
                    setQuestion()
                    binding.invalidateAll()
                }
            }
            else{
                questionIndex++
                if(answer[answerIndex-1] == currentQuestion.answers[0]){
                    correctAns++
                }
                else{
                    wrongAns++
                }
                if (questionIndex < numQuestion) {
                    setQuestion()
                    binding.invalidateAll()
                }
            }
            answerIndex = 0
            binding.optionA.setBackgroundResource(R.drawable.option_button)
            binding.optionB.setBackgroundResource(R.drawable.option_button)
            binding.optionC.setBackgroundResource(R.drawable.option_button)
            binding.optionD.setBackgroundResource(R.drawable.option_button)
            binding.nextButton.setBackgroundResource(R.drawable.option_button)
            binding.submitButton.setBackgroundResource(R.drawable.option_button)
            if (questionIndex < numQuestion) {
                binding.questionNo.setText("Question " + (questionIndex+1))
                binding.totalQues.setText("/ " + numQuestion)
            }
            if(questionIndex+1 == numQuestion){
                binding.nextButton.visibility = View.GONE
                binding.submitButton.visibility = View.VISIBLE
            }
            binding.backButton.visibility = View.VISIBLE
        }

        //Back Button Function
        binding.backButton.setOnClickListener { view: View ->
            backQuestion()
            binding.invalidateAll()
            if(questionIndex == 0){
                binding.backButton.visibility = View.GONE
            }
            binding.nextButton.visibility = View.VISIBLE
            binding.submitButton.visibility = View.GONE
            binding.questionNo.setText("Question " + (questionIndex+1))
            binding.totalQues.setText("/ " + numQuestion)
        }

//        Submit Button Function
        binding.submitButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_resultFragment22)
        }

        return binding.root
    }

    private fun randomizeQuestions() {
        questions.shuffle()
        questionIndex = 0
        setQuestion()
    }

    private fun setQuestion(){
        currentQuestion = questions[questionIndex]
        answer = currentQuestion.answers.toMutableList()
        answer.shuffle()
    }

    private fun backQuestion(){
        questionIndex--
        setQuestion()
    }

}