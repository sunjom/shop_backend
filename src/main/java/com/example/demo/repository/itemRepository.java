package com.example.demo.repository;

import com.example.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemRepository extends JpaRepository<Item, Integer> {
}
