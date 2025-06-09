package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BokeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BokeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BokeView;


/**
 * 博客
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface BokeService extends IService<BokeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BokeVO> selectListVO(Wrapper<BokeEntity> wrapper);
   	
   	BokeVO selectVO(@Param("ew") Wrapper<BokeEntity> wrapper);
   	
   	List<BokeView> selectListView(Wrapper<BokeEntity> wrapper);
   	
   	BokeView selectView(@Param("ew") Wrapper<BokeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BokeEntity> wrapper);
   	
}

