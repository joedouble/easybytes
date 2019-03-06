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
            new ArrayList<String>(Arrays.asList("test description")), "test region", true);

    }


    @Test
    public void addRecipe() {
        int expectedSizeAfterAddingRecipe = 5;

        List<Recipe> actualRepositoryRecipeList = testRepository.getAllRecipes();

        assertEquals(4, actualRepositoryRecipeList.size());

        testRepository.addRecipe(testRecipe);

        assertEquals(expectedSizeAfterAddingRecipe, testRepository.getAllRecipes().size());

        String actualNameOfAddedRecipe = testRepository.getAllRecipes().get(4).getName();

        assertEquals("test recipe", actualNameOfAddedRecipe);

    }

   @Test
    public void getAllRecipes() {

        int expectedSize = 4;

       List<Recipe> actualRepositoryRecipeList = testRepository.getAllRecipes();

       assertEquals(4, actualRepositoryRecipeList.size());

    }


}