package com.detroitlabs.easybytes.controller;

import com.detroitlabs.easybytes.data.RecipeRepository;
import com.detroitlabs.easybytes.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/")
    public String displayHomepage(ModelMap modelMap){
        modelMap.put("allRecipes", recipeRepository.getAllRecipes());
        return "index";
    }

    @RequestMapping("/addrecipe")
    public String addRecipe(){
        return "addrecipe";
    }

    @RequestMapping("/submitrecipe")
    public String submitNewRecipe(@RequestParam(name = "recipeName") String recipeName, @RequestParam(name = "recipeName") String recipeTag,
                                  @RequestParam(name = "recipeDescription") String recipeDesription){

        String name = recipeName;
        String tag = recipeTag;
        String description = recipeDesription;


        Recipe recipeToAdd =  new Recipe(name, new ArrayList<String>(Arrays.asList(tag)),
                new ArrayList<String>(Arrays.asList("Filler ingredient String")),
                new ArrayList<String>(Arrays.asList(description)),
                "Recipe Region", false);

        recipeRepository.addRecipe(recipeToAdd);

        System.out.println("--------> ADDED: " + recipeRepository.getAllRecipes().size() );

        return "addrecipe";

    }


}
