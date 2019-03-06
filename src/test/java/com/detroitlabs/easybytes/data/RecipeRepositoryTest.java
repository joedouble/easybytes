package com.detroitlabs.easybytes.data;

import com.detroitlabs.easybytes.model.Recipe;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RecipeRepositoryTest {

    RecipeRepository testRecipeRepository;
    Recipe testRecipeOne;
    Recipe testRecipeTwo;
    Recipe testRecipeThree;

    @Before
    public void create(){
      testRecipeRepository = new RecipeRepository();

    testRecipeOne = new Recipe("test recipe", new ArrayList<String>(Arrays.asList("test tags")),
              new ArrayList<String>(Arrays.asList("test ingredients")),
            new ArrayList<String>(Arrays.asList("test description")), "China", true, false);


        testRecipeTwo = new Recipe("B test recipe", new ArrayList<String>(Arrays.asList("bread")),
                new ArrayList<String>(Arrays.asList("test ingredients")),
                new ArrayList<String>(Arrays.asList("test description")), "test region", true, false);

        testRecipeThree = new Recipe("A test recipe", new ArrayList<String>(Arrays.asList("bread")),
                new ArrayList<String>(Arrays.asList("test ingredients")),
                new ArrayList<String>(Arrays.asList("test description")), "china", true, false);

    }

   @Test
    public void shouldGetAllRecipes() {

        int expectedSize = 11;

       List<Recipe> actualRepositoryRecipeList = testRecipeRepository.getAllRecipes();

       assertEquals(expectedSize, actualRepositoryRecipeList.size());

    }

    @Test
    public void shouldAddRecipe() {
        int expectedinitialNumberOfRecipes = 11;
        int expectedNumberOfRecipesAfterAddingRecipe = 12;

        List<Recipe> actualRepositoryRecipeList = testRecipeRepository.getAllRecipes();

        assertEquals(expectedinitialNumberOfRecipes, actualRepositoryRecipeList.size());

        testRecipeRepository.addRecipe(testRecipeOne);

        assertEquals(expectedNumberOfRecipesAfterAddingRecipe, testRecipeRepository.getAllRecipes().size());

       List<Recipe> actualRecipes = testRecipeRepository.getAllRecipes();
        String actualNameOfAddedRecipe = actualRecipes.get(actualRecipes.size() - 1).getName();

        assertEquals("test recipe", actualNameOfAddedRecipe);

    }

    @Test
    public void shouldFindByName(){
        testRecipeRepository.addRecipe(testRecipeOne);

        Recipe actualRecipeFound = testRecipeRepository.findByName("test recipe");

        assertEquals("test recipe", actualRecipeFound.getName());
        assertEquals("test region", actualRecipeFound.getRegion());
        assertEquals(true, actualRecipeFound.isFavorite());
    }

    @Test
    public void shouldReturnNullIfNameNotFound(){
        String knownNotToBeInRecipeNames = "Brian";

      Recipe actualRecipeReturned =  testRecipeRepository.findByName(knownNotToBeInRecipeNames);

      assertEquals(null, actualRecipeReturned);

    }

    @Test
    public void shouldReturnRecipesInAlphabeticalOrderByName(){

        List<Recipe> testRecipes = new ArrayList<>(Arrays.asList(testRecipeOne, testRecipeTwo, testRecipeThree));

        testRecipeRepository.setAllRecipes(testRecipes);

        List<Recipe> actualRecipesInAlphaOrder = testRecipeRepository.showAllRecipesAlpha();

        String nameOfFirstActualIndex = actualRecipesInAlphaOrder.get(0).getName();
        String nameOfSecondActualIndex = actualRecipesInAlphaOrder.get(1).getName();
        String nameOfThirdActualIndex = actualRecipesInAlphaOrder.get(2).getName();

        assertEquals("A test recipe", nameOfFirstActualIndex);
        assertEquals("B test recipe", nameOfSecondActualIndex);
        assertEquals("test recipe", nameOfThirdActualIndex);
    }

    @Test
    public void shouldReturnEmptyListIfStringNotFoundInSearch(){
        String testSearch = "butter";

        List<Recipe> testRecipes = new ArrayList<>(Arrays.asList(testRecipeOne, testRecipeTwo, testRecipeThree));

        testRecipeRepository.setAllRecipes(testRecipes);

        List<Recipe> actualSearchResults = testRecipeRepository.searchForRecipe(testSearch);

        assertEquals(0, actualSearchResults.size());
    }

    @Test
    public void shouldReturnOneRecipeIfExactNameMatch(){
        String testSearch = "test recipe";

        List<Recipe> testRecipes = new ArrayList<>(Arrays.asList(testRecipeOne, testRecipeTwo, testRecipeThree));

        testRecipeRepository.setAllRecipes(testRecipes);

        List<Recipe> actualSearchResults = testRecipeRepository.searchForRecipe(testSearch);

        assertEquals(1, actualSearchResults.size());

        assertEquals("test recipe", actualSearchResults.get(0).getName());
    }

    @Test
    public void shouldReturnRecipesIfTagsContainExactSearchValue(){
        String searchValue = "bread";

        List<Recipe> testRecipes = new ArrayList<>(Arrays.asList(testRecipeOne, testRecipeTwo, testRecipeThree));

        testRecipeRepository.setAllRecipes(testRecipes);

        List<Recipe> actualSearchResults = testRecipeRepository.searchForRecipe(searchValue);

        assertEquals(2, actualSearchResults.size());
    }

    @Test
    public void shouldReturnRecipesIfRegionEqualsSearchValue(){
        String searchValue = "China";

        List<Recipe> testRecipes = new ArrayList<>(Arrays.asList(testRecipeOne, testRecipeTwo, testRecipeThree));

        testRecipeRepository.setAllRecipes(testRecipes);

        List<Recipe> actualSearchResults = testRecipeRepository.searchForRecipe(searchValue);

        assertEquals(2, actualSearchResults.size());
    }

}