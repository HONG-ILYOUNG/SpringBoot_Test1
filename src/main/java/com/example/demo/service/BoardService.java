package com.example.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Board;


public interface BoardService {
    Page<Board> findBoardList(Pageable pageable);
    Board findBoardByIdx(Long idx);
    Board findBoardByTitle(String title);
    Board findBoardByContente(String contents);   
}