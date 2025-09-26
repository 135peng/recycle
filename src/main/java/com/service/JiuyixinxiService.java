package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyixinxiView;


/**
 * 旧衣信息
 *
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
public interface JiuyixinxiService extends IService<JiuyixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyixinxiVO> selectListVO(Wrapper<JiuyixinxiEntity> wrapper);
   	
   	JiuyixinxiVO selectVO(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
   	
   	List<JiuyixinxiView> selectListView(Wrapper<JiuyixinxiEntity> wrapper);
   	
   	JiuyixinxiView selectView(@Param("ew") Wrapper<JiuyixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyixinxiEntity> wrapper);
   	

}

