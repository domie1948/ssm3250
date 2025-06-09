package com.dao;

import com.entity.DiscussbokeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbokeVO;
import com.entity.view.DiscussbokeView;


/**
 * 博客评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface DiscussbokeDao extends BaseMapper<DiscussbokeEntity> {
	
	List<DiscussbokeVO> selectListVO(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
	
	DiscussbokeVO selectVO(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
	
	List<DiscussbokeView> selectListView(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);

	List<DiscussbokeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
	
	DiscussbokeView selectView(@Param("ew") Wrapper<DiscussbokeEntity> wrapper);
	
}
