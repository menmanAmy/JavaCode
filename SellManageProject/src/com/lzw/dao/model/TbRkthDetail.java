package com.lzw.dao.model;

import java.io.Serializable;

public class TbRkthDetail implements Serializable {
	private Integer id;				//id
	private String tbRkthMain;		
	private String spid;			//��Ʒid
	private Double dj;				//����
	private Integer sl;				//����
	
	//���췽��
	public TbRkthDetail() {
	}
	public TbRkthDetail(String tbRkthMain, String spid, Double dj, Integer sl) {
		this.tbRkthMain = tbRkthMain;
		this.spid = spid;
		this.dj = dj;
		this.sl = sl;
	}
	
	//��ȡ����������
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTbRkthMain() {
		return this.tbRkthMain;
	}

	public void setTbRkthMain(String tbRkthMain) {
		this.tbRkthMain = tbRkthMain;
	}

	public String getSpid() {
		return this.spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}
}
