package com.dao;

import com.entity.HuishoupaidanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuishoupaidanVO;
import com.entity.view.HuishoupaidanView;


/**
 * 回收派单
 * 
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface HuishoupaidanDao extends BaseMapper<HuishoupaidanEntity> {
	
	List<HuishoupaidanVO> selectListVO(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
	
	HuishoupaidanVO selectVO(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
	
	List<HuishoupaidanView> selectListView(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);

	List<HuishoupaidanView> selectListView(Pagination page,@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
	
	HuishoupaidanView selectView(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
	

}
