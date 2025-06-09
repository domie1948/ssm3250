package com.controller;

import java.text.SimpleDateFormat;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BokeEntity;
import com.entity.view.BokeView;

import com.service.BokeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 博客
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@RestController
@RequestMapping("/boke")
public class BokeController {
    @Autowired
    private BokeService bokeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BokeEntity boke, 
		HttpServletRequest request){

        EntityWrapper<BokeEntity> ew = new EntityWrapper<BokeEntity>();
		PageUtils page = bokeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, boke), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BokeEntity boke, 
		HttpServletRequest request){
        EntityWrapper<BokeEntity> ew = new EntityWrapper<BokeEntity>();
		PageUtils page = bokeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, boke), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BokeEntity boke){
       	EntityWrapper<BokeEntity> ew = new EntityWrapper<BokeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( boke, "boke")); 
        return R.ok().put("data", bokeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BokeEntity boke){
        EntityWrapper< BokeEntity> ew = new EntityWrapper< BokeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( boke, "boke")); 
		BokeView bokeView =  bokeService.selectView(ew);
		return R.ok("查询博客成功").put("data", bokeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BokeEntity boke = bokeService.selectById(id);
        return R.ok().put("data", boke);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BokeEntity boke = bokeService.selectById(id);
        return R.ok().put("data", boke);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        BokeEntity boke = bokeService.selectById(id);
        if(type.equals("1")) {
        	boke.setThumbsupnum(boke.getThumbsupnum()+1);
        } else {
        	boke.setCrazilynum(boke.getCrazilynum()+1);
        }
        bokeService.updateById(boke);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BokeEntity boke, HttpServletRequest request){
    	boke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(boke);

        bokeService.insert(boke);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BokeEntity boke, HttpServletRequest request){
    	boke.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(boke);

        bokeService.insert(boke);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BokeEntity boke, HttpServletRequest request){
        //ValidatorUtils.validateEntity(boke);
        bokeService.updateById(boke);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bokeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BokeEntity> wrapper = new EntityWrapper<BokeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = bokeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
