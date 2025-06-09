package com.entity.view;

import com.entity.XiangcegongxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 相册共享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("xiangcegongxiang")
public class XiangcegongxiangView  extends XiangcegongxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangcegongxiangView(){
	}
 
 	public XiangcegongxiangView(XiangcegongxiangEntity xiangcegongxiangEntity){
 	try {
			BeanUtils.copyProperties(this, xiangcegongxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
