package com.detroitlabs.easybytes.data;

import com.detroitlabs.easybytes.model.Recipe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RecipeRepository {


    private static final List<Recipe> ALL_RECIPES = Arrays.asList(
            new Recipe("dumpling", new ArrayList<String>(Arrays.asList("Meat", "buns", "China", "veggie")),
                    new ArrayList<String>(Arrays.asList("3 lbs green leafy vegetable", " 1 ½ pounds ground pork", " 2/3 cup shaoxing wine", "½ cup oil", "3 tablespoons sesame oil", "1 tablespoon salt", "3 tablespoons soy sauce", "¼ teaspoon white pepper", "2/3 cup water, plus more for assembly", "3-4 packages dumpling wrappers")),
                    new ArrayList<String>(Arrays.asList("Wash your vegetables thoroughly and blanch them in a pot of boiling water. Transfer them to an ice bath to cool. Ring out all the water from the vegetables and chop very finely.",
                            "\nIn a large bowl, stir together the vegetable, meat, wine, oil, sesame oil, salt, soy sauce, white pepper, and ⅔ cup water. Mix for 6-8 minutes, until very well-combined.",
                            "\nTo wrap the dumplings, dampen the edges of each circle with some water. Put a little less than a tablespoon of filling in the middle. Fold the circle in half and pinch the wrapper together at the top. Then make two folds on each side, until the dumpling looks like a fan. Make sure it’s completely sealed. Repeat until all the filling is gone, placing the dumplings on a baking sheet lined with parchment. Make sure the dumplings aren’t sticking together.",
                            "\nIf you’d like to freeze them, wrap the baking sheets tightly with plastic wrap and put the pans in the freezer. Allow them to freeze overnight. You can then take the sheets out of the freezer, transfer the dumplings to Ziploc bags, and throw them back in the freezer for use later.",
                            "\n To cook the dumplings, boil them or pan-fry them. To boil, simple bring a large pot of water to a boil, drop the dumplings in, and cook until they float to the top and the skins are cooked through, but still slightly al dente.",
                            "\nTo pan-fry, heat 2 tablespoons oil in a non-stick pan over medium high heat. Place the dumplings in the pan and allow to fry for 2 minutes. Pour a thin layer of water into the pan, cover, and reduce heat to medium-low. Allow dumplings to steam until the water has evaporated. Remove the cover, increase heat to medium-high and allow to fry for a few more minutes, until the bottoms of the dumplings are golden brown and crisp.",
                            "\nServe with soy sauce, Chinese black vinegar, chili sauce, or other dipping sauce of your choice!")),
                    "China", false),

            new Recipe("Sloppy Joe", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("1 Tbsp butter", "1 tsp olive oil", "1 lb. ground beef", "1/3 green bell pepper, minced", "1/2 large yellow onion, minced", "3 cloves garlic, minced", "1 Tbsp tomato paste",
                            "2/3 cup ketchup", "1/3 cup water", "1 Tbsp brown sugar", "1 tsp yellow mustard", "3/4 tsp chili powder", "1/2 tsp Worcestershire sauce", "1/2 tsp kosher salt", "1/4 tsp red pepper flakes (optional)", "1/4 tsp black pepper", "dash of hot sauce (optional)")),
                    new ArrayList<String>(Arrays.asList("Heat butter and oil in large skillet over MED/MED-HIGH heat.  Add beef and brown, breaking apart into crumbles as it cooks, about 5 minutes.  Drain.",
                            "\nAdd onion and bell pepper to same skillet and cook 2-3 minutes, until soft.  Add garlic and cook 30 seconds or so, until fragrant.  Add beef back to the skillet and add tomato paste.  Stir well.",
                            "\nAdd ketchup, water, brown sugar, mustard, chili powder, Worcestershire sauce, salt, red pepper flakes (if using), and black pepper.  Stir well to combine",
                            "\nCook over MED heat for 10-15 minutes, until mixture has thickened to your liking.  Remove from heat and serve over toasted buns.")),
                    "America", true),

            new Recipe("Chicken Shawarma", new ArrayList<String>(Arrays.asList("Best", "Great", "OMG", "Chicken")),
                    new ArrayList<String>(Arrays.asList("3/4 tbsp ground cumin", "3/4 tbsp turmeric powder", "3/4 tbsp ground coriander", "3/4 tbsp garlic powder", "3/4 tbsp paprika", "1/2 tsp ground cloves", "1/2 tsp cayenne pepper, more if you prefer", "Salt", "8 boneless, skinless chicken thighs",
                            "1 large onion, thinly sliced", "1 large lemon, juice of", "1/3 cup Private Reserve extra virgin olive oil", "6 pita pockets", "Tahini sauce or Greek Tzatziki sauce", "Baby arugula", "3-ingredient Mediterranean Salad", "Pickles or kalmata olives (optional)")),
                    new ArrayList<String>(Arrays.asList("In a small bowl, mix the cumin, turmeric, coriander, garlic powder, sweet paprika and cloves. Set aside the shawarma spice mix for now.",
                            "\nPat the chicken thighs dry and season with salt on both sides, then thinly slice into small bite-sized pieces",
                            "\n Place the chicken in a large bowl. Add the shwarma spices and toss to coat. Add the onions, lemon juice and olive oil. Toss everything together again. Cover and refrigerate for 3 hours or overnight (if you don’t have time, you can cut or skip marinating time)",
                            "\nWhen ready, preheat the oven to 425 degrees F. Take the chicken out of the fridge and let it sit in room temperature for a few minutes.",
                            "\nSpread the marinated chicken with the onions in one layer on a large lightly-oiled baking sheet pan. Roast for 30 minutes in the 425 degrees F heated-oven. For a more browned, crispier chicken, move the pan to the top rack and broil very briefly (watch carefully). Remove from the oven",
                            "\nWhile the chicken is roasting, prepare the pita pockets. Make tahini sauce according to this recipe or Tztaziki sauce according to this recipe. Make 3-ingredient Mediterranean salad according to this recipe. Set aside.",
                            "\nTo serve, open pita pockets up. Spread a little tahini sauce or Tzatziki sauce, add chicken shawarma, arugula, Mediterranean salad and pickles or olives, if you like. Serve immediately!")),
                    "America", true),

            new Recipe("Indian Buffet", new ArrayList<String>(Arrays.asList("indian", "buffet", "India", "spicy")),
                    new ArrayList<String>(Arrays.asList("1 lb. boneless chicken breast, cut into 1 ½ inch cubes (see notes)", "2 tablespoons tandoori masala ", "1 teaspoon EACH: ginger paste and garlic paste (I used Gourmet Garden)", "½ cup yogurt", "1 tablespoon oil", "2 tablespoons ghee (clarified butter)", "1 large onion, thinly sliced",
                    "1 ½ teaspoon EACH: ginger paste and garlic paste ", "1 (14.5 ounce) can crushed tomatoes", "1 teaspoon chili powder", "1 1/2 tablespoon coriander powder", "1 1/2 teaspoon cumin powder", "1/2 cup heavy whipping cream", "1/2 teaspoon garam masala", "¼ teaspoon dried fenugreek leaves (crushed between fingers)")),
                    new ArrayList<String>(Arrays.asList("In a medium bowl, combine the tandoori masala, ginger, garlic, and yogurt. Whisk until smooth, adjust seasonings to preference. Add the chicken and allow to marinate for at least 20 minutes and ideally for 12-24 hours, covered in the refrigerator.",
                            "\nHeat the ghee in a dutch oven or heavy bottom pot over medium heat. Add the onions and sauté until they turn translucent and start to sweat, about 5-7 minutes, don’t allow the onions to brown. Add ginger and garlic paste and let cook for 30 seconds, stirring so it doesn’t burn. Add the can of crushed tomatoes along with the chili powder, coriander powder, and cumin powder and continue to cook for 5 minutes, if the mixture starts bubbling rapidly, add about ¼ cup of water and continue to cook.",
                            "\n Remove from heat, add the mixture to a blender and blend until smooth, you may need to add a couple water to help it blend (up to ¼ cup).  Depending on how powerful your blender is, you may want to blend the mixture in two batches. Remember to hold the lid of the blender down with a kitchen towel when blending, to avoid accidents.",
                            "\nMAKE AHEAD OPTION: At this point you can cool and refrigerate the sauce for 24-48 hours (or freeze it for up to 3 months), it will help blend the flavors even more, just remember to bring the sauce back to room temperature (use the microwave) before proceeding with the recipe OR you can continue on with the recipe immediately.",
                            "\nHeat the remaining tablespoon of oil in the dutch oven over medium heat. Add the marinated chicken (discard any excess marinade) and cook for about 5-6 minutes, stirring as required to brown all sides. Add the butter chicken sauce to the pot and heat everything through. Once it starts to bubble, add the cream and garam masala. When the sauce regains a simmer, add the crushed fenugreek leaves. Serve over basmati rice or with naan.")),
                    "America", false)


    );

    public List<Recipe> getAllRecipes() {
        return ALL_RECIPES;
    }

}
