package com.lzw.dao.model;

public class TbGysinfo implements java.io.Serializable {
	private String id;			//id
	private String name;		//供应商名称
	private String jc;			//供应商简称
	private String address;		//供应商地址
	private String bianma;		//邮编
	private String tel;			//电话
	private String fax;			//传真
	private String lian;		//联系人
	private String ltel;		//联系人电话
	private String yh;			//开户银行
	private String mail;		//电子邮箱
	
	public TbGysinfo() {
		
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
	
	public String getJc() {
		return jc;
	}
	public void setJc(String jc) {
		this.jc = jc;
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
	
	public String getYh() {
		return yh;
	}
	public void setYh(String yh) {
		this.yh = yh;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
	//获取或设置属性的方法end
	
	public int hashCode() {		//重写hashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		result = PRIME * result + ((jc == null) ? 0 : jc.hashCode());
		result = PRIME * result + ((address == null) ? 0 : address.hashCode());
		result = PRIME * result + ((bianma == null) ? 0 : bianma.hashCode());
		result = PRIME * result + ((tel == null) ? 0 : tel.hashCode());
		result = PRIME * result + ((fax == null) ? 0 : fax.hashCode());
		result = PRIME * result + ((lian == null) ? 0 : lian.hashCode());
		result = PRIME * result + ((ltel == null) ? 0 : ltel.hashCode());
		result = PRIME * result + ((yh == null) ? 0 : yh.hashCode());
		result = PRIME * result + ((mail == null) ? 0 : mail.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//重写equals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbGysinfo other = (TbGysinfo)obj;
		
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
		if(null == jc) {
			if(null != other.jc) 
				return false;
		}
		else if(!jc.equals(other.jc))
			return false;
		if(null == address) {
			if(null != other.address) 
				return false;
		}
		else if(!address.equals(other.address))
			return false;
		if(null == bianma) {
			if(null != other.bianma) 
				return false;
		}
		else if(!bianma.equals(other.bianma))
			return false;
		if(null == tel) {
			if(null != other.tel) 
				return false;
		}
		else if(!tel.equals(other.tel))
			return false;
		if(null == fax) {
			if(null != other.fax) 
				return false;
		}
		else if(!fax.equals(other.fax))
			return false;
		if(null == lian) {
			if(null != other.lian) 
				return false;
		}
		else if(!lian.equals(other.lian))
			return false;
		if(null == ltel) {
			if(null != other.ltel) 
				return false;
		}
		else if(!ltel.equals(other.ltel))
			return false;
		if(null == yh) {
			if(null != other.yh) 
				return false;
		}
		else if(!yh.equals(other.yh))
			return false;
		if(null == mail) {
			if(null != other.mail) 
				return false;
		}
		else if(!mail.equals(other.mail))
			return false;
		
		return true;
	}
}
