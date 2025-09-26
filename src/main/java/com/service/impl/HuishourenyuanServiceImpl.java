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


import com.dao.HuishourenyuanDao;
import com.entity.HuishourenyuanEntity;
import com.service.HuishourenyuanService;
import com.entity.vo.HuishourenyuanVO;
import com.entity.view.HuishourenyuanView;

@Service("huishourenyuanService")
public class HuishourenyuanServiceImpl extends ServiceImpl<HuishourenyuanDao, HuishourenyuanEntity> implements HuishourenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishourenyuanEntity> page = this.selectPage(
                new Query<HuishourenyuanEntity>(params).getPage(),
                new EntityWrapper<HuishourenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishourenyuanEntity> wrapper) {
		  Page<HuishourenyuanView> page =new Query<HuishourenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishourenyuanVO> selectListVO(Wrapper<HuishourenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishourenyuanVO selectVO(Wrapper<HuishourenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishourenyuanView> selectListView(Wrapper<HuishourenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishourenyuanView selectView(Wrapper<HuishourenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
