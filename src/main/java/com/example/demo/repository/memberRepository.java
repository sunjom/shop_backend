package com.example.demo.repository;

import com.example.demo.entity.Item;
import com.example.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
