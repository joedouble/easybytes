package com.detroitlabs.easybytes.data;

import com.detroitlabs.easybytes.model.Recipe;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeRepositoryTest {

    RecipeRepository testRepository;
    Recipe testRecipe;

    @Before
    public void create(){
      testRepository = new RecipeRepository();

    testRecipe = new Recipe("test recipe", new ArrayList<String>(Arrays.asList("test tags")),
              new ArrayList<String>(Arrays.asList("test ingredients")),
            new ArrayList<String>(Arrays.asList("test description")), "test region", true, false);

    }

   @Test
    public void getAllRecipes() {

        int expectedSize = 11;

       List<Recipe> actualRepositoryRecipeList = testRepository.getAllRecipes();

       assertEquals(expectedSize, actualRepositoryRecipeList.size());

    }

    @Test
    public void addRecipe() {
        int expectedinitialNumberOfRecipes = 11;
        int expectedNumberOfRecipesAfterAddingRecipe = 12;

        List<Recipe> actualRepositoryRecipeList = testRepository.getAllRecipes();

        assertEquals(expectedinitialNumberOfRecipes, actualRepositoryRecipeList.size());

        testRepository.addRecipe(testRecipe);

        assertEquals(expectedNumberOfRecipesAfterAddingRecipe, testRepository.getAllRecipes().size());

       List<Recipe> actualRecipes = testRepository.getAllRecipes();
        String actualNameOfAddedRecipe = actualRecipes.get(actualRecipes.size() - 1).getName();

        assertEquals("test recipe", actualNameOfAddedRecipe);

    }

    @Test
    public void

}