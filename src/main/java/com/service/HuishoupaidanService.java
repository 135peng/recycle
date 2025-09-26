package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishoupaidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishoupaidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishoupaidanView;


/**
 * 回收派单
 *
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface HuishoupaidanService extends IService<HuishoupaidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishoupaidanVO> selectListVO(Wrapper<HuishoupaidanEntity> wrapper);
   	
   	HuishoupaidanVO selectVO(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
   	
   	List<HuishoupaidanView> selectListView(Wrapper<HuishoupaidanEntity> wrapper);
   	
   	HuishoupaidanView selectView(@Param("ew") Wrapper<HuishoupaidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishoupaidanEntity> wrapper);
   	

}

