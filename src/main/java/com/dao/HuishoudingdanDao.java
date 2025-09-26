package com.dao;

import com.entity.HuishoudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuishoudingdanVO;
import com.entity.view.HuishoudingdanView;


/**
 * 回收订单
 * 
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface HuishoudingdanDao extends BaseMapper<HuishoudingdanEntity> {
	
	List<HuishoudingdanVO> selectListVO(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
	
	HuishoudingdanVO selectVO(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
	
	List<HuishoudingdanView> selectListView(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);

	List<HuishoudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
	
	HuishoudingdanView selectView(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
	

}
