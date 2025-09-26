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

import com.entity.JiuyixinxiEntity;
import com.entity.view.JiuyixinxiView;

import com.service.JiuyixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 旧衣信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@RestController
@RequestMapping("/jiuyixinxi")
public class JiuyixinxiController {
    @Autowired
    private JiuyixinxiService jiuyixinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiuyixinxiEntity jiuyixinxi,
		HttpServletRequest request){
        EntityWrapper<JiuyixinxiEntity> ew = new EntityWrapper<JiuyixinxiEntity>();

		PageUtils page = jiuyixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiuyixinxiEntity jiuyixinxi, 
		HttpServletRequest request){
        EntityWrapper<JiuyixinxiEntity> ew = new EntityWrapper<JiuyixinxiEntity>();

		PageUtils page = jiuyixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiuyixinxiEntity jiuyixinxi){
       	EntityWrapper<JiuyixinxiEntity> ew = new EntityWrapper<JiuyixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiuyixinxi, "jiuyixinxi")); 
        return R.ok().put("data", jiuyixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiuyixinxiEntity jiuyixinxi){
        EntityWrapper< JiuyixinxiEntity> ew = new EntityWrapper< JiuyixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiuyixinxi, "jiuyixinxi")); 
		JiuyixinxiView jiuyixinxiView =  jiuyixinxiService.selectView(ew);
		return R.ok("查询旧衣信息成功").put("data", jiuyixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiuyixinxiEntity jiuyixinxi = jiuyixinxiService.selectById(id);
        return R.ok().put("data", jiuyixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiuyixinxiEntity jiuyixinxi = jiuyixinxiService.selectById(id);
        return R.ok().put("data", jiuyixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiuyixinxiEntity jiuyixinxi, HttpServletRequest request){
    	jiuyixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyixinxi);
        jiuyixinxiService.insert(jiuyixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiuyixinxiEntity jiuyixinxi, HttpServletRequest request){
    	jiuyixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyixinxi);
        jiuyixinxiService.insert(jiuyixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiuyixinxiEntity jiuyixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuyixinxi);
        jiuyixinxiService.updateById(jiuyixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiuyixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
