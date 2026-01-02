package com.project.Cafe_Management_System.Service.Menu_itemService;

import com.project.Cafe_Management_System.Dto.Menu_itemDto.Menu_itemDto;
import com.project.Cafe_Management_System.Dto.Menu_itemDto.Menu_itemResponesDto;

public interface Menu_itemService {
    Menu_itemResponesDto menu_Post(Menu_itemDto menu_itemDto);
}