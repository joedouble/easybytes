package com.detroitlabs.easybytes.controller;

import com.detroitlabs.easybytes.data.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/")
    public String displayHomepage(ModelMap modelMap){
        modelMap.put("allRecipes", recipeRepository.getAllRecipes());
        return "index";
    }


}
