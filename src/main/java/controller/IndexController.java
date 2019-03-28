package controller;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by W on 2019/3/17.
 */
@Controller
@RequestMapping("/home")
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/datatest")
    public List<UserDao> getUserList(){
        return userService.getUserList();
    }
}
