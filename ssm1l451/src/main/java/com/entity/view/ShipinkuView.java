package com.entity.view;

import com.entity.ShipinkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("shipinku")
public class ShipinkuView  extends ShipinkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipinkuView(){
	}
 
 	public ShipinkuView(ShipinkuEntity shipinkuEntity){
 	try {
			BeanUtils.copyProperties(this, shipinkuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
