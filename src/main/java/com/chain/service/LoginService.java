package com.chain.service;

import com.chain.api.ReturnT;
import com.chain.entity.Member;

public interface LoginService {

    ReturnT<Member> register(Member member);
}
