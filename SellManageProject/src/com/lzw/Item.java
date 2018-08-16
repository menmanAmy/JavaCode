package com.lzw;

public class Item {
	private String id;		//id编号
	private String name;	//name
	
	public Item() {
		
	}
	public Item(String id,String name) {	//构造方法
		this.id = id;
		this.name = name;
	}
	
	//获取或设置属性的方法begin
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
	//获取或设置属性的方法end
	
	public String toString() {		//重写toString方法
		return getName();
	}
}
