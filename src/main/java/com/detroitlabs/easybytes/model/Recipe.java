package com.detroitlabs.easybytes.model;

import java.util.List;

public class Recipe {
    private String name;
    private List<String> tags;
    private List<String> ingredients;
    private List<String> instructionParagraphs;
    private String region;
    private boolean favorite;

    public Recipe(String name, List<String> tags, List<String> ingredients, List<String> instructionParagraphs, String region, boolean favorite) {
        this.name = name;
        this.tags = tags;
        this.ingredients = ingredients;
        this.instructionParagraphs = instructionParagraphs;
        this.region = region;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructionParagraphs() {
        return instructionParagraphs;
    }

    public void setInstructionParagraphs(List<String> instructionParagraphs) {
        this.instructionParagraphs = instructionParagraphs;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}