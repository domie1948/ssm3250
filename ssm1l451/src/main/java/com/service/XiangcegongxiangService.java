package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangcegongxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangcegongxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangcegongxiangView;


/**
 * 相册共享
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiangcegongxiangService extends IService<XiangcegongxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangcegongxiangVO> selectListVO(Wrapper<XiangcegongxiangEntity> wrapper);
   	
   	XiangcegongxiangVO selectVO(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
   	
   	List<XiangcegongxiangView> selectListView(Wrapper<XiangcegongxiangEntity> wrapper);
   	
   	XiangcegongxiangView selectView(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangcegongxiangEntity> wrapper);
   	
}

