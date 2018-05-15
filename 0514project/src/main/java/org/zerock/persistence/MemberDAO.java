package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String uid) throws Exception;
	public MemberVO readWithPW(String uid, String pw) throws Exception;
	

}
