package com.example.sh.repository;

import com.example.sh.entity.BoardLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardLikeRepository extends JpaRepository<BoardLike, Integer> {
}
