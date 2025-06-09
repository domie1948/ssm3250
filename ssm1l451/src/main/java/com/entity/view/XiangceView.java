package com.entity.view;

import com.entity.XiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 相册
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("xiangce")
public class XiangceView  extends XiangceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangceView(){
	}
 
 	public XiangceView(XiangceEntity xiangceEntity){
 	try {
			BeanUtils.copyProperties(this, xiangceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
