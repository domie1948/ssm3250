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


import com.dao.XiangcegongxiangDao;
import com.entity.XiangcegongxiangEntity;
import com.service.XiangcegongxiangService;
import com.entity.vo.XiangcegongxiangVO;
import com.entity.view.XiangcegongxiangView;

@Service("xiangcegongxiangService")
public class XiangcegongxiangServiceImpl extends ServiceImpl<XiangcegongxiangDao, XiangcegongxiangEntity> implements XiangcegongxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangcegongxiangEntity> page = this.selectPage(
                new Query<XiangcegongxiangEntity>(params).getPage(),
                new EntityWrapper<XiangcegongxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangcegongxiangEntity> wrapper) {
		  Page<XiangcegongxiangView> page =new Query<XiangcegongxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangcegongxiangVO> selectListVO(Wrapper<XiangcegongxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangcegongxiangVO selectVO(Wrapper<XiangcegongxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangcegongxiangView> selectListView(Wrapper<XiangcegongxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangcegongxiangView selectView(Wrapper<XiangcegongxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
