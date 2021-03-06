/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.lzw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.lzw.Item;
import com.lzw.dao.model.TbGysinfo;
import com.lzw.dao.model.TbKhinfo;
import com.lzw.dao.model.TbKucun;
import com.lzw.dao.model.TbRkthDetail;
import com.lzw.dao.model.TbRkthMain;
import com.lzw.dao.model.TbRukuDetail;
import com.lzw.dao.model.TbRukuMain;
import com.lzw.dao.model.TbSellDetail;
import com.lzw.dao.model.TbSellMain;
import com.lzw.dao.model.TbSpinfo;
import com.lzw.dao.model.TbXsthDetail;
import com.lzw.dao.model.TbXsthMain;

public class Dao{
	//数据库驱动类
	protected static String dbClassName = "com.mysql.cj.jdbc.Driver";
	//访问数据库的URL
	protected static String dbUrl = "jdbc:mysql://localhost:3306/" 
			+ "db_database28?useSSL=false&serverTimezone=GMT";
	//访问数据库的用户名
	protected static String dbUser = "root";
	//访问数据库的密码
	protected static String dbPwd = "111111";
	//数据库连接
	public static Connection conn = null;
	
	static {
		try {
			if(null == conn) {
				Class.forName(dbClassName);
				conn = DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			}
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	//构造方法
	private Dao() {
		
	}
	
	public static int restoreOrBackup(String sql) throws Exception {
		int res = 0;
		if(null != conn) {
			conn.close();
		}
		
		conn = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:3066/master", dbUser,
				dbPwd);
		Statement stmt = conn.createStatement();
		String single = "alter database db_database28 set single_user"
				+ " with rollback immediate " + sql;
		res = stmt.executeUpdate(single);
		stmt.close();
		conn.close();
		
		conn = DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		
		return res;
	}
	
	//读取所有客户信息
	public static List getKhInfos() {
		List list = findForList("select id,khname from tb_khinfo");
		return list;
	}
	
	//读取所有供应商信息
	public static List getGysInfos() {
		List list = findForList("select id,name from tb_gysinfo");
		return list;
	}
	
	//获取所有商品信息
	public static List getSpInfos() {
		List list = findForList("select * from tb_spinfo");
		return list;
	}
	
	//从数据库读取客户信息
	public static TbKhinfo getKhInfo(Item item) {
		//获取name
		String sqlwhere = "khname='" + item.getName() + "'";
		TbKhinfo khInfo = new TbKhinfo();
		ResultSet set = findForResultSet("select * from tb_khinfo where" + sqlwhere);
		
		try {
			if(set.next()) {
				khInfo.setId(set.getString("id").trim());
				khInfo.setKhname(set.getString("khname").trim());
				khInfo.setJian(set.getString("jian").trim());
				khInfo.setAddress(set.getString("address").trim());
				khInfo.setBianma(set.getString("bianma").trim());
				khInfo.setTel(set.getString("tel").trim());
				khInfo.setFax(set.getString("fax").trim());
				khInfo.setLian(set.getString("lian").trim());
				khInfo.setLtel(set.getString("ltel").trim());
				khInfo.setMail(set.getString("mail").trim());
				khInfo.setHao(set.getString("hao").trim());
				khInfo.setXinhang(set.getString("xinhang").trim());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return khInfo;
	}
	
	//从数据库读取供应商信息
	public static TbGysinfo getGysInfo(Item item) {
		//获取name
		String sqlwhere = "name='" + item.getName() + "'";
		TbGysinfo gysInfo = new TbGysinfo();
		ResultSet set = findForResultSet("select * from tb_gysinfo where " + sqlwhere);
		
		try {
			if(set.next()) {
				gysInfo.setId(set.getString("id").trim());
				gysInfo.setName(set.getString("name").trim());
				gysInfo.setJc(set.getString("jc").trim());
				gysInfo.setAddress(set.getString("address").trim());
				gysInfo.setBianma(set.getString("bianma").trim());
				gysInfo.setTel(set.getString("tel").trim());
				gysInfo.setFax(set.getString("fax").trim());
				gysInfo.setLian(set.getString("lian").trim());
				gysInfo.setLtel(set.getString("ltel").trim());
				gysInfo.setMail(set.getString("mail").trim());
				gysInfo.setYh(set.getString("yh").trim());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return gysInfo;
	}
	
	//从数据库读取商品信息
	public static TbSpinfo getSpInfo(Item item) {
		//获取name
		String sqlwhere = "spname='" + item.getName() + "'";
		TbSpinfo spInfo = new TbSpinfo();
		ResultSet set = findForResultSet("select * from tb_spinfo where " + sqlwhere);
		
		try {
			if(set.next()) {
				spInfo.setId(set.getString("id").trim());
				spInfo.setSpname(set.getString("spname").trim());
				spInfo.setJc(set.getString("jc").trim());
				spInfo.setCd(set.getString("cd").trim());
				spInfo.setDw(set.getString("dw").trim());
				spInfo.setGg(set.getString("gg").trim());
				spInfo.setBz(set.getString("bz").trim());
				spInfo.setPh(set.getString("ph").trim());
				spInfo.setPzwh(set.getString("pzwh").trim());
				spInfo.setMemo(set.getString("memo").trim());
				spInfo.setGysname(set.getString("gysname").trim());
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return spInfo;
	}
	
	//数据库读取库存信息
	public static TbKucun getKucun(Item item) {
		String where = "spname='" + item.getName() + "'";
		if(item.getId() != null){
			where = "id='" + item.getId() + "'";
		}
		ResultSet set = findForResultSet("select * from tb_kucun where " + where);
		TbKucun kucun = new TbKucun();;
		
		try {
			if(set.next()) {
				kucun.setId(set.getString("id").trim());
				kucun.setSpname(set.getString("spname").trim());
				kucun.setJc(set.getString("jc").trim());
				kucun.setCd(set.getString("cd").trim());
				kucun.setDw(set.getString("dw").trim());
				kucun.setGg(set.getString("gg").trim());
				kucun.setBz(set.getString("bz").trim());
				kucun.setDj(set.getDouble("dj"));
				kucun.setKcsl(set.getInt("cksl"));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return kucun;
	}
	
	//添加客户信息
	public static boolean addKeHu(TbKhinfo khinfo) {
		if(null == khinfo)
			return false;
		return insert("insert into tb_khinfo values('" + khinfo.getId() + "','" + khinfo.getKhname()
				+ "','" + khinfo.getJian() + "','" + khinfo.getAddress() + "','" + khinfo.getBianma()
				+ "','" + khinfo.getHao() + "','" + khinfo.getFax() + "','" + khinfo.getLian() 
				+ "','" + khinfo.getLtel() + "','" + khinfo.getMail() + "','" + khinfo.getTel()
				+ "','" + khinfo.getXinhang() + "')");
	}
	
	//更新客户信息
	public static int updateKeHu(TbKhinfo khinfo) {
		if(null == khinfo)
			return 0;
		return update("update tb_khinfo set jian='" + khinfo.getJian() + "',address='"
				+ khinfo.getAddress() + "',bianma='" + khinfo.getBianma() + "',hao='"
				+ khinfo.getHao() + "',fax='" + khinfo.getFax() + "',lian='"
				+ khinfo.getLian() + "',ltel='" + khinfo.getLtel() + "',mail='"
				+ khinfo.getMail() + "',tel='" + khinfo.getTel() + "',xinhang='"
				+ khinfo.getXinhang() + "' where id='" + khinfo.getId() + "'");
	}
	
	//更新库存商品单价
	public static int updateKucunDj(TbKucun kucun) {
		return update("update tb_kucun set dj='" + kucun.getDj() + "' where id ='"
				+ kucun.getId() + "'");
	}
	
	//添加供应商信息
	public static boolean insertGysInfo(TbGysinfo gysInfo) {
		if(null == gysInfo)
			return false;
		return insert("insert into tb_gysinfo values('" + gysInfo.getId() + "','" + gysInfo.getName()
				+ "','" + gysInfo.getJc() + "','" + gysInfo.getAddress() + "','" + gysInfo.getBianma()
				+ "','" + gysInfo.getTel() + "','" + gysInfo.getFax() + "','" + gysInfo.getLian()
				+ "','" + gysInfo.getLtel() + "','" + gysInfo.getYh() + "','" + gysInfo.getMail()
				+ "')");
	}
	
	//更新供应商信息
	public static int updateGysInfo(TbGysinfo gysInfo) {
		if(null == gysInfo)
			return 0;
		return update("update tb_gysinfo set jc='" + gysInfo.getJc() + "',address='" + gysInfo.getAddress()
				+ "',bianma='" + gysInfo.getBianma() + "',tel='" + gysInfo.getTel() + "',fax='"
				+ gysInfo.getFax() + "',lian='" + gysInfo.getLian() + "',ltel='" + gysInfo.getLtel()
				+ "',yh='" + gysInfo.getYh() + "',mail='" + gysInfo.getMail() + "' where id='"
				+ gysInfo.getId() + "'");
	}
	
	//添加商品信息
	public static boolean addSp(TbSpinfo spInfo) {
		if (spInfo == null)
			return false;
		return insert("insert tb_spinfo values('" + spInfo.getId() + "','"
				+ spInfo.getSpname() + "','" + spInfo.getJc() + "','"
				+ spInfo.getCd() + "','" + spInfo.getDw() + "','"
				+ spInfo.getGg() + "','" + spInfo.getBz() + "','"
				+ spInfo.getPh() + "','" + spInfo.getPzwh() + "','"
				+ spInfo.getMemo() + "','" + spInfo.getGysname() + "')");
	}
	
	//更新商品信息
	public static int updateSp(TbSpinfo spInfo) {
		return update("update tb_spinfo set jc='" + spInfo.getJc()
				+ "',cd='" + spInfo.getCd() + "',dw='" + spInfo.getDw()
				+ "',gg='" + spInfo.getGg() + "',bz='" + spInfo.getBz()
				+ "',ph='" + spInfo.getPh() + "',pzwh='"
				+ spInfo.getPzwh() + "',memo='" + spInfo.getMemo()
				+ "',gysname='" + spInfo.getGysname() + "' where id='"
				+ spInfo.getId() + "'");
	}
	
	//按事物添加入库信息
	public static boolean insertRkInfo(TbRukuMain rukuMain) {
		if(null == rukuMain)
			return false;
		try {
			//不自动commit，由本方法自己控制
			boolean aotuCommit = conn.getAutoCommit();
			conn.setAutoCommit(false);
			
			insert("insert into tb_ruku_main values('" + rukuMain.getRkid() + "','"
					+ rukuMain.getPzs() + "','" + rukuMain.getJe() + "','" + rukuMain.getYsjl()
					+ "','" + rukuMain.getGysname() + "','" + rukuMain.getRkdate() + "','"
					+ rukuMain.getCzy() + "','" + rukuMain.getJsr() + "','" + rukuMain.getJsfs()
					+ "')");
			
			Set<TbRukuDetail> rkDetails = rukuMain.getTbRukuDetails();
			for(Iterator<TbRukuDetail> ite = rkDetails.iterator();ite.hasNext();) {
				TbRukuDetail rkDetail = ite.next();
				
				insert("insert into tb_ruku_detail values('" + rkDetail.getRkId() + "','"
						+ rkDetail.getSpId() + "','" + rkDetail.getDj() + "','"
						+ rkDetail.getSl() + "')");
				
				//更新库存信息
				Item item = new Item();
				item.setId(rkDetail.getSpId());
				TbSpinfo spinfo = getSpInfo(item);
				if(spinfo.getId() != null && !spinfo.getId().isEmpty()) {
					TbKucun kucun = getKucun(item);
					if (kucun.getId() == null || kucun.getId().isEmpty()) {
						insert("insert into tb_kucun values('"
								+ spinfo.getId() + "','"
								+ spinfo.getSpname() + "','"
								+ spinfo.getJc() + "','" + spinfo.getCd()
								+ "','" + spinfo.getGg() + "','"
								+ spinfo.getBz() + "','" + spinfo.getDw()
								+ "'," + rkDetail.getDj() + ","
								+ rkDetail.getSl() + ")");
					} else {
						int sl = kucun.getKcsl() + rkDetail.getSl();
						update("update tb_kucun set kcsl=" + sl + ",dj="
								+ rkDetail.getDj() + " where id='"
								+ kucun.getId() + "'");
					}
				}
			}
			conn.commit();
			conn.setAutoCommit(aotuCommit);
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//按事物添加入库退货信息
	public static boolean insertRkthInfo(TbRkthMain rkthMain) {
		if(null == rkthMain)
			return false;
		try {
			//不自动commit，由本方法自己控制
			boolean aotuCommit = conn.getAutoCommit();
			conn.setAutoCommit(false);
			
			insert("insert into tb_rkth_main values('" + rkthMain.getRkthId() + "','"
					+ rkthMain.getPzs() + "','" + rkthMain.getJe() + "','" + rkthMain.getYsjl()
					+ "','" + rkthMain.getGysname() + "','" + rkthMain.getRtdate() + "','"
					+ rkthMain.getCzy() + "','" + rkthMain.getJsr() + "','"
					+ rkthMain.getJsfs() + "')");
			
			Set<TbRkthDetail> rkthDetails = rkthMain.getTbRkthDetails();
			for(Iterator<TbRkthDetail> ite = rkthDetails.iterator();ite.hasNext();) {
				TbRkthDetail rkthDetail = ite.next();
				insert("insert into tb_rkth_detail values('" + rkthDetail.getId() + "','"
						+ rkthDetail.getSpid() + "','" + rkthDetail.getDj() + "','"
						+ rkthDetail.getSl() + "')");
				
				//更新库存信息
				Item item = new Item();
				item.setId(rkthDetail.getSpid());
				TbSpinfo spinfo = getSpInfo(item);
				if(spinfo.getId() != null && !spinfo.getId().isEmpty()) {
					TbKucun kucun = getKucun(item);
					if(kucun.getId() != null && !kucun.getId().isEmpty()) {
						int sl = kucun.getKcsl() - rkthDetail.getSl();
						update("update tb_kucun set kcsl='" + sl + "' where id='" 
								+ kucun.getId() + "'");
					}
				}
			}
			conn.commit();
			conn.setAutoCommit(aotuCommit);
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	//按事物添加销售信息
	public static boolean insertSellInfo(TbSellMain sellMain) {
		if(null == sellMain)
			return false;
		try {
			//不自动commit，由本方法自己控制
			boolean aotuCommit = conn.getAutoCommit();
			conn.setAutoCommit(false);
			
			insert("insert into tb_sell_main values('" + sellMain.getSellid() + "','" 
					+ sellMain.getPzs() + "','" + sellMain.getJe() + "','" + sellMain.getYsjl()
					+ "','" + sellMain.getKhname() + "','" + sellMain.getXsdate() + "','"
					+ sellMain.getCzy() + "','" + sellMain.getJsr() + "','" + sellMain.getJsfs());
			
			Set<TbSellDetail> sellDetails = sellMain.getTbSellDetails();
			for(Iterator<TbSellDetail> ite = sellDetails.iterator();ite.hasNext();) {
				TbSellDetail sellDetail = ite.next();
				insert("insert into tb_sell_detail values('" + sellDetail.getSellId() + "','"
						+ sellDetail.getSpId() + "','" + sellDetail.getDj() + "','"
						+ sellDetail.getSl() + "')");
				
				//更新库存信息
				Item item = new Item();
				item.setId(sellDetail.getSpId());
				TbSpinfo spinfo = getSpInfo(item);
				if(spinfo.getId() != null && !spinfo.getId().isEmpty()) {
					TbKucun kucun = getKucun(item);
					if(kucun.getId() != null && !kucun.getId().isEmpty()) {
						int sl = kucun.getKcsl() - sellDetail.getSl();
						update("update tb_kucun set kcsl='" + sl + "' where id='" 
								+ kucun.getId() + "'");
					}
				}
			}
			conn.commit();
			conn.setAutoCommit(aotuCommit);
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	//按事物添加销售退货信息
	public static boolean insertXsthInfo(TbXsthMain xsthMain) {
		if(null == xsthMain)
			return false;
		try {
			//不自动commit，由本方法自己控制
			boolean aotuCommit = conn.getAutoCommit();
			conn.setAutoCommit(false);
			
			insert("insert into tb_xsth_main values('" + xsthMain.getXsthId() + "','" 
					+ xsthMain.getPzs() + "','" + xsthMain.getJe() + "','" + xsthMain.getYsjl()
					+ "','" + xsthMain.getKhname() + "','" + xsthMain.getThdate() + "','"
					+ xsthMain.getCzy() + "','" + xsthMain.getJsr() + "','" + xsthMain.getJsfs());
			
			Set<TbXsthDetail> xsthDetails = xsthMain.getTbXsthDetails();
			for(Iterator<TbXsthDetail> ite = xsthDetails.iterator();ite.hasNext();) {
				TbXsthDetail xsthDetail = ite.next();
				insert("insert into tb_xsth_detail values('" + xsthDetail.getId() + "','"
						+ xsthDetail.getSpid() + "','" + xsthDetail.getDj() + "','"
						+ xsthDetail.getSl() + "')");
				
				//更新库存信息
				Item item = new Item();
				item.setId(xsthDetail.getSpid());
				TbSpinfo spinfo = getSpInfo(item);
				if(spinfo.getId() != null && !spinfo.getId().isEmpty()) {
					TbKucun kucun = getKucun(item);
					if(kucun.getId() != null && !kucun.getId().isEmpty()) {
						int sl = kucun.getKcsl() + xsthDetail.getSl();
						update("update tb_kucun set kcsl='" + sl + "' where id='" 
								+ kucun.getId() + "'");
					}
				}
			}
			conn.commit();
			conn.setAutoCommit(aotuCommit);
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	//把表里的所有数据保存为list
	public static List findForList(String sql) {
		List<List> list = new ArrayList<List>();
		ResultSet rs = findForResultSet(sql);
		
		try {
			ResultSetMetaData metaData = rs.getMetaData();
			int cols = metaData.getColumnCount();
			
			while(rs.next()) {
				List<String> row = new ArrayList<String>();
				
				for(int i = 0;i < cols;i++) {
					String str = rs.getString(i);
					if(null != str && !str.isEmpty())
						str.trim();
					
					row.add(str);
				}
				
				list.add(row);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//执行sql语句
	public static ResultSet findForResultSet(String sql) {
		if(null == conn)
			return null;
		ResultSet rs = null;
		
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	//向数据库中添加
	public static boolean insert(String sql) {
		boolean result = false;
		try {
			Statement stmt = conn.createStatement();
			result = stmt.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	//更新数据库
	public static int update(String sql) {
		int result = 0;
		try {
			Statement stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 判断登陆用户和密码
	public static boolean checkLogin(String user,String pwd)
		throws SQLException{
		ResultSet rs = findForResultSet("select * from tb_userlist where name='"
				+ user + "' and pass='" + pwd + "'");
		if(null == rs)
			return false;
		return rs.next();
	}
}