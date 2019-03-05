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
                    "America", false),

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


            new Recipe("SloppyJoe", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("1 Tbsp butter", "1 tsp olive oil", "1 lb. ground beef", "1/3 green bell pepper, minced", "1/2 large yellow onion, minced", "3 cloves garlic, minced", "1 Tbsp tomato paste",
                            "2/3 cup ketchup", "1/3 cup water", "1 Tbsp brown sugar", "1 tsp yellow mustard", "3/4 tsp chili powder", "1/2 tsp Worcestershire sauce", "1/2 tsp kosher salt", "1/4 tsp red pepper flakes (optional)", "1/4 tsp black pepper", "dash of hot sauce (optional)")),
                    new ArrayList<String>(Arrays.asList("Heat butter and oil in large skillet over MED/MED-HIGH heat.  Add beef and brown, breaking apart into crumbles as it cooks, about 5 minutes.  Drain.",
                            "\nAdd onion and bell pepper to same skillet and cook 2-3 minutes, until soft.  Add garlic and cook 30 seconds or so, until fragrant.  Add beef back to the skillet and add tomato paste.  Stir well.",
                            "\nAdd ketchup, water, brown sugar, mustard, chili powder, Worcestershire sauce, salt, red pepper flakes (if using), and black pepper.  Stir well to combine",
                            "\nCook over MED heat for 10-15 minutes, until mixture has thickened to your liking.  Remove from heat and serve over toasted buns.")),
                    "America", true),


            new Recipe("ChickenShawarma", new ArrayList<String>(Arrays.asList("Best", "Great", "OMG", "Chicken")),
                    new ArrayList<String>(Arrays.asList("3/4 tbsp ground cumin", "3/4 tbsp turmeric powder", "3/4 tbsp ground coriander", "3/4 tbsp garlic powder", "3/4 tbsp paprika", "1/2 tsp ground cloves", "1/2 tsp cayenne pepper, more if you prefer", "Salt", "8 boneless, skinless chicken thighs",
                            "1 large onion, thinly sliced", "1 large lemon, juice of", "1/3 cup Private Reserve extra virgin olive oil", "6 pita pockets", "Tahini sauce or Greek Tzatziki sauce", "Baby arugula", "3-ingredient Mediterranean Salad", "Pickles or kalmata olives (optional)")),
                    new ArrayList<String>(Arrays.asList("In a small bowl, mix the cumin, turmeric, coriander, garlic powder, sweet paprika and cloves. Set aside the shawarma spice mix for now.",
                            "\nPat the chicken thighs dry and season with salt on both sides, then thinly slice into small bite-sized pieces",
                            "\n Place the chicken in a large bowl. Add the shwarma spices and toss to coat. Add the onions, lemon juice and olive oil. Toss everything together again. Cover and refrigerate for 3 hours or overnight (if you don’t have time, you can cut or skip marinating time)",
                            "\nWhen ready, preheat the oven to 425 degrees F. Take the chicken out of the fridge and let it sit in room temperature for a few minutes.",
                            "\nSpread the marinated chicken with the onions in one layer on a large lightly-oiled baking sheet pan. Roast for 30 minutes in the 425 degrees F heated-oven. For a more browned, crispier chicken, move the pan to the top rack and broil very briefly (watch carefully). Remove from the oven",
                            "\nWhile the chicken is roasting, prepare the pita pockets. Make tahini sauce according to this recipe or Tztaziki sauce according to this recipe. Make 3-ingredient Mediterranean salad according to this recipe. Set aside.",
                            "\nTo serve, open pita pockets up. Spread a little tahini sauce or Tzatziki sauce, add chicken shawarma, arugula, Mediterranean salad and pickles or olives, if you like. Serve immediately!")),
                    "Mediterranean", true),


            new Recipe("MurghMakhan", new ArrayList<String>(Arrays.asList("indian", "buffet", "India", "spicy")),
                    new ArrayList<String>(Arrays.asList("1 lb. boneless chicken breast, cut into 1 ½ inch cubes (see notes)", "2 tablespoons tandoori masala ", "1 teaspoon EACH: ginger paste and garlic paste (I used Gourmet Garden)", "½ cup yogurt", "1 tablespoon oil", "2 tablespoons ghee (clarified butter)", "1 large onion, thinly sliced",
                            "1 ½ teaspoon EACH: ginger paste and garlic paste ", "1 (14.5 ounce) can crushed tomatoes", "1 teaspoon chili powder", "1 1/2 tablespoon coriander powder", "1 1/2 teaspoon cumin powder", "1/2 cup heavy whipping cream", "1/2 teaspoon garam masala", "¼ teaspoon dried fenugreek leaves (crushed between fingers)")),
                    new ArrayList<String>(Arrays.asList("In a medium bowl, combine the tandoori masala, ginger, garlic, and yogurt. Whisk until smooth, adjust seasonings to preference. Add the chicken and allow to marinate for at least 20 minutes and ideally for 12-24 hours, covered in the refrigerator.",
                            "\nHeat the ghee in a dutch oven or heavy bottom pot over medium heat. Add the onions and sauté until they turn translucent and start to sweat, about 5-7 minutes, don’t allow the onions to brown. Add ginger and garlic paste and let cook for 30 seconds, stirring so it doesn’t burn. Add the can of crushed tomatoes along with the chili powder, coriander powder, and cumin powder and continue to cook for 5 minutes, if the mixture starts bubbling rapidly, add about ¼ cup of water and continue to cook.",
                            "\n Remove from heat, add the mixture to a blender and blend until smooth, you may need to add a couple water to help it blend (up to ¼ cup).  Depending on how powerful your blender is, you may want to blend the mixture in two batches. Remember to hold the lid of the blender down with a kitchen towel when blending, to avoid accidents.",
                            "\nMAKE AHEAD OPTION: At this point you can cool and refrigerate the sauce for 24-48 hours (or freeze it for up to 3 months), it will help blend the flavors even more, just remember to bring the sauce back to room temperature (use the microwave) before proceeding with the recipe OR you can continue on with the recipe immediately.",
                            "\nHeat the remaining tablespoon of oil in the dutch oven over medium heat. Add the marinated chicken (discard any excess marinade) and cook for about 5-6 minutes, stirring as required to brown all sides. Add the butter chicken sauce to the pot and heat everything through. Once it starts to bubble, add the cream and garam masala. When the sauce regains a simmer, add the crushed fenugreek leaves. Serve over basmati rice or with naan.")),
                    "India", false),


            new Recipe("Sushi", new ArrayList<String>(Arrays.asList("indian", "buffet", "India", "spicy")),
                    new ArrayList<String>(Arrays.asList("Chicken breast", "Sesame oil ", "Olive oil", "Sea salt", "Thick teriyaki sauce", "Nori sheet", "120 g of cooked, seasoned sushi rice", "Sliced cucumber batons ", "½ peeled avocado", "Thick teriyaki sauce", "Pickled ginger", "Toasted sesame seeds")),
                    new ArrayList<String>(Arrays.asList("Put one teaspoon of sesame oil and two teaspoons of olive oil in a frying pan and turn on the heat. Take a piece of chicken breast, slice it lenghtwise in two or three pieces (for one roll you need two pieces of about 3 to 4 cm wide) and sprinkle a pinch of sea salt on one side. Put the salted sides face down in the pan and sprinke the other side with a pinch of salt too.",
                            "\nOnce the chicken is cooked through, drizzle thick teriyaki sauce over the meat. Let it simmer for a few minutes to infuse the chicken breast with the teriyaki flavor. Then remove the teriyaki chicken from the pan and put in on a plate to cool.",
                            "\nPlace your bamboo rolling mat inside a plastic zip-lock food bag to prevent the rice sticking to the rivets of the mat. Lay a half sheet of nori on the mat, with the rough side of the nori facing upwards. Now moisten your hands with some water and rice vinegar to make it easier to handle the rice.",
                            "\nSpread 120 grams of sushi rice across the surface of the nori sheet and into all the corners. Handle the rice gently so that it remains fluffy and light. Then flip the sheet over so that the rice is facing the rolling mat.",
                            "\nTake two pieces of the teriyaki chicken breast and place them lengthwise at the centre of the nori sheet. Put a few cucumber batons on top of the chicken. Don’t add to many, that would make it hard to roll the roll.",
                            "\nNow drizzle a bit of teriyaki sauce over the cucumber and chicken. The amount depends on your own preference, but don’t use too much otherwise the roll will become all wet.",
                            "\nPull up the end of the bamboo mat closest to you and and curle it over the filling in the centre of the roll. Compress it all together as you roll by applying pressure on the bamboo mat with your hands.",
                            "\nRelease the pressure slightly once it is all rolled up, take the mat off the roll, push the roll a bit forwards and compress again while squeezing gently. Repeat this action two or three times until the roll is tight and the rice neatly compacted.",
                            "\nTake a half peeled avocado and slice it up in thin slices (of about 1 mm). Use only the tip of your knife and drag it quickly through the avocado. By only using the tip of the knife, you will achieve a neater cut, as the avocado is less likely to stick to the knife.",
                            "\nSpread the avocado thinly on the chopping board. Flatten them down a bit with your hands and trim the sides of the avodo (in particular the pointed edges) with a knife to make them look neat and uniform. If you’ve flattened the slices correctly you should be able to do this in one movement.",
                            "\nPut your sushi roll back on the chopping board. Scoop up the avocado slices by sliding the flat side of a knife underneath. Place the slices on top of the sushi roll.",
                            "\nTake a sheet of cling film and lighty cover your sushi roll. Place the bamboo rolling mat (this time without the plastic bag covering) on top and gently apply pressure to further shape the roll. Remove the mat but leave the cling film in place.",
                            "\nMoisten your knife by drawing it across a dampened cloth. This prevents the rice from sticking to the blade. Cut the roll in half and place both halves side by side. Cut each half into 4 pieces. (If you want really neat pieces, first cut off both ends of the roll and eat them right away to have a taste of what’s to come.) Keep moistening your knife between cuts.",
                            "\nArrange the sushi pieces neatly on a plate and add a scoop of pickled ginger at the side. Drizzle some teriyaki sauce over the sushi pieces. Finish by sprinkling toasted sesame seeds over the roll for added crunch.")),
                    "Japan", false),


            new Recipe("Mici", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("2 pounds ground beef", "8 ounces chopped suet", "1/4 teaspoon baking soda", "1/2 teaspoon caraway seeds", "3 cloves garlic, minced", "3 cloves garlic, minced", "salt and pepper to taste", "1 teaspoon finely ground juniper berries", "2 tablespoons water", "3 tablespoons vegetable oil", "2 tablespoons beef broth")),
                    new ArrayList<String>(Arrays.asList("In a medium bowl, mix together the ground beef, suet, baking soda, caraway seeds, garlic, salt, pepper and juniper berries using your hands. Mix with your hands for about 15 minutes, adding a little bit of the water at a time. This part can be made a few hours ahead of time if you like.",
                            "\nPreheat a grill for high heat. With wet hands form the meat into rolls about 3 inches long and 1 inch thick. Brush lightly with oil.",
                            "\nGrill the meat for 5 to 10 minutes, basting frequently with a mixture of beef broth and any remaining oil, until well done.")),
                    "Romania", true),


            new Recipe("Churros", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("1 cup water", "2 1/2 tablespoons white sugar", "1/2 teaspoon salt", "2 tablespoons vegetable oil", "1 cup all-purpose flour", "2 quarts oil for frying", "1/2 cup white sugar, or to taste", "1 teaspoon ground cinnamon")),
                    new ArrayList<String>(Arrays.asList("In a small saucepan over medium heat, combine water, 2 1/2 tablespoons sugar, salt and 2 tablespoons vegetable oil. Bring to a boil and remove from heat. Stir in flour until mixture forms a ball.",
                            "\nHeat oil for frying in deep-fryer or deep skillet to 375 degrees F (190 degrees C). Pipe strips of dough into hot oil using a pastry bag. Fry until golden; drain on paper towels.",
                            "\nCombine 1/2 cup sugar and cinnamon. Roll drained churros in cinnamon and sugar mixture.")),
                    "Spain", true),


            new Recipe("PadThai", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("8 ounces flat rice noodles", "3 Tablespoons oil", "3 cloves garlic , minced", "8 ounces uncooked shrimp, chicken, or extra-firm tofu , cut into small pieces", "2 eggs", "1 cup fresh bean sprouts", "1 red bell pepper , thinly sliced", "3 green onions , chopped", "1/2 cup dry roasted peanuts", "2 limes", "1/2 cup Fresh cilantro , chopped",
                            "3 Tablespoons fish sauce", "1 Tablespoon low-sodium soy sauce", "5 Tablespoons light brown sugar", "2 Tablespoons rice vinegar * see note", "1 Tablespoon Sriracha hot sauce , or more, to taste", "2 Tablespoons creamy peanut butter , optional")),
                    new ArrayList<String>(Arrays.asList("Cook noodles according to package instructions, just until tender.  Rinse under cold water.",
                            "\nMix the sauce ingredients together. Set aside.",
                            "\nHeat 1½ tablespoons of oil in a large saucepan or wok over medium-high heat.",
                            "\nAdd the shrimp, chicken or tofu, garlic and bell pepper. The shrimp will cook quickly, about 1-2 minutes on each side, or until pink. If using chicken, cook until just cooked through, about 3-4 minutes, flipping only once.",
                            "\nPush everything to the side of the pan. Add a little more oil and add the beaten eggs. Scramble the eggs, breaking them into small pieces with a spatula as they cook.",
                            "\nAdd noodles, sauce, bean sprouts and peanuts to the pan (reserving some peanuts for topping at the end). Toss everything to combine.",
                            "\nTop with green onions, extra peanuts, cilantro and lime wedges. Serve immediately!")),
                    "Thailand", true),


            new Recipe("BeefEmpanadas", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("4  ounces lard or butter, plus more for brushing tops", "1 ½  teaspoons fine sea salt", "750  grams all-purpose flour, about 6 cups, more as needed", "1  pound beef chuck, in 1/8-inch dice (or very coarsely ground)", "Salt and pepper", "Lard or olive oil, or a combination, for sautéing", "1  cup diced onion", "2  ounces diced chorizo", "2  hard-cooked eggs, sliced",
                            "½  pound potatoes, peeled and diced", "4  garlic cloves, mashed to a paste", "2  teaspoons chopped thyme", "2  teaspoons chopped marjoram or 1 teaspoon oregano", "1  tablespoon tomato paste", "1  tablespoon pimentón dulce or paprika", "Large pinch cayenne", "Beef or chicken broth, as necessary, or use water", "½  cup chopped scallions, white and green parts", "¼  cup chopped pitted green olives")),
                    new ArrayList<String>(Arrays.asList("Make the dough: Put 2 cups boiling water, 4 ounces lard and 1 1/2 teaspoons salt in large mixing bowl. Stir to melt lard and dissolve salt. Cool to room temperature.",
                            "\nGradually stir in flour with a wooden spoon until dough comes together. Knead for a minute or two on a floured board, until firm and smooth. Add more flour if sticky. Wrap and refrigerate for 1 hour.",
                            "\nMake the filling: Season chopped beef generously with salt and pepper and set aside for 10 minutes. Melt 3 tablespoons lard in a wide heavy skillet over medium-high heat. Add beef and fry until nicely browned, stirring throughout to keep pieces separate, about 5 minutes.",
                            "\nTurn heat down to medium and add onion and chorizo. Keep turning mixture with a spatula, as if cooking hash, until onion is softened and browned, about 10 minutes. Add potatoes, garlic, thyme and marjoram and stir well to incorporate. (Add a little more fat to pan if mixture seems dry.) Season again with salt and pepper and let mixture fry for 2 more minutes. Stir in tomato paste, pimentón and cayenne, then a cup of broth or water. Turn heat to simmer, stirring well to incorporate any caramelized bits.",
                            "\nCook for about 10 more minutes, until both meat and potatoes are tender and the sauce just coats them — juicy but not saucy is what you want. Taste and adjust seasoning for full flavor (intensity will diminish upon cooling). Stir in scallions and cool to room temperature, then cover and refrigerate until ready to use.",
                            "\nDivide chilled dough into 1-ounce pieces and form into 2-inch diameter balls. Roll each piece into a 4 1/2-inch circle. Lay circles on a baking sheet lightly dusted with flour.",
                            "\nMoisten outer edge of each round with water. Put about 2 tablespoons filling in the center of each round, adding a little chopped green olive and some hard-cooked egg to each. Wrap dough around filling to form empanada, pressing edges together. Fold edge back and finish by pinching little pleats or crimping with a fork.",
                            "\nHeat oven to 375 degrees. Place empanadas on parchment-lined or oiled baking sheet, about 1 inch apart. Brush tops lightly with lard or butter and bake on top shelf of oven until golden, 10 to 15 minutes. Serve warm.")),
                    "Mexico", true),


            new Recipe("Bacalau", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("2 pounds dried salted cod fish", "4 Yukon Gold potatoes", "3 tablespoons butter", "2 yellow onions, thinly sliced", "2 cloves garlic, chopped, divided", "1/2 cup chopped fresh parsley, divided", "3/4 cup olive oil", "1 1/2 teaspoons red pepper flakes", "freshly ground pepper to taste", "4 hard cooked eggs, chopped", "10 pitted green olives", "10 pitted black olives")),
                    new ArrayList<String>(Arrays.asList("Soak the dried salted cod in cold water for 24 hours, changing the water several times.",
                            "\nBring a large pot of water to a boil. Add the soaked cod, and boil for about 5 minutes, or until fish flakes easily with a fork. Remove cod from water, and save water for cooking potatoes. Remove skin and bones from the cod, and flake the meat into pieces using a fork. Set fish aside in a large bowl.",
                            "\nIn a small bowl, stir together the olive oil, 1 clove of garlic, 1 tablespoon of parsley, red pepper flakes, and black pepper. Pour over the fish, and toss lightly to coat.",
                            "\nPreheat the oven to 350 degrees F (175 degrees C). Place the potatoes into the fish water, and bring to a boil. Cook for 20 minutes, or until tender. Drain under cool water, peel and cut into 1/4 inch slices.",
                            "\nWhile the potatoes are cooking, melt the butter in a large skillet over medium heat. Add the onions, and saute until golden and caramelized. Stir one clove of garlic into the onions. Set aside.",
                            "\nLayer half of the potato slices in the bottom of a greased 8x11 inch baking dish. Cover with half of the cod, then half of the onions. Repeat layers, ending with onion.",
                            "\nBake for 15 minutes in the preheated oven, until lightly browned. Before serving, garnish the top with green and black olives, and hard-cooked eggs. Sprinkle with remaining parsley.")),
                    "Portugal", true),


            new Recipe("DolsotBibimbap", new ArrayList<String>(Arrays.asList("Meat", "soft", "China", "round")),
                    new ArrayList<String>(Arrays.asList("1/2 cup dried shiitake mushrooms", "soy sauce", "toasted sesame oil", "6-7 ounces stir fry beef", "pinch of sugar", "fresh ground black pepper", "vegetable oil, or any neutral flavored high heat oil", "1 large or 2 small carrots, cut into matchsticks", "1 zucchini, cut into matchsticks",
                    "3 cups packed spinach", "1 tablespoon garlic, minced", "2/3 cup bean sprouts", "2 teaspoons toasted sesame seeds", "2 large eggs, preferably pasteurized", "2 cups cooked white rice", "Gochujang chili paste")),
                    new ArrayList<String>(Arrays.asList("Rehydrate the shiitake mushrooms in hot water until soft, approximately 25 minutes. Drain and then toss with 1/2 tablespoon soy sauce and 1/2 tablespoon toasted sesame oil. Set aside.",
                            "\nHeat a large skillet over high heat with just enough oil to coat the bottom. Toss the beef with 2 teaspoons soy sauce, 1 teaspoon of garlic, a pinch of sugar and some black pepper. Sauté the beef for 1-2 minutes (it will cook very fast), then toss with 1 teaspoon of toasted sesame oil and set aside.",
                            "\nLine up 3 bowls to hold the vegetables separately after they're cooked. Sauté the carrots for 30 seconds with a little more oil (if needed) and 1/2 teaspoon of garlic. Place the carrots in one of the reserved bowls. Sauté the zucchini for 30 seconds with 1/2 teaspoon garlic. Place the zucchini in the second reserved bowl and toss with 1/2 teaspoon sesame oil. Turn the heat down to low. Wilt the spinach with 1 teaspoon garlic, 1 teaspoon soy sauce and 1/2 teaspoon sesame oil. Place in the third bowl.",
                            "\nIf using dolsot bowls, cover the insides liberally with oil (if using regular bowls, skip to the next step). Divide the rice evenly between the two bowls and then place small mounds of the beef, mushrooms, carrots, zucchini, spinach and bean sprouts on top of the rice. Top with toasted sesame seeds. Place the bowls on the stove over high heat and allow them to get hot. Once the rice begins to make a crackling noise, allow it to cook for 5 minutes.",
                            "\nIf using a regular bowl, divide the rice evenly between the two bowls and then place small mounds of the beef, mushrooms, carrots, zucchini, spinach and bean sprouts on top of the rice. Top with toasted sesame seeds.",
                            "\nCook the egg sunny side up on a lightly oil skillet and place on top of the beef and vegetables.",
                            "\nServe with Gochujang.")),
                    "Korea", true)


    );

    public List<Recipe> getAllRecipes() {
        return ALL_RECIPES;
    }


    public List<Recipe>searchForRecipe(String search){
        List<Recipe>serchRecipe = new ArrayList<>();
        for(Recipe recipe : ALL_RECIPES){
            if(search.equalsIgnoreCase(recipe.getName())){
                serchRecipe.add(recipe);
            }
        }
        return serchRecipe;
    }

    public Recipe findByName(String name) {
        for (Recipe recipe : ALL_RECIPES) {
            if (recipe.getName().equalsIgnoreCase(name)){
                return recipe;
            }
        }
        return null;
    }

}
