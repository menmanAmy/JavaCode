package com.lzw.dao.model;

import java.io.Serializable;

public class TbKhinfo implements Serializable {
	private String id;			//�ͻ�id
	private String khname;		//�ͻ�����
	private String jian;
	private String address;		//��ַ
	private String bianma;		//�ʱ�
	private String tel;			//�绰
	private String fax;			//����	
	private String lian;		//��ϵ��
	private String ltel;		//��ϵ�˵绰
	private String mail;		//��ϵ������
	private String xinhang;
	private String hao;

	//���췽��
	public TbKhinfo() {
		
	}
	
	//��ȡ���������Եķ���begin
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getKhname() {
		return khname;
	}
	public void setKhname(String khname) {
		this.khname = khname;
	}
	
	public String getJian() {
		return jian;
	}
	public void setJian(String jian) {
		this.jian = jian;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBianma() {
		return bianma;
	}
	public void setBianma(String bianma) {
		this.bianma = bianma;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getLian() {
		return lian;
	}
	public void setLian(String lian) {
		this.lian = lian;
	}
	
	public String getLtel() {
		return ltel;
	}
	public void setLtel(String ltel) {
		this.ltel = ltel;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getXinhang() {
		return xinhang;
	}
	public void setXinhang(String xinhang) {
		this.xinhang = xinhang;
	}
	
	public String getHao() {
		return hao;
	}
	public void setHao(String hao) {
		this.hao = hao;
	}
	//��ȡ���������Եķ���end
/*	
	public int hashCode() {		//��дhashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((khname == null) ? 0 : khname.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//��дequals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbKhinfo other = (TbKhinfo)obj;
		
		if(null == khname) {
			if(null != other.khname) 
				return false;
		}
		else if(!khname.equals(other.khname))
			return false;
		
		
		return true;
	}
*/
}
