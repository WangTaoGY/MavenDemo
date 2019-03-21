package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by W on 2019/3/17.
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

}
