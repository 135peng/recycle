package com.entity.model;

import com.entity.JifenduihuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 积分兑换
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class JifenduihuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 兑换积分
	 */
	
	private Double duihuanjifen;
		
	/**
	 * 合计积分
	 */
	
	private String jifen;
		
	/**
	 * 兑换时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date duihuanshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 积分
	 */
	
	private Double yonghujifen;
		
	/**
	 * 积分
	 */
	
	private Integer jf;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：兑换积分
	 */
	 
	public void setDuihuanjifen(Double duihuanjifen) {
		this.duihuanjifen = duihuanjifen;
	}
	
	/**
	 * 获取：兑换积分
	 */
	public Double getDuihuanjifen() {
		return duihuanjifen;
	}
				
	
	/**
	 * 设置：合计积分
	 */
	 
	public void setJifen(String jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：合计积分
	 */
	public String getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：兑换时间
	 */
	 
	public void setDuihuanshijian(Date duihuanshijian) {
		this.duihuanshijian = duihuanshijian;
	}
	
	/**
	 * 获取：兑换时间
	 */
	public Date getDuihuanshijian() {
		return duihuanshijian;
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
	 * 设置：积分
	 */
	 
	public void setYonghujifen(Double yonghujifen) {
		this.yonghujifen = yonghujifen;
	}
	
	/**
	 * 获取：积分
	 */
	public Double getYonghujifen() {
		return yonghujifen;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJf(Integer jf) {
		this.jf = jf;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJf() {
		return jf;
	}
			
}
