package com.yh.finalfinaltp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yh.finalfinaltp.dto.BoardDTO;



@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlsession;
	
	public List<BoardDTO> selectlist() {
		List<BoardDTO> list = sqlsession.selectList("board.selectlist"); 
		return list;
	}
}
