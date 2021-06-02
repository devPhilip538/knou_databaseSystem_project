package com.knoudb.term.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.knoudb.term.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {}
