package com.chain.controller;

import com.chain.api.ReturnT;
import com.chain.api.ReturnTHelper;
import com.chain.entity.Member;
import com.chain.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

      @Autowired
      LoginService loginService;

      public ReturnT<String> register(Member member){
          ReturnT<Member> memberResult = loginService.register(member);
          if(memberResult.fail()){
              return ReturnTHelper.returnMsg(memberResult.getMsg());
          }
          Member memberSave=memberResult.getData();
          String token =String.valueOf(memberSave.getMid()).concat("@")
                  .concat(memberSave.getOauthType());
          return ReturnTHelper.returnOk(token);
      }

}
