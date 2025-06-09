package com.entity.model;

import com.entity.XiazailiebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 下载列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
public class XiazailiebiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌曲
	 */
	
	private String gequ;
		
	/**
	 * 文件大小
	 */
	
	private String wenjiandaxiao;
		
	/**
	 * 歌曲时长
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gequshizhang;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：歌曲
	 */
	 
	public void setGequ(String gequ) {
		this.gequ = gequ;
	}
	
	/**
	 * 获取：歌曲
	 */
	public String getGequ() {
		return gequ;
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
	 * 设置：歌曲时长
	 */
	 
	public void setGequshizhang(Date gequshizhang) {
		this.gequshizhang = gequshizhang;
	}
	
	/**
	 * 获取：歌曲时长
	 */
	public Date getGequshizhang() {
		return gequshizhang;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
