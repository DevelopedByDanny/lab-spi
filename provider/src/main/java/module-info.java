import com.lab.provider.Even;
import com.lab.provider.FizzBuzz;
import com.lab.provider.Odd;
import com.lab.service.EvaluateNumber;

module com.lab.provider {
    requires com.lab.service;

    provides EvaluateNumber with FizzBuzz, Odd, Even;
}