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


import com.dao.JiuyixinxiDao;
import com.entity.JiuyixinxiEntity;
import com.service.JiuyixinxiService;
import com.entity.vo.JiuyixinxiVO;
import com.entity.view.JiuyixinxiView;

@Service("jiuyixinxiService")
public class JiuyixinxiServiceImpl extends ServiceImpl<JiuyixinxiDao, JiuyixinxiEntity> implements JiuyixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiuyixinxiEntity> page = this.selectPage(
                new Query<JiuyixinxiEntity>(params).getPage(),
                new EntityWrapper<JiuyixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiuyixinxiEntity> wrapper) {
		  Page<JiuyixinxiView> page =new Query<JiuyixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiuyixinxiVO> selectListVO(Wrapper<JiuyixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiuyixinxiVO selectVO(Wrapper<JiuyixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiuyixinxiView> selectListView(Wrapper<JiuyixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiuyixinxiView selectView(Wrapper<JiuyixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
