package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);

	}

	@Override
	public MemberVO readMember(String uid) throws Exception {
		return sqlSession.selectOne(namespace+".selectMember", uid);
	}

	@Override
	public MemberVO readWithPW(String uid, String upw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("uid", uid);
		paramMap.put("upw", upw);
		
		return sqlSession.selectOne(namespace+".readWithPW",paramMap);
				
	}
	
	

}
