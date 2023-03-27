package com.example.zy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Admincontroller {
    /*    @Autowired
    private ISherryUserService sherryUserService;*/

    @GetMapping({"/", "/index", "index.html"})
    public String index() {
        return "zy/index";
    }

    @GetMapping({"/list"})
    public String list() {
        return "zy/list";
    }

    @GetMapping({"/info"})
    public String info() {
        return "zy/blog";
    }

    /**
     * 404 error
     * 
     * @return
     */
    @RequestMapping("/404")
    public String error404() {
        return "zy/404";
    }

    /**
     * 500 error
     * 
     * @return
     */
    @RequestMapping("/500")
    public String error500() {
        return "zy/500";
    }
}
