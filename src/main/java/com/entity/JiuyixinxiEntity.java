package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 旧衣信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@TableName("jiuyixinxi")
public class JiuyixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuyixinxiEntity() {
		
	}
	
	public JiuyixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 回收编号
	 */
					
	private String huishoubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：回收编号
	 */
	public void setHuishoubianhao(String huishoubianhao) {
		this.huishoubianhao = huishoubianhao;
	}
	/**
	 * 获取：回收编号
	 */
	public String getHuishoubianhao() {
		return huishoubianhao;
	}
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
