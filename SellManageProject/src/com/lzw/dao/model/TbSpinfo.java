package com.lzw.dao.model;

public class TbSpinfo implements java.io.Serializable {
	private String id;			//id
	private String spname;		//��Ʒ����
	private String jc;			//��Ʒ���
	private String cd;			//����
	private String dw;			//��λ
	private String gg;			//���
	private String bz;			//��װ
	private String ph;			//����
	private String pzwh;		//��׼�ĺ�
	private String memo;		//��ע
	private String gysname;		//��Ӧ������
	
	public TbSpinfo() {
		
	}
	
	//��ȡ���������Եķ���begin
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	
	public String getJc() {
		return jc;
	}
	public void setJc(String jc) {
		this.jc = jc;
	}
	
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	
	public String getDw() {
		return dw;
	}
	public void setDw(String dw) {
		this.dw = dw;
	}
	
	public String getGg() {
		return gg;
	}
	public void setGg(String gg) {
		this.gg = gg;
	}
	
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	
	public String getPzwh() {
		return pzwh;
	}
	public void setPzwh(String pzwh) {
		this.pzwh = pzwh;
	}
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}	
	//��ȡ���������Եķ���end
	
	public int hashCode() {		//��дhashCode
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + ((spname == null) ? 0 : spname.hashCode());
		result = PRIME * result + ((jc == null) ? 0 : jc.hashCode());
		result = PRIME * result + ((cd == null) ? 0 : cd.hashCode());
		result = PRIME * result + ((dw == null) ? 0 : dw.hashCode());
		result = PRIME * result + ((gg == null) ? 0 : gg.hashCode());
		result = PRIME * result + ((bz == null) ? 0 : bz.hashCode());
		result = PRIME * result + ((ph == null) ? 0 : ph.hashCode());
		result = PRIME * result + ((pzwh == null) ? 0 : pzwh.hashCode());
		result = PRIME * result + ((memo == null) ? 0 : memo.hashCode());
		result = PRIME * result + ((gysname == null) ? 0 : gysname.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {		//��дequals
		if(this == obj)
			return true;
		if(null == obj)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		final TbSpinfo other = (TbSpinfo)obj;
		
		if(null == id) {
			if(null != other.id) 
				return false;
		}
		else if(!id.equals(other.id))
			return false;
		if(null == spname) {
			if(null != other.spname) 
				return false;
		}
		else if(!spname.equals(other.spname))
			return false;
		if(null == jc) {
			if(null != other.jc) 
				return false;
		}
		else if(!jc.equals(other.jc))
			return false;
		if(null == cd) {
			if(null != other.cd) 
				return false;
		}
		else if(!cd.equals(other.cd))
			return false;
		if(null == dw) {
			if(null != other.dw) 
				return false;
		}
		else if(!dw.equals(other.dw))
			return false;
		if(null == gg) {
			if(null != other.gg) 
				return false;
		}
		else if(!gg.equals(other.gg))
			return false;
		if(null == bz) {
			if(null != other.bz) 
				return false;
		}
		else if(!bz.equals(other.bz))
			return false;
		if(null == ph) {
			if(null != other.ph) 
				return false;
		}
		else if(!ph.equals(other.ph))
			return false;
		if(null == pzwh) {
			if(null != other.pzwh) 
				return false;
		}
		else if(!pzwh.equals(other.pzwh))
			return false;
		if(null == memo) {
			if(null != other.memo) 
				return false;
		}
		else if(!memo.equals(other.memo))
			return false;
		if(null == gysname) {
			if(null != other.gysname) 
				return false;
		}
		else if(!gysname.equals(other.gysname))
			return false;
		
		return true;
	}
}
