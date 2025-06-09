package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbokeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbokeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbokeView;


/**
 * 博客评论表
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface DiscussbokeService extends IService<DiscussbokeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbokeVO> selectListVO(Wrapper<DiscussbokeEntity> wrapper);
   	
   	DiscussbokeVO selectVO(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
   	
   	List<DiscussbokeView> selectListView(Wrapper<DiscussbokeEntity> wrapper);
   	
   	DiscussbokeView selectView(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbokeEntity> wrapper);
   	
}

