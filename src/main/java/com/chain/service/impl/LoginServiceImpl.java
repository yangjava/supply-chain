package com.chain.service.impl;

import com.chain.api.ReturnT;
import com.chain.api.ReturnTHelper;
import com.chain.dao.MemberRepository;
import com.chain.dao.UserRepository;
import com.chain.entity.Member;
import com.chain.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public ReturnT<Member> register(Member member) {
        Optional<Member> oauthOptional = memberRepository.findByOauthNameAndOauthPasswordAndOauthType(member.getOauthName(), member.getOauthPassword(), member.getOauthType());
        if(oauthOptional.isPresent()){
            return ReturnTHelper.returnFail("0","该用户已经被注册");
        }
        Member memberSave = memberRepository.save(member);
        return ReturnTHelper.returnOk(memberSave);
    }
}
