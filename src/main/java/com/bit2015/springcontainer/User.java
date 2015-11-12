package com.bit2015.springcontainer;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Friend friend;
	private List<String> firends;
	
	private int no;
	private String name;
	
	public User() {
	}
	public User( String name ) {
		this.name = name;
	}
	public User( int no ) {
		this.no = no;
	}
	public User( int no, String name ) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	public List<String> getFirends() {
		return firends;
	}
	public void setFirends(List<String> firends) {
		this.firends = firends;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}
}
