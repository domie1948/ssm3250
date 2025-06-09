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


import com.dao.DiscussbokeDao;
import com.entity.DiscussbokeEntity;
import com.service.DiscussbokeService;
import com.entity.vo.DiscussbokeVO;
import com.entity.view.DiscussbokeView;

@Service("discussbokeService")
public class DiscussbokeServiceImpl extends ServiceImpl<DiscussbokeDao, DiscussbokeEntity> implements DiscussbokeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbokeEntity> page = this.selectPage(
                new Query<DiscussbokeEntity>(params).getPage(),
                new EntityWrapper<DiscussbokeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbokeEntity> wrapper) {
		  Page<DiscussbokeView> page =new Query<DiscussbokeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbokeVO> selectListVO(Wrapper<DiscussbokeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbokeVO selectVO(Wrapper<DiscussbokeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbokeView> selectListView(Wrapper<DiscussbokeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbokeView selectView(Wrapper<DiscussbokeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
