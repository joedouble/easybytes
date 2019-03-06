package com.detroitlabs.easybytes.model;

import java.util.List;

public class Recipe {
    private String name;
    private String pictureName;
    private List<String> tags;
    private List<String> ingredients;
    private List<String> instructionParagraphs;
    private String region;
    private boolean favorite;
    private boolean addedByUser;
    private String author;

    public Recipe(String name, List<String> tags, List<String> ingredients, List<String> instructionParagraphs, String region, boolean favorite, boolean addedByUser, String author) {
        this.name = name;
        this.pictureName = this.name.toLowerCase().replace(" ", "");
        this.tags = tags;
        this.ingredients = ingredients;
        this.instructionParagraphs = instructionParagraphs;
        this.region = region;
        this.favorite = favorite;
        this.addedByUser = addedByUser;
        this.author = author;

        checkToSetDefaultImage(this.addedByUser);
    }

    private void checkToSetDefaultImage(boolean addedByUser){
        if(addedByUser){
            this.pictureName = "default";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
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

    public boolean isAddedByUser() {
        return addedByUser;
    }

    public void setAddedByUser(boolean addedByUser) {
        this.addedByUser = addedByUser;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}