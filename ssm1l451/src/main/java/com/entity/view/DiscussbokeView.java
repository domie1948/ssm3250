package com.entity.view;

import com.entity.DiscussbokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博客评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("discussboke")
public class DiscussbokeView  extends DiscussbokeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbokeView(){
	}
 
 	public DiscussbokeView(DiscussbokeEntity discussbokeEntity){
 	try {
			BeanUtils.copyProperties(this, discussbokeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
