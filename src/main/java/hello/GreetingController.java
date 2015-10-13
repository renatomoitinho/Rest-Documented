package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @Autowired
    private HelperDocumentation helper;

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", helper.apiDocumentation());
        return "greeting";
    }
}
