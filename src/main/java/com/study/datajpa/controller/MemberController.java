package com.study.datajpa.controller;

import com.study.datajpa.entity.Member;
import com.study.datajpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id") Long id) {
        return memberRepository.findById(id).get().getMemberName();
    }

    @GetMapping("/membersV2/{id}")
    public String findMember(@PathVariable("id") Member member) {
        return member.getMemberName();
    }
}