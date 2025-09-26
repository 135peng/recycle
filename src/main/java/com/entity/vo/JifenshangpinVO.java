package com.entity.vo;

import com.entity.JifenshangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 积分商品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class JifenshangpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商品介绍
	 */
	
	private String shangpinjieshao;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 兑换积分
	 */
	
	private Double duihuanjifen;
		
	/**
	 * 兑换规则
	 */
	
	private String duihuanguize;
				
	
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
	 * 设置：商品介绍
	 */
	 
	public void setShangpinjieshao(String shangpinjieshao) {
		this.shangpinjieshao = shangpinjieshao;
	}
	
	/**
	 * 获取：商品介绍
	 */
	public String getShangpinjieshao() {
		return shangpinjieshao;
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
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
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
	 * 设置：兑换规则
	 */
	 
	public void setDuihuanguize(String duihuanguize) {
		this.duihuanguize = duihuanguize;
	}
	
	/**
	 * 获取：兑换规则
	 */
	public String getDuihuanguize() {
		return duihuanguize;
	}
			
}
