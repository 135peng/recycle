package com.entity.vo;

import com.entity.HuishoupaidanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回收派单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class HuishoupaidanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣服名称
	 */
	
	private String yifumingcheng;
		
	/**
	 * 衣服数量
	 */
	
	private String yifushuliang;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangmenshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 回收工号
	 */
	
	private String huishougonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
				
	
	/**
	 * 设置：衣服名称
	 */
	 
	public void setYifumingcheng(String yifumingcheng) {
		this.yifumingcheng = yifumingcheng;
	}
	
	/**
	 * 获取：衣服名称
	 */
	public String getYifumingcheng() {
		return yifumingcheng;
	}
				
	
	/**
	 * 设置：衣服数量
	 */
	 
	public void setYifushuliang(String yifushuliang) {
		this.yifushuliang = yifushuliang;
	}
	
	/**
	 * 获取：衣服数量
	 */
	public String getYifushuliang() {
		return yifushuliang;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setShangmenshijian(Date shangmenshijian) {
		this.shangmenshijian = shangmenshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getShangmenshijian() {
		return shangmenshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：回收工号
	 */
	 
	public void setHuishougonghao(String huishougonghao) {
		this.huishougonghao = huishougonghao;
	}
	
	/**
	 * 获取：回收工号
	 */
	public String getHuishougonghao() {
		return huishougonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
			
}
