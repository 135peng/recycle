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

import com.entity.JiuyiwufenleiEntity;
import com.entity.view.JiuyiwufenleiView;

import com.service.JiuyiwufenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 旧衣物分类
 * 后端接口
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@RestController
@RequestMapping("/jiuyiwufenlei")
public class JiuyiwufenleiController {
    @Autowired
    private JiuyiwufenleiService jiuyiwufenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiuyiwufenleiEntity jiuyiwufenlei,
		HttpServletRequest request){
        EntityWrapper<JiuyiwufenleiEntity> ew = new EntityWrapper<JiuyiwufenleiEntity>();

		PageUtils page = jiuyiwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyiwufenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiuyiwufenleiEntity jiuyiwufenlei, 
		HttpServletRequest request){
        EntityWrapper<JiuyiwufenleiEntity> ew = new EntityWrapper<JiuyiwufenleiEntity>();

		PageUtils page = jiuyiwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiuyiwufenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiuyiwufenleiEntity jiuyiwufenlei){
       	EntityWrapper<JiuyiwufenleiEntity> ew = new EntityWrapper<JiuyiwufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiuyiwufenlei, "jiuyiwufenlei")); 
        return R.ok().put("data", jiuyiwufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiuyiwufenleiEntity jiuyiwufenlei){
        EntityWrapper< JiuyiwufenleiEntity> ew = new EntityWrapper< JiuyiwufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiuyiwufenlei, "jiuyiwufenlei")); 
		JiuyiwufenleiView jiuyiwufenleiView =  jiuyiwufenleiService.selectView(ew);
		return R.ok("查询旧衣物分类成功").put("data", jiuyiwufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiuyiwufenleiEntity jiuyiwufenlei = jiuyiwufenleiService.selectById(id);
        return R.ok().put("data", jiuyiwufenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiuyiwufenleiEntity jiuyiwufenlei = jiuyiwufenleiService.selectById(id);
        return R.ok().put("data", jiuyiwufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiuyiwufenleiEntity jiuyiwufenlei, HttpServletRequest request){
    	jiuyiwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyiwufenlei);
        jiuyiwufenleiService.insert(jiuyiwufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiuyiwufenleiEntity jiuyiwufenlei, HttpServletRequest request){
    	jiuyiwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiuyiwufenlei);
        jiuyiwufenleiService.insert(jiuyiwufenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiuyiwufenleiEntity jiuyiwufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiuyiwufenlei);
        jiuyiwufenleiService.updateById(jiuyiwufenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiuyiwufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
