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
 * 旧衣物分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@TableName("jiuyiwufenlei")
public class JiuyiwufenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiuyiwufenleiEntity() {
		
	}
	
	public JiuyiwufenleiEntity(T t) {
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
	 * 旧衣物分类
	 */
					
	private String jiuyiwufenlei;
	
	/**
	 * 图片
	 */
					
	private String image;
	
	
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
	 * 设置：图片
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：图片
	 */
	public String getImage() {
		return image;
	}

}
