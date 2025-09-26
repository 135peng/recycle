package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishoudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishoudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishoudingdanView;


/**
 * 回收订单
 *
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface HuishoudingdanService extends IService<HuishoudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishoudingdanVO> selectListVO(Wrapper<HuishoudingdanEntity> wrapper);
   	
   	HuishoudingdanVO selectVO(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
   	
   	List<HuishoudingdanView> selectListView(Wrapper<HuishoudingdanEntity> wrapper);
   	
   	HuishoudingdanView selectView(@Param("ew") Wrapper<HuishoudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishoudingdanEntity> wrapper);
   	

}

