package com.project.Cafe_Management_System.Mapper.Menu_itemMapper;

import com.project.Cafe_Management_System.Dto.Menu_itemDto.Menu_itemDto;
import com.project.Cafe_Management_System.Dto.Menu_itemDto.Menu_itemResponesDto;
import com.project.Cafe_Management_System.Entity.CategoryEntity.Category;
import com.project.Cafe_Management_System.Entity.Menu_itemEntity.Menu_item;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Menu_itemMapper {

    public static Menu_item to_Entity(Menu_itemDto menu_itemDto, Category category){
        Menu_item menu_item=new Menu_item();
        menu_item.setItem_name(menu_itemDto.getItem_name());
        menu_item.setCategory(category);
        menu_item.setPrice(menu_itemDto.getPrice());
        menu_item.setStock_quantity(menu_itemDto.getStock_quantity());
        menu_item.setCreated_at(LocalDateTime.now());
        menu_item.setUpdate_at(LocalDateTime.now());
        return menu_item;
    }
    public static Menu_itemResponesDto to_Dto(Menu_item menu_item){
        Menu_itemResponesDto menu_itemResponesDto=new Menu_itemResponesDto();
        menu_itemResponesDto.setItem_name(menu_item.getItem_name());
        menu_itemResponesDto.setPrice(menu_item.getPrice());
        menu_itemResponesDto.setStock_quantity(menu_item.getStock_quantity());
        if(menu_item.getCategory()!=null) {
            menu_itemResponesDto.setCategory_name(menu_item.getCategory().getCategory_name());
        }
        return menu_itemResponesDto;
    }
}
