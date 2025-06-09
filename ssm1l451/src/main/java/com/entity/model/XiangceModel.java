package com.entity.model;

import com.entity.XiangceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 相册
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public class XiangceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 尺寸
	 */
	
	private String chicun;
		
	/**
	 * 文件大小
	 */
	
	private String wenjiandaxiao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：尺寸
	 */
	 
	public void setChicun(String chicun) {
		this.chicun = chicun;
	}
	
	/**
	 * 获取：尺寸
	 */
	public String getChicun() {
		return chicun;
	}
				
	
	/**
	 * 设置：文件大小
	 */
	 
	public void setWenjiandaxiao(String wenjiandaxiao) {
		this.wenjiandaxiao = wenjiandaxiao;
	}
	
	/**
	 * 获取：文件大小
	 */
	public String getWenjiandaxiao() {
		return wenjiandaxiao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
