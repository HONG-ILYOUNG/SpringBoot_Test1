package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Board;
import com.example.demo.repository.BoardRepository;



@Service
public class BoardServiceImpl implements BoardService {
 
    @Autowired
    private BoardRepository boardRepository;
    
    @Override
    public Page<Board> findBoardList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize());
        return boardRepository.findAll(pageable);
    }
 
    @Override
    public Board findBoardByIdx(Long idx) {
        return boardRepository.findById(idx).orElse(new Board());
    }

	@Override
	public Board findBoardByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board findBoardByContente(String contents) {
		// TODO Auto-generated method stub
		return null;
	}
}