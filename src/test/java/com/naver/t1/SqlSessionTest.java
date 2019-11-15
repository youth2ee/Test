package com.naver.t1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SqlSessionTest extends TestAbstractCase {

	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		assertNotNull(sqlSession);
	}

}
