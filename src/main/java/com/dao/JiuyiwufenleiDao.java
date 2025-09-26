package com.dao;

import com.entity.JiuyiwufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuyiwufenleiVO;
import com.entity.view.JiuyiwufenleiView;


/**
 * 旧衣物分类
 * 
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface JiuyiwufenleiDao extends BaseMapper<JiuyiwufenleiEntity> {
	
	List<JiuyiwufenleiVO> selectListVO(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
	
	JiuyiwufenleiVO selectVO(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
	
	List<JiuyiwufenleiView> selectListView(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);

	List<JiuyiwufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
	
	JiuyiwufenleiView selectView(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
	

}
