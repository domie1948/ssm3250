package com.dao;

import com.entity.XiazailiebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiazailiebiaoVO;
import com.entity.view.XiazailiebiaoView;


/**
 * 下载列表
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiazailiebiaoDao extends BaseMapper<XiazailiebiaoEntity> {
	
	List<XiazailiebiaoVO> selectListVO(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
	
	XiazailiebiaoVO selectVO(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
	
	List<XiazailiebiaoView> selectListView(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);

	List<XiazailiebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
	
	XiazailiebiaoView selectView(@Param("ew") Wrapper<XiazailiebiaoEntity> wrapper);
	
}
