package com.example.ezentour.model.member.dao;

import java.util.List;

import com.example.ezentour.model.member.dto.MemberDTO;

public interface MemberDAO {
	public boolean loginCheck(MemberDTO dto);
	public MemberDTO viewMember(String m_id);
	
	// 관리자가 사용자 명단 확인
	public List<MemberDTO> memberList(); 
	
	// 관리자가 사용자 상세 정보 확인
	public MemberDTO memberDetail(String showM_id);
	
	// 관리자가 사용자 정보 수정
	public void memberUpdate(MemberDTO dto);
	
	// 관리자가 사용자 탈퇴시키기
	public void memberDelete(String showM_id);
	
	// 회원 가입
	public void register(MemberDTO dto) throws Exception;
	
	// 로그인
	public MemberDTO login(MemberDTO dto) throws Exception;
	
	// 회원정보 수정
	public void modify(MemberDTO dto) throws Exception;
	
	// 회원 탈퇴
	public void withdrawal(MemberDTO dto) throws Exception;
	
	public int idcheck(String m_id);
	
	// 아이디 확인
	//public MemberDTO idCheck(String m_id) throws Exception;
	
	//public int checkId(MemberDTO dto);
	
}
