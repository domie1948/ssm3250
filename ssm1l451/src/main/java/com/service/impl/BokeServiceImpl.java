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


import com.dao.BokeDao;
import com.entity.BokeEntity;
import com.service.BokeService;
import com.entity.vo.BokeVO;
import com.entity.view.BokeView;

@Service("bokeService")
public class BokeServiceImpl extends ServiceImpl<BokeDao, BokeEntity> implements BokeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BokeEntity> page = this.selectPage(
                new Query<BokeEntity>(params).getPage(),
                new EntityWrapper<BokeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BokeEntity> wrapper) {
		  Page<BokeView> page =new Query<BokeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BokeVO> selectListVO(Wrapper<BokeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BokeVO selectVO(Wrapper<BokeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BokeView> selectListView(Wrapper<BokeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BokeView selectView(Wrapper<BokeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
