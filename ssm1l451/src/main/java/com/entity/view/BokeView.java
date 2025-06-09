package com.entity.view;

import com.entity.BokeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 博客
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("boke")
public class BokeView  extends BokeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BokeView(){
	}
 
 	public BokeView(BokeEntity bokeEntity){
 	try {
			BeanUtils.copyProperties(this, bokeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
