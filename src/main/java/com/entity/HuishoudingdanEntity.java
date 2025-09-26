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
 * 回收订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@TableName("huishoudingdan")
public class HuishoudingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuishoudingdanEntity() {
		
	}
	
	public HuishoudingdanEntity(T t) {
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
