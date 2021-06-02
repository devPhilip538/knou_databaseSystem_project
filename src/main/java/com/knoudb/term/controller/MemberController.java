package com.knoudb.term.controller;

import com.knoudb.term.model.Member;
import com.knoudb.term.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {


    @Autowired
    public MemberRepository memberRepository;

    @RequestMapping("/")
    public String home () {
        return "test";
    }


    // insert
    @RequestMapping("/insert")
    public Member insert (){
        System.out.println("111111111111111");
        Member member = new Member("Main", 20, "제주");
        System.out.println(member.getId());
        System.out.println(member.getAge());
        System.out.println(member.getAddress());
        System.out.println(member.getName());
        return memberRepository.save(member);
    }
}
