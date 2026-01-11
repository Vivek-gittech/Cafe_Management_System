package com.project.Cafe_Management_System.Dto.Recipe_itemDto;

public class Recipe_itemDto {
    private Integer recipe_item_id;
    private Integer item_id;
    private Integer ingredient_id;
    private Integer order_id;
    private Integer order_item_id;

    public Integer getRecipe_item_id() {
        return recipe_item_id;
    }

    public void setRecipe_item_id(Integer recipe_item_id) {
        this.recipe_item_id = recipe_item_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getIngredient_id() {
        return ingredient_id;
    }

    public void setIngredient_id(Integer ingredient_id) {
        this.ingredient_id = ingredient_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(Integer order_item_id) {
        this.order_item_id = order_item_id;
    }
}
