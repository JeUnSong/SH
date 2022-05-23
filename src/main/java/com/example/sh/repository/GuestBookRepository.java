package com.example.sh.repository;

import com.example.sh.entity.GuestBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {
}
