package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangceView;


/**
 * 相册
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiangceService extends IService<XiangceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangceVO> selectListVO(Wrapper<XiangceEntity> wrapper);
   	
   	XiangceVO selectVO(@Param("ew") Wrapper<XiangceEntity> wrapper);
   	
   	List<XiangceView> selectListView(Wrapper<XiangceEntity> wrapper);
   	
   	XiangceView selectView(@Param("ew") Wrapper<XiangceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangceEntity> wrapper);
   	
}

