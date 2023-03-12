package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Repository // 어노테이션 내부에 @Component 가 포함되어있어 자동으로 Bean 에 등록됨
public class MemberRepository {

    @PersistenceContext // Spring 에서 만든 EntityManager 를 붙여줌. @PersistenceUnit 을 쓰면 EntityManagerFactory 사용 가능
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findAll() {

        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findByName(String name) {

        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }

}
