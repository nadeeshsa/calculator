package calc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    //    http://localhost:8080/add?a=10&b=15
    @RequestMapping("/add")
    public Answer add(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b) {
        Operands operands = new Operands(Integer.parseInt(a), Integer.parseInt(b));
        int sum = Operators.add(operands);
        return new Answer(a, b, "add", Integer.toString(sum));
    }

    @RequestMapping("/substract")
    public Answer substract(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b) {
        Operands operands = new Operands(Integer.parseInt(a), Integer.parseInt(b));
        int sum = Operators.substraction(operands);
        return new Answer(a, b, "substract", Integer.toString(sum));
    }
}