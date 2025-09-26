package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyiwufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyiwufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyiwufenleiView;


/**
 * 旧衣物分类
 *
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface JiuyiwufenleiService extends IService<JiuyiwufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyiwufenleiVO> selectListVO(Wrapper<JiuyiwufenleiEntity> wrapper);
   	
   	JiuyiwufenleiVO selectVO(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
   	
   	List<JiuyiwufenleiView> selectListView(Wrapper<JiuyiwufenleiEntity> wrapper);
   	
   	JiuyiwufenleiView selectView(@Param("ew") Wrapper<JiuyiwufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyiwufenleiEntity> wrapper);
   	

}

