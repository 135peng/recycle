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


import com.dao.HuishoudingdanDao;
import com.entity.HuishoudingdanEntity;
import com.service.HuishoudingdanService;
import com.entity.vo.HuishoudingdanVO;
import com.entity.view.HuishoudingdanView;

@Service("huishoudingdanService")
public class HuishoudingdanServiceImpl extends ServiceImpl<HuishoudingdanDao, HuishoudingdanEntity> implements HuishoudingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishoudingdanEntity> page = this.selectPage(
                new Query<HuishoudingdanEntity>(params).getPage(),
                new EntityWrapper<HuishoudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishoudingdanEntity> wrapper) {
		  Page<HuishoudingdanView> page =new Query<HuishoudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishoudingdanVO> selectListVO(Wrapper<HuishoudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishoudingdanVO selectVO(Wrapper<HuishoudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishoudingdanView> selectListView(Wrapper<HuishoudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishoudingdanView selectView(Wrapper<HuishoudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
