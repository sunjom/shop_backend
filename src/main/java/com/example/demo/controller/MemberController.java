package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.entity.Member;
import com.example.demo.repository.itemRepository;
import com.example.demo.repository.memberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MemberController {
    @Autowired
    memberRepository memberRepository;

    @PostMapping("/api/account/login")
    public int login(@RequestBody Map<String,String> params){
        Member member= memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        if(member != null) {
            return member.getId();
        }
        return 0;
    }

}
