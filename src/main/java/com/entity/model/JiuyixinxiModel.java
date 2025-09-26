package com.entity.model;

import com.entity.JiuyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 旧衣信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class JiuyixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣服名称
	 */
	
	private String yifumingcheng;
		
	/**
	 * 旧衣物分类
	 */
	
	private String jiuyiwufenlei;
		
	/**
	 * 衣服图片
	 */
	
	private String yifutupian;
		
	/**
	 * 衣服数量
	 */
	
	private Integer yifushuliang;
		
	/**
	 * 衣服详情
	 */
	
	private String yifuxiangqing;
		
	/**
	 * 回收价格
	 */
	
	private Integer huishoujiage;
		
	/**
	 * 赠送积分
	 */
	
	private Double zengsongjifen;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 回收需求详情
	 */
	
	private String huishouxuqiuxiangqing;
		
	/**
	 * 回收截止时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huishoujiezhishijian;
				
	
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
	 * 设置：旧衣物分类
	 */
	 
	public void setJiuyiwufenlei(String jiuyiwufenlei) {
		this.jiuyiwufenlei = jiuyiwufenlei;
	}
	
	/**
	 * 获取：旧衣物分类
	 */
	public String getJiuyiwufenlei() {
		return jiuyiwufenlei;
	}
				
	
	/**
	 * 设置：衣服图片
	 */
	 
	public void setYifutupian(String yifutupian) {
		this.yifutupian = yifutupian;
	}
	
	/**
	 * 获取：衣服图片
	 */
	public String getYifutupian() {
		return yifutupian;
	}
				
	
	/**
	 * 设置：衣服数量
	 */
	 
	public void setYifushuliang(Integer yifushuliang) {
		this.yifushuliang = yifushuliang;
	}
	
	/**
	 * 获取：衣服数量
	 */
	public Integer getYifushuliang() {
		return yifushuliang;
	}
				
	
	/**
	 * 设置：衣服详情
	 */
	 
	public void setYifuxiangqing(String yifuxiangqing) {
		this.yifuxiangqing = yifuxiangqing;
	}
	
	/**
	 * 获取：衣服详情
	 */
	public String getYifuxiangqing() {
		return yifuxiangqing;
	}
				
	
	/**
	 * 设置：回收价格
	 */
	 
	public void setHuishoujiage(Integer huishoujiage) {
		this.huishoujiage = huishoujiage;
	}
	
	/**
	 * 获取：回收价格
	 */
	public Integer getHuishoujiage() {
		return huishoujiage;
	}
				
	
	/**
	 * 设置：赠送积分
	 */
	 
	public void setZengsongjifen(Double zengsongjifen) {
		this.zengsongjifen = zengsongjifen;
	}
	
	/**
	 * 获取：赠送积分
	 */
	public Double getZengsongjifen() {
		return zengsongjifen;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：回收需求详情
	 */
	 
	public void setHuishouxuqiuxiangqing(String huishouxuqiuxiangqing) {
		this.huishouxuqiuxiangqing = huishouxuqiuxiangqing;
	}
	
	/**
	 * 获取：回收需求详情
	 */
	public String getHuishouxuqiuxiangqing() {
		return huishouxuqiuxiangqing;
	}
				
	
	/**
	 * 设置：回收截止时间
	 */
	 
	public void setHuishoujiezhishijian(Date huishoujiezhishijian) {
		this.huishoujiezhishijian = huishoujiezhishijian;
	}
	
	/**
	 * 获取：回收截止时间
	 */
	public Date getHuishoujiezhishijian() {
		return huishoujiezhishijian;
	}
			
}
