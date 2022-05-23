package com.example.sh.repository;

import com.example.sh.entity.GuestBookCo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookCoRepository extends JpaRepository<GuestBookCo, Integer> {
}
