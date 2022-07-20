package sg.edu.nus.iss.day12lecture;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping(path= {"/indexresource", "/indexresouce.html"})
public class IndexResource {

    @GetMapping(produces = {"text/html"})

    public String index(Model model){
        model.addAttribute("currTime", (new Date()).toString());

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

        return "indexresource";

    }
}
