package cn.blackrose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
