package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishourenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishourenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishourenyuanView;


/**
 * 回收人员
 *
 * @author 
 * @email 
 * @date 2023-11-11 14:36:38
 */
public interface HuishourenyuanService extends IService<HuishourenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishourenyuanVO> selectListVO(Wrapper<HuishourenyuanEntity> wrapper);
   	
   	HuishourenyuanVO selectVO(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
   	
   	List<HuishourenyuanView> selectListView(Wrapper<HuishourenyuanEntity> wrapper);
   	
   	HuishourenyuanView selectView(@Param("ew") Wrapper<HuishourenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishourenyuanEntity> wrapper);
   	

}

