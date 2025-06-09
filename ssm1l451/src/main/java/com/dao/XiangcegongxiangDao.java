package com.dao;

import com.entity.XiangcegongxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangcegongxiangVO;
import com.entity.view.XiangcegongxiangView;


/**
 * 相册共享
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface XiangcegongxiangDao extends BaseMapper<XiangcegongxiangEntity> {
	
	List<XiangcegongxiangVO> selectListVO(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
	
	XiangcegongxiangVO selectVO(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
	
	List<XiangcegongxiangView> selectListView(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);

	List<XiangcegongxiangView> selectListView(Pagination page,@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
	
	XiangcegongxiangView selectView(@Param("ew") Wrapper<XiangcegongxiangEntity> wrapper);
	
}
