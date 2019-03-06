package com.detroitlabs.easybytes.controller;

import com.detroitlabs.easybytes.data.RecipeRepository;
import com.detroitlabs.easybytes.model.NewRecipe;
import com.detroitlabs.easybytes.data.RegionRepository;
import com.detroitlabs.easybytes.model.Recipe;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private RegionRepository regionRepository;

    @RequestMapping("/")
    public String displayHomepage(ModelMap modelMap){
        modelMap.put("allRecipes", recipeRepository.getAllRecipes());

        modelMap.put("allRegions", regionRepository.getAll_Regions());

        return "index";
    }

    @GetMapping ("/addrecipe")
    public String addRecipe(Model model){
        model.addAttribute("newRecipe", new NewRecipe());
        return "addrecipe";
    }

    @PostMapping("/addrecipe")
    public String submitNewRecipe(@ModelAttribute NewRecipe newRecipe){

        String name = newRecipe.getName();
        String tag = newRecipe.getTag();
        String ingredients = newRecipe.getIngredients();
        String description = newRecipe.getDescription();
        String region = newRecipe.getRegion();


        Recipe recipeToAdd =  new Recipe(name, new ArrayList<String>(Arrays.asList(tag)),
                new ArrayList<String>(Arrays.asList(ingredients)),
                new ArrayList<String>(Arrays.asList(description)),
                region, false, true, "Added by user");

        recipeRepository.addRecipe(recipeToAdd);

        return "addrecipe";
    }

    @RequestMapping("/aboutus")
    public String aboutUs(){
        return "aboutus";
    }

    @RequestMapping("/search")
    public String recipeSearch(@RequestParam(name = "q") String searchValue, ModelMap modelMap){
        List<Recipe> searchResults = recipeRepository.searchForRecipe(searchValue);
        modelMap.put("searchResults", searchResults);
        return "search";
    }

    @RequestMapping("/singlerecipe/{name}")
    public String singleRecipe(@PathVariable String name, ModelMap modelMap){
        Recipe singleRecipe = recipeRepository.findByName(name);
        modelMap.put("singleRecipe", singleRecipe);
        return "singlerecipe";
    }

    @RequestMapping("/allrecipes")
    public String allRecipes(ModelMap modelMap){
        modelMap.put("allRecipes", recipeRepository.showAllRecipesAlpha());
        return "allrecipes";
    }

}
