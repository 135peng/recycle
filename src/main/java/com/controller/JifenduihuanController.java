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

import com.entity.JifenduihuanEntity;
import com.entity.view.JifenduihuanView;

import com.service.JifenduihuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 积分兑换
 * 后端接口
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@RestController
@RequestMapping("/jifenduihuan")
public class JifenduihuanController {
    @Autowired
    private JifenduihuanService jifenduihuanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JifenduihuanEntity jifenduihuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jifenduihuan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JifenduihuanEntity> ew = new EntityWrapper<JifenduihuanEntity>();

		PageUtils page = jifenduihuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jifenduihuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JifenduihuanEntity jifenduihuan, 
		HttpServletRequest request){
        EntityWrapper<JifenduihuanEntity> ew = new EntityWrapper<JifenduihuanEntity>();

		PageUtils page = jifenduihuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jifenduihuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JifenduihuanEntity jifenduihuan){
       	EntityWrapper<JifenduihuanEntity> ew = new EntityWrapper<JifenduihuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jifenduihuan, "jifenduihuan")); 
        return R.ok().put("data", jifenduihuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JifenduihuanEntity jifenduihuan){
        EntityWrapper< JifenduihuanEntity> ew = new EntityWrapper< JifenduihuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jifenduihuan, "jifenduihuan")); 
		JifenduihuanView jifenduihuanView =  jifenduihuanService.selectView(ew);
		return R.ok("查询积分兑换成功").put("data", jifenduihuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JifenduihuanEntity jifenduihuan = jifenduihuanService.selectById(id);
        return R.ok().put("data", jifenduihuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JifenduihuanEntity jifenduihuan = jifenduihuanService.selectById(id);
        return R.ok().put("data", jifenduihuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JifenduihuanEntity jifenduihuan, HttpServletRequest request){
    	jifenduihuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jifenduihuan);
        jifenduihuanService.insert(jifenduihuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JifenduihuanEntity jifenduihuan, HttpServletRequest request){
    	jifenduihuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jifenduihuan);
        jifenduihuanService.insert(jifenduihuan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JifenduihuanEntity jifenduihuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jifenduihuan);
        jifenduihuanService.updateById(jifenduihuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jifenduihuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
