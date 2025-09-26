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
 * 回收派单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@TableName("huishoupaidan")
public class HuishoupaidanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuishoupaidanEntity() {
		
	}
	
	public HuishoupaidanEntity(T t) {
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
