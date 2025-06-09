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


import com.dao.XiazailiebiaoDao;
import com.entity.XiazailiebiaoEntity;
import com.service.XiazailiebiaoService;
import com.entity.vo.XiazailiebiaoVO;
import com.entity.view.XiazailiebiaoView;

@Service("xiazailiebiaoService")
public class XiazailiebiaoServiceImpl extends ServiceImpl<XiazailiebiaoDao, XiazailiebiaoEntity> implements XiazailiebiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiazailiebiaoEntity> page = this.selectPage(
                new Query<XiazailiebiaoEntity>(params).getPage(),
                new EntityWrapper<XiazailiebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiazailiebiaoEntity> wrapper) {
		  Page<XiazailiebiaoView> page =new Query<XiazailiebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiazailiebiaoVO> selectListVO(Wrapper<XiazailiebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiazailiebiaoVO selectVO(Wrapper<XiazailiebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiazailiebiaoView> selectListView(Wrapper<XiazailiebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiazailiebiaoView selectView(Wrapper<XiazailiebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
