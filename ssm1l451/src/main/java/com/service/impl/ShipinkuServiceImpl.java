package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShipinkuDao;
import com.entity.ShipinkuEntity;
import com.service.ShipinkuService;
import com.entity.vo.ShipinkuVO;
import com.entity.view.ShipinkuView;

@Service("shipinkuService")
public class ShipinkuServiceImpl extends ServiceImpl<ShipinkuDao, ShipinkuEntity> implements ShipinkuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinkuEntity> page = this.selectPage(
                new Query<ShipinkuEntity>(params).getPage(),
                new EntityWrapper<ShipinkuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinkuEntity> wrapper) {
		  Page<ShipinkuView> page =new Query<ShipinkuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinkuVO> selectListVO(Wrapper<ShipinkuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinkuVO selectVO(Wrapper<ShipinkuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinkuView> selectListView(Wrapper<ShipinkuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinkuView selectView(Wrapper<ShipinkuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
