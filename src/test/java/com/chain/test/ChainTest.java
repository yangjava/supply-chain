package com.chain.test;

import com.chain.api.ReturnT;
import com.chain.controller.LoginController;
import com.chain.dao.UserRepository;
import com.chain.entity.Member;
import com.chain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChainTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginController loginController;

    @Test
    public void getUser(){
        List<User> all = userRepository.findAll();
        all.stream().forEach(System.out::println);

    }

    @Test
    public void register(){
      Member member=new Member();
      member.setOauthName("张三");
      member.setOauthPassword("admin");
      member.setOauthType("NAME");
      member.setPhone(15110083350L);
        member.setMid(1);
      ReturnT<String> register = loginController.register(member);
      System.out.println(register);
    }
}
