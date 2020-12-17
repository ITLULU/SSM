package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public  String   index(){
        return "hello world";
    }
    @RequestMapping(value = "/first")
    public  String   first(HttpServletResponse response, HttpServletRequest request){
        request.setAttribute("msg","hello world");
        return "first";
    }


}
