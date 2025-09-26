package com.dao;

import com.entity.JiuyixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiuyixinxiVO;
import com.entity.view.JiuyixinxiView;


/**
 * 旧衣信息
 * 
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface JiuyixinxiDao extends BaseMapper<JiuyixinxiEntity> {
	
	List<JiuyixinxiVO> selectListVO(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
	
	JiuyixinxiVO selectVO(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
	
	List<JiuyixinxiView> selectListView(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);

	List<JiuyixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
	
	JiuyixinxiView selectView(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
	

}
