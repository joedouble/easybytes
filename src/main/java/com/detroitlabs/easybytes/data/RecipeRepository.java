package com.detroitlabs.easybytes.data;

import com.detroitlabs.easybytes.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RecipeRepository {


    private static final List<Recipe> ALL_RECIPES = Arrays.asList(
            new Recipe("Sloppy Joe", new ArrayList<String>(Arrays.asList("Meat", "buns", "China", "sloppy")),
                    new ArrayList<String>(Arrays.asList("Meat", "buns", "China", "sloppy")),
                            new ArrayList<String>(Arrays.asList("Very Good shit", "This is a sloppy joe and a sentence")),
                                    "America", false),

            new Recipe("Dumplings", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("chicken", "flour", "broth", "peas")),
                    new ArrayList<String>(Arrays.asList("These come from the land of china", "These are dumplings and a sentence")),
                    "China", true),

            new Recipe("Chicken Shawarma", new ArrayList<String>(Arrays.asList("Best", "Great", "OMG", "Chicken")),
                    new ArrayList<String>(Arrays.asList("Chicken", "Pita", "garlic", "shawarma juice")),
                    new ArrayList<String>(Arrays.asList("The best meal ever", "This is a shawarma and a sentence")),
                    "America", true),

            new Recipe("Indian Buffet", new ArrayList<String>(Arrays.asList("indian", "buffet", "India", "spicy")),
                    new ArrayList<String>(Arrays.asList("chicken", "spice", "potatoes", "sloppy")),
                    new ArrayList<String>(Arrays.asList("Brians favorite food", "This is a Indian Buffet and a sentence")),
                    "America", false)
            );

    public static List<Recipe> getAllRecipes() {
        return ALL_RECIPES;
    }
}
