package kr.hs.dgsw.web_calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @Autowired
    IOperate os;

    //
    @GetMapping("/operate/{Ex}")
    public Double operate(@PathVariable String Ex){
        return Double.parseDouble(os.Operate(Ex));
    }
}
