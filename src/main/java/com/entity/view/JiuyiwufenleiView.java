package com.entity.view;

import com.entity.JiuyiwufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 旧衣物分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@TableName("jiuyiwufenlei")
public class JiuyiwufenleiView  extends JiuyiwufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuyiwufenleiView(){
	}
 
 	public JiuyiwufenleiView(JiuyiwufenleiEntity jiuyiwufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jiuyiwufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
