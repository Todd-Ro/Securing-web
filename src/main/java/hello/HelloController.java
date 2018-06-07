package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("")
public class HelloController {

    @RequestMapping(value="")
    public String enter() {
        return "home";
    }

    @RequestMapping(value="home")
    public String home() {
        return "home";
    }

    @RequestMapping(value="hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value="login")
    public String login() {
        return "login";
    }

}
