package com.lzw.dao.model;

import java.io.Serializable;

public class TbSellDetail implements Serializable {
	private String sellid;		//����id
	private String spid;		//��Ʒ���
	private String dj;			//����
	private Integer sl;			//����
	
	public TbSellDetail() {
		
	}
	
	//��ȡ���������Եķ���begin	
	public String getSellId() {
		return sellid;
	}
	public void setSellId(String sellid) {
		this.sellid = sellid;
	}
	
	public String getSpId() {
		return spid;
	}
	public void setSpId(String spid) {
		this.spid = spid;
	}
	
	public String getDj() {
		return dj;
	}
	public void setDj(String dj) {
		this.dj = dj;
	}
	
	public Integer getSl() {
		return sl;
	}
	public void setSl(Integer sl) {
		this.sl = sl;
	}
	//��ȡ���������Եķ���end
	
	public int hashCode() {		//��дhashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((sellid == null) ? 0 : sellid.hashCode());
		result = PRIME * result + ((spid == null) ? 0 : spid.hashCode());
		result = PRIME * result + ((dj == null) ? 0 : dj.hashCode());
		result = PRIME * result + ((sl == null) ? 0 : sl.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//��дequals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbSellDetail other = (TbSellDetail)obj;
		
		if(null == sellid) {
			if(null != other.sellid) 
				return false;
		}
		else if(!sellid.equals(other.sellid))
			return false;
		if(null == spid) {
			if(null != other.spid) 
				return false;
		}
		else if(!spid.equals(other.spid))
			return false;
		if(null == dj) {
			if(null != other.dj) 
				return false;
		}
		else if(!dj.equals(other.dj))
			return false;
		if(null == sl) {
			if(null != other.sl) 
				return false;
		}
		else if(!sl.equals(other.sl))
			return false;
		
		
		return true;
	}
}
