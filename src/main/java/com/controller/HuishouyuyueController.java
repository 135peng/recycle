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

import com.entity.HuishouyuyueEntity;
import com.entity.view.HuishouyuyueView;

import com.service.HuishouyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 回收预约
 * 后端接口
 * @author 
 * @email 
 * @date 2023-11-11 14:36:39
 */
@RestController
@RequestMapping("/huishouyuyue")
public class HuishouyuyueController {
    @Autowired
    private HuishouyuyueService huishouyuyueService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuishouyuyueEntity huishouyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			huishouyuyue.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuishouyuyueEntity> ew = new EntityWrapper<HuishouyuyueEntity>();

		PageUtils page = huishouyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishouyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuishouyuyueEntity huishouyuyue, 
		HttpServletRequest request){
        EntityWrapper<HuishouyuyueEntity> ew = new EntityWrapper<HuishouyuyueEntity>();

		PageUtils page = huishouyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huishouyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuishouyuyueEntity huishouyuyue){
       	EntityWrapper<HuishouyuyueEntity> ew = new EntityWrapper<HuishouyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huishouyuyue, "huishouyuyue")); 
        return R.ok().put("data", huishouyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuishouyuyueEntity huishouyuyue){
        EntityWrapper< HuishouyuyueEntity> ew = new EntityWrapper< HuishouyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huishouyuyue, "huishouyuyue")); 
		HuishouyuyueView huishouyuyueView =  huishouyuyueService.selectView(ew);
		return R.ok("查询回收预约成功").put("data", huishouyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuishouyuyueEntity huishouyuyue = huishouyuyueService.selectById(id);
        return R.ok().put("data", huishouyuyue);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuishouyuyueEntity huishouyuyue = huishouyuyueService.selectById(id);
        return R.ok().put("data", huishouyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuishouyuyueEntity huishouyuyue, HttpServletRequest request){
    	huishouyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huishouyuyue);
        huishouyuyueService.insert(huishouyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
//    @RequestMapping("/add")
//    public R add(@RequestBody HuishouyuyueEntity huishouyuyue, HttpServletRequest request){
//    	huishouyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
//    	//ValidatorUtils.validateEntity(huishouyuyue);
//        huishouyuyueService.insert(huishouyuyue);
//        return R.ok();
//    }
    @RequestMapping("/add")
    public R add(@RequestBody HuishouyuyueEntity huishouyuyue, HttpServletRequest request){
        huishouyuyue.setId(new Date().getTime() + (long)(Math.random() * 1000));

        // 自动生成唯一回收编号，例如 HS20250419153630123
        String uniqueBianhao = "HS" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        huishouyuyue.setHuishoubianhao(uniqueBianhao);

        //ValidatorUtils.validateEntity(huishouyuyue);
        huishouyuyueService.insert(huishouyuyue);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuishouyuyueEntity huishouyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huishouyuyue);
        huishouyuyueService.updateById(huishouyuyue);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<HuishouyuyueEntity> list = new ArrayList<HuishouyuyueEntity>();
        for(Long id : ids) {
            HuishouyuyueEntity huishouyuyue = huishouyuyueService.selectById(id);
            huishouyuyue.setSfsh(sfsh);
            huishouyuyue.setShhf(shhf);
            list.add(huishouyuyue);
        }
        huishouyuyueService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huishouyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
