package com.yh.finalfinaltp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yh.finalfinaltp.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlsession;
	
	public MemberDTO chklogin(MemberDTO dto) {
		dto = sqlsession.selectOne("member.loginchk",dto);
		return dto;
	}

}
