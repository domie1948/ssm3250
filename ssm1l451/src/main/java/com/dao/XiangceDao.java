package com.dao;

import com.entity.XiangceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangceVO;
import com.entity.view.XiangceView;


/**
 * 相册
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiangceDao extends BaseMapper<XiangceEntity> {
	
	List<XiangceVO> selectListVO(@Param("ew") Wrapper<XiangceEntity> wrapper);
	
	XiangceVO selectVO(@Param("ew") Wrapper<XiangceEntity> wrapper);
	
	List<XiangceView> selectListView(@Param("ew") Wrapper<XiangceEntity> wrapper);

	List<XiangceView> selectListView(Pagination page,@Param("ew") Wrapper<XiangceEntity> wrapper);
	
	XiangceView selectView(@Param("ew") Wrapper<XiangceEntity> wrapper);
	
}
