package com.lzw;

public class Item {
	private String id;		//id���
	private String name;	//name
	
	public Item() {
		
	}
	public Item(String id,String name) {	//���췽��
		this.id = id;
		this.name = name;
	}
	
	//��ȡ���������Եķ���begin
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//��ȡ���������Եķ���end
	
	public String toString() {		//��дtoString����
		return getName();
	}
}
