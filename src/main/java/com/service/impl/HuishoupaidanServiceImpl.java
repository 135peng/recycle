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


import com.dao.HuishoupaidanDao;
import com.entity.HuishoupaidanEntity;
import com.service.HuishoupaidanService;
import com.entity.vo.HuishoupaidanVO;
import com.entity.view.HuishoupaidanView;

@Service("huishoupaidanService")
public class HuishoupaidanServiceImpl extends ServiceImpl<HuishoupaidanDao, HuishoupaidanEntity> implements HuishoupaidanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishoupaidanEntity> page = this.selectPage(
                new Query<HuishoupaidanEntity>(params).getPage(),
                new EntityWrapper<HuishoupaidanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishoupaidanEntity> wrapper) {
		  Page<HuishoupaidanView> page =new Query<HuishoupaidanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishoupaidanVO> selectListVO(Wrapper<HuishoupaidanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishoupaidanVO selectVO(Wrapper<HuishoupaidanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishoupaidanView> selectListView(Wrapper<HuishoupaidanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishoupaidanView selectView(Wrapper<HuishoupaidanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
