package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.memberMapper;
import com.example.demo.service.memberService;
import com.example.demo.vo.member;
@Service
public class memberServiceImpl implements memberService{
	@Autowired
	memberMapper mm;
	
	@Override
	public void addMember(member m) {
		mm.add(m);
		
	}

	@Override
	public member Login(String username, String password) {
		member m=mm.queryMember(username, password);
		return m;
	}

	@Override
	public boolean UsernameRepeat(String username) {
		member m=mm.queryUsername(username);
		boolean x=false;
		if(m!=null) x=true;
		return x;
	}

}
