package com.lzw.dao.model;

import java.io.Serializable;

public class TbJsr implements Serializable {
	private String id;			//������
	private String name;		//����������
	private String sex;			//�Ա�
	private String age;			//����
	private String tel;			//�绰
	private String enable;
	
	public TbJsr() {
		
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
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	//��ȡ���������Եķ���end
	
	public int hashCode() {		//��дhashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		result = PRIME * result + ((sex == null) ? 0 : sex.hashCode());
		result = PRIME * result + ((age == null) ? 0 : age.hashCode());
		result = PRIME * result + ((tel == null) ? 0 : tel.hashCode());
		result = PRIME * result + ((enable == null) ? 0 : enable.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//��дequals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbJsr other = (TbJsr)obj;
		
		if(null == id) {
			if(null != other.id) 
				return false;
		}
		else if(!id.equals(other.id))
			return false;
		if(null == name) {
			if(null != other.name) 
				return false;
		}
		else if(!name.equals(other.name))
			return false;
		if(null == sex) {
			if(null != other.sex) 
				return false;
		}
		else if(!sex.equals(other.sex))
			return false;
		if(null == age) {
			if(null != other.age) 
				return false;
		}
		else if(!age.equals(other.age))
			return false;
		if(null == tel) {
			if(null != other.tel) 
				return false;
		}
		else if(!tel.equals(other.tel))
			return false;
		if(null == enable) {
			if(null != other.enable) 
				return false;
		}
		else if(!enable.equals(other.enable))
			return false;
		
		
		return true;
	}
}
