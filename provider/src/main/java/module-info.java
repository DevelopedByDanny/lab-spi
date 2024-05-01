import com.lab.provider.EvenNumber;
import com.lab.provider.FizzBuzz;
import com.lab.provider.OddNumber;
import com.lab.service.EvaluateNumber;

module com.lab.provider {
    requires com.lab.service;

    provides EvaluateNumber with FizzBuzz, OddNumber, EvenNumber;
}