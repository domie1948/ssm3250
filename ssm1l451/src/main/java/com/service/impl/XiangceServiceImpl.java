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


import com.dao.XiangceDao;
import com.entity.XiangceEntity;
import com.service.XiangceService;
import com.entity.vo.XiangceVO;
import com.entity.view.XiangceView;

@Service("xiangceService")
public class XiangceServiceImpl extends ServiceImpl<XiangceDao, XiangceEntity> implements XiangceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangceEntity> page = this.selectPage(
                new Query<XiangceEntity>(params).getPage(),
                new EntityWrapper<XiangceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangceEntity> wrapper) {
		  Page<XiangceView> page =new Query<XiangceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangceVO> selectListVO(Wrapper<XiangceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangceVO selectVO(Wrapper<XiangceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangceView> selectListView(Wrapper<XiangceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangceView selectView(Wrapper<XiangceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
