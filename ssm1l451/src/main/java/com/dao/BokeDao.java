package com.dao;

import com.entity.BokeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BokeVO;
import com.entity.view.BokeView;


/**
 * 博客
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface BokeDao extends BaseMapper<BokeEntity> {
	
	List<BokeVO> selectListVO(@Param("ew") Wrapper<BokeEntity> wrapper);
	
	BokeVO selectVO(@Param("ew") Wrapper<BokeEntity> wrapper);
	
	List<BokeView> selectListView(@Param("ew") Wrapper<BokeEntity> wrapper);

	List<BokeView> selectListView(Pagination page,@Param("ew") Wrapper<BokeEntity> wrapper);
	
	BokeView selectView(@Param("ew") Wrapper<BokeEntity> wrapper);
	
}
