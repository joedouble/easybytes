package com.detroitlabs.easybytes.controller;

import com.detroitlabs.easybytes.data.RecipeRepository;
import com.detroitlabs.easybytes.data.RegionRepository;
import com.detroitlabs.easybytes.model.Recipe;
import com.detroitlabs.easybytes.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RegionController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private RegionRepository regionRepository;

    @RequestMapping("/region")
    public String displayAllRegion(ModelMap modelMap){
        List<Region> regions = regionRepository.getAll_Regions();
        modelMap.put("regions", regions);
        return "index";
    }

    @RequestMapping("/recipe/{region}")
    public String findPhotosByRegion (ModelMap modelMap, @PathVariable String region){
        Region findRegion = regionRepository.findbyRegion(region);
        modelMap.put("findRegion", findRegion);

        List<Recipe> regionList = recipeRepository.showRecipeByRegion(region);
        modelMap.put("regionList", regionList);
        return "search";
    }
}
