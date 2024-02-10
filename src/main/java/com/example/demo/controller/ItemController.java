package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {
    @Autowired
    itemRepository itemRepository;

    @GetMapping("/api/items")
    public List<Item> getItems(){
        return itemRepository.findAll();
    }
}
