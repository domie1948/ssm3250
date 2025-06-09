package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinkuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinkuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinkuView;


/**
 * 视频库
 *
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public interface ShipinkuService extends IService<ShipinkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinkuVO> selectListVO(Wrapper<ShipinkuEntity> wrapper);
   	
   	ShipinkuVO selectVO(@Param("ew") Wrapper<ShipinkuEntity> wrapper);
   	
   	List<ShipinkuView> selectListView(Wrapper<ShipinkuEntity> wrapper);
   	
   	ShipinkuView selectView(@Param("ew") Wrapper<ShipinkuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinkuEntity> wrapper);
   	
}

