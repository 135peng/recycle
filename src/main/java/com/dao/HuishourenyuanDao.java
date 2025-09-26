package com.dao;

import com.entity.HuishourenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuishourenyuanVO;
import com.entity.view.HuishourenyuanView;


/**
 * 回收人员
 * 
 * @author 
 * @email 
 * @date 2023-11-11 14:36:38
 */
public interface HuishourenyuanDao extends BaseMapper<HuishourenyuanEntity> {
	
	List<HuishourenyuanVO> selectListVO(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
	
	HuishourenyuanVO selectVO(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
	
	List<HuishourenyuanView> selectListView(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);

	List<HuishourenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
	
	HuishourenyuanView selectView(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
	

}
