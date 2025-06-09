package com.dao;

import com.entity.ShipinkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinkuVO;
import com.entity.view.ShipinkuView;


/**
 * 视频库
 * 
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface ShipinkuDao extends BaseMapper<ShipinkuEntity> {
	
	List<ShipinkuVO> selectListVO(@Param("ew") Wrapper<ShipinkuEntity> wrapper);
	
	ShipinkuVO selectVO(@Param("ew") Wrapper<ShipinkuEntity> wrapper);
	
	List<ShipinkuView> selectListView(@Param("ew") Wrapper<ShipinkuEntity> wrapper);

	List<ShipinkuView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinkuEntity> wrapper);
	
	ShipinkuView selectView(@Param("ew") Wrapper<ShipinkuEntity> wrapper);
	
}
