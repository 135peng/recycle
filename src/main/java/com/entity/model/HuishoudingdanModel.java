package com.entity.model;

import com.entity.HuishoudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回收订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class HuishoudingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣服名称
	 */
	
	private String yifumingcheng;
		
	/**
	 * 回收数量
	 */
	
	private String huishoushuliang;
		
	/**
	 * 回收状态
	 */
	
	private String huishouzhuangtai;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：回收数量
	 */
	 
	public void setHuishoushuliang(String huishoushuliang) {
		this.huishoushuliang = huishoushuliang;
	}
	
	/**
	 * 获取：回收数量
	 */
	public String getHuishoushuliang() {
		return huishoushuliang;
	}
				
	
	/**
	 * 设置：回收状态
	 */
	 
	public void setHuishouzhuangtai(String huishouzhuangtai) {
		this.huishouzhuangtai = huishouzhuangtai;
	}
	
	/**
	 * 获取：回收状态
	 */
	public String getHuishouzhuangtai() {
		return huishouzhuangtai;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
