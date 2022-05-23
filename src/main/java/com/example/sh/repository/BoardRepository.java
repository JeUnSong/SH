package com.example.sh.repository;

import com.example.sh.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository <Board, Integer> {
}
