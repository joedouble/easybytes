package com.detroitlabs.easybytes.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    @RequestMapping("/")
    public String displayHomepage(){
        return "home";
    }

}
