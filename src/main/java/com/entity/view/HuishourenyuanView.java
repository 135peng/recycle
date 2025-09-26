package com.entity.view;

import com.entity.HuishourenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 回收人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:38
 */
@TableName("huishourenyuan")
public class HuishourenyuanView  extends HuishourenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuishourenyuanView(){
	}
 
 	public HuishourenyuanView(HuishourenyuanEntity huishourenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, huishourenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
