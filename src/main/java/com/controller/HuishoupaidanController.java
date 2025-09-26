package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuishoupaidanEntity;
import com.entity.view.HuishoupaidanView;

import com.service.HuishoupaidanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 回收派单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@RestController
@RequestMapping("/huishoupaidan")
public class HuishoupaidanController {
    @Autowired
    private HuishoupaidanService huishoupaidanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuishoupaidanEntity huishoupaidan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			huishoupaidan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("huishourenyuan")) {
			huishoupaidan.setHuishougonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuishoupaidanEntity> ew = new EntityWrapper<HuishoupaidanEntity>();

		PageUtils page = huishoupaidanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishoupaidan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuishoupaidanEntity huishoupaidan, 
		HttpServletRequest request){
        EntityWrapper<HuishoupaidanEntity> ew = new EntityWrapper<HuishoupaidanEntity>();

		PageUtils page = huishoupaidanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishoupaidan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuishoupaidanEntity huishoupaidan){
       	EntityWrapper<HuishoupaidanEntity> ew = new EntityWrapper<HuishoupaidanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huishoupaidan, "huishoupaidan")); 
        return R.ok().put("data", huishoupaidanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuishoupaidanEntity huishoupaidan){
        EntityWrapper< HuishoupaidanEntity> ew = new EntityWrapper< HuishoupaidanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huishoupaidan, "huishoupaidan")); 
		HuishoupaidanView huishoupaidanView =  huishoupaidanService.selectView(ew);
		return R.ok("查询回收派单成功").put("data", huishoupaidanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuishoupaidanEntity huishoupaidan = huishoupaidanService.selectById(id);
        return R.ok().put("data", huishoupaidan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuishoupaidanEntity huishoupaidan = huishoupaidanService.selectById(id);
        return R.ok().put("data", huishoupaidan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuishoupaidanEntity huishoupaidan, HttpServletRequest request){
    	huishoupaidan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huishoupaidan);
        huishoupaidanService.insert(huishoupaidan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuishoupaidanEntity huishoupaidan, HttpServletRequest request){
    	huishoupaidan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huishoupaidan);
        huishoupaidanService.insert(huishoupaidan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuishoupaidanEntity huishoupaidan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huishoupaidan);
        huishoupaidanService.updateById(huishoupaidan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huishoupaidanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
