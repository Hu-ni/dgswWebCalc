package kr.hs.dgsw.web_calc;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class OperateService implements  IOperate{

    @Override
    public String Operate(String Ex) {
        String[] temp = Ex.split(" ");
        Double n1 = Double.parseDouble(temp[0]);
        Double n2 = Double.parseDouble(temp[2]);

        Double result=0.0;
        switch (temp[1]){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        return new DecimalFormat("#.##").format(result);
    }
}
