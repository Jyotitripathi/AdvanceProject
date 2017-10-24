package com.auribises;

public class FaceBookUser extends User{

	String post;
	int friends;
	
	public FaceBookUser() {
		post = "Hello";
		friends = 0;
	}
	
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public int getFriends() {
		return friends;
	}
	public void setFriends(int friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "FaceBookUser [post=" + post + ", friends=" + friends + "]";
	}

	@Override
	void insertUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void retrieveUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createGroup() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
