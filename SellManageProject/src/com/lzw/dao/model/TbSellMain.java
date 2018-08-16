package com.lzw.dao.model;

import java.io.Serializable;
import java.util.Set;

public class TbSellMain implements Serializable {
	private String sellid;		//id
	private String pzs;			//����Ʒ����
	private String je;			//�ܼƽ��
	private String ysjl;		//���ս���
	private String khname;		//�ͻ�����
	private String xsdate;		//����ʱ��
	private String czy;			//����Ա
	private String jsr;			//������
	private String jsfs;		//���㷽ʽ
	private Set    tbSellDetails;
	
	public TbSellMain() {
		
	}
	
	//��ȡ���������Եķ���begin
	public String getSellid() {
		return sellid;
	}
	public void setSellid(String sellid) {
		this.sellid = sellid;
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
	
	public String getKhname() {
		return khname;
	}
	public void setKhname(String khname) {
		this.khname = khname;
	}
	
	public String getXsdate() {
		return xsdate;
	}
	public void setXsdate(String xsdate) {
		this.xsdate = xsdate;
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
	
	public Set getTbSellDetails() {
		return this.tbSellDetails;
	}
	public void setTbSellDetails(Set tbSellDetails) {
		this.tbSellDetails = tbSellDetails;
	}
	//��ȡ���������Եķ���end
	
	public int hashCode() {		//��дhashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((sellid == null) ? 0 : sellid.hashCode());
		result = PRIME * result + ((pzs == null) ? 0 : pzs.hashCode());
		result = PRIME * result + ((je == null) ? 0 : je.hashCode());
		result = PRIME * result + ((ysjl == null) ? 0 : ysjl.hashCode());
		result = PRIME * result + ((khname == null) ? 0 : khname.hashCode());
		result = PRIME * result + ((xsdate == null) ? 0 : xsdate.hashCode());
		result = PRIME * result + ((czy == null) ? 0 : czy.hashCode());
		result = PRIME * result + ((jsr == null) ? 0 : jsr.hashCode());
		result = PRIME * result + ((jsfs == null) ? 0 : jsfs.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//��дequals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbSellMain other = (TbSellMain)obj;
		
		if(null == sellid) {
			if(null != other.sellid) 
				return false;
		}
		else if(!sellid.equals(other.sellid))
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
		if(null == khname) {
			if(null != other.khname) 
				return false;
		}
		else if(!khname.equals(other.khname))
			return false;
		if(null == xsdate) {
			if(null != other.xsdate) 
				return false;
		}
		else if(!xsdate.equals(other.xsdate))
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
