package com.chain.dao;

import com.chain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {

    Optional<Member> findByOauthNameAndOauthPasswordAndOauthType(String oauthNam, String oauthPassword, String oauthType);
}
