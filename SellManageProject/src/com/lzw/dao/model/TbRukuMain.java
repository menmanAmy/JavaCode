package com.lzw.dao.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TbRukuMain implements Serializable {
	private String rkid;		//id
	private String pzs;			//品种数
	private String je;			//总计金额
	private String ysjl;		//验收结论
	private String gysname;		//供应商名称
	private String rkdate;		//入库时间
	private String czy;			//操作员
	private String jsr;			//经手人
	private String jsfs;		//结算方式
	private Set tbRukuDetails = new HashSet(0);
	
	public TbRukuMain() {
		
	}
	
	public TbRukuMain(String rkId, String pzs, String je, String ysjl, String gysname, String rkdate, String czy, String jsr, String jsfs) {
        this.rkid = rkId;
        this.pzs = pzs;
        this.je = je;
        this.ysjl = ysjl;
        this.gysname = gysname;
        this.rkdate = rkdate;
        this.czy = czy;
        this.jsr = jsr;
        this.jsfs = jsfs;
    }
	
	//获取或设置属性的方法begin
	public String getRkid() {
		return rkid;
	}
	public void setRkid(String rkid) {
		this.rkid = rkid;
	}
	
	public String getPzs() {
		return pzs;
	}
	public void setPzs(String pzs) {
		this.pzs = pzs;
	}
	
	public String getJe() {
		return je;
	}
	public void setJe(String je) {
		this.je = je;
	}
	
	public String getYsjl() {
		return ysjl;
	}
	public void setYsjl(String ysjl) {
		this.ysjl = ysjl;
	}
	
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	
	public String getRkdate() {
		return rkdate;
	}
	public void setRkdate(String rkdate) {
		this.rkdate = rkdate;
	}
	
	public String getCzy() {
		return czy;
	}
	public void setCzy(String czy) {
		this.czy = czy;
	}
	
	public String getJsr() {
		return jsr;
	}
	public void setJsr(String jsr) {
		this.jsr = jsr;
	}
	
	public String getJsfs() {
		return jsfs;
	}
	public void setJsfs(String jsfs) {
		this.jsfs = jsfs;
	}	
	
	public Set getTbRukuDetails() {
		return this.tbRukuDetails;
	}
	public void setTbRukuDetails(Set tbRukuDetails) {
		this.tbRukuDetails = tbRukuDetails;
	}
	//获取或设置属性的方法end
	
	public int hashCode() {		//重写hashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((rkid == null) ? 0 : rkid.hashCode());
		result = PRIME * result + ((pzs == null) ? 0 : pzs.hashCode());
		result = PRIME * result + ((je == null) ? 0 : je.hashCode());
		result = PRIME * result + ((ysjl == null) ? 0 : ysjl.hashCode());
		result = PRIME * result + ((gysname == null) ? 0 : gysname.hashCode());
		result = PRIME * result + ((rkdate == null) ? 0 : rkdate.hashCode());
		result = PRIME * result + ((czy == null) ? 0 : czy.hashCode());
		result = PRIME * result + ((jsr == null) ? 0 : jsr.hashCode());
		result = PRIME * result + ((jsfs == null) ? 0 : jsfs.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//重写equals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbRukuMain other = (TbRukuMain)obj;
		
		if(null == rkid) {
			if(null != other.rkid) 
				return false;
		}
		else if(!rkid.equals(other.rkid))
			return false;
		if(null == pzs) {
			if(null != other.pzs) 
				return false;
		}
		else if(!pzs.equals(other.pzs))
			return false;
		if(null == je) {
			if(null != other.je) 
				return false;
		}
		else if(!je.equals(other.je))
			return false;
		if(null == ysjl) {
			if(null != other.ysjl) 
				return false;
		}
		else if(!ysjl.equals(other.ysjl))
			return false;
		if(null == gysname) {
			if(null != other.gysname) 
				return false;
		}
		else if(!gysname.equals(other.gysname))
			return false;
		if(null == rkdate) {
			if(null != other.rkdate) 
				return false;
		}
		else if(!rkdate.equals(other.rkdate))
			return false;
		if(null == czy) {
			if(null != other.czy) 
				return false;
		}
		else if(!czy.equals(other.czy))
			return false;
		if(null == jsr) {
			if(null != other.jsr) 
				return false;
		}
		else if(!jsr.equals(other.jsr))
			return false;
		if(null == jsfs) {
			if(null != other.jsfs) 
				return false;
		}
		else if(!jsfs.equals(other.jsfs))
			return false;
		
		return true;
	}
}
