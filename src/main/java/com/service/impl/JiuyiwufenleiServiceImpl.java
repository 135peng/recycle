package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiuyiwufenleiDao;
import com.entity.JiuyiwufenleiEntity;
import com.service.JiuyiwufenleiService;
import com.entity.vo.JiuyiwufenleiVO;
import com.entity.view.JiuyiwufenleiView;

@Service("jiuyiwufenleiService")
public class JiuyiwufenleiServiceImpl extends ServiceImpl<JiuyiwufenleiDao, JiuyiwufenleiEntity> implements JiuyiwufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuyiwufenleiEntity> page = this.selectPage(
                new Query<JiuyiwufenleiEntity>(params).getPage(),
                new EntityWrapper<JiuyiwufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuyiwufenleiEntity> wrapper) {
		  Page<JiuyiwufenleiView> page =new Query<JiuyiwufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuyiwufenleiVO> selectListVO(Wrapper<JiuyiwufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuyiwufenleiVO selectVO(Wrapper<JiuyiwufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuyiwufenleiView> selectListView(Wrapper<JiuyiwufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuyiwufenleiView selectView(Wrapper<JiuyiwufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
