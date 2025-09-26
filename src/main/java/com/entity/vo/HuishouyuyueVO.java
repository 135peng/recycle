package com.entity.vo;

import com.entity.HuishouyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回收预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public class HuishouyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣服名称
	 */
	
	private String yifumingcheng;
		
	/**
	 * 衣服图片
	 */
	
	private String yifutupian;
		
	/**
	 * 衣服数量
	 */
	
	private Integer yifushuliang;
		
	/**
	 * 回收价格
	 */
	
	private Double huishoujiage;
		
	/**
	 * 赠送积分
	 */
	
	private Double zengsongjifen;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
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
	 * 衣服详情
	 */
	
	private String yifuxiangqing;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 回收状态
	 */
	
	private String huishouzhuangtai;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：回收价格
	 */
	 
	public void setHuishoujiage(Double huishoujiage) {
		this.huishoujiage = huishoujiage;
	}
	
	/**
	 * 获取：回收价格
	 */
	public Double getHuishoujiage() {
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
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
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
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
