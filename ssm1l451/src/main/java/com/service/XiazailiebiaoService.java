package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiazailiebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiazailiebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiazailiebiaoView;


/**
 * 下载列表
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiazailiebiaoService extends IService<XiazailiebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiazailiebiaoVO> selectListVO(Wrapper<XiazailiebiaoEntity> wrapper);
   	
   	XiazailiebiaoVO selectVO(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
   	
   	List<XiazailiebiaoView> selectListView(Wrapper<XiazailiebiaoEntity> wrapper);
   	
   	XiazailiebiaoView selectView(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiazailiebiaoEntity> wrapper);
   	
}

