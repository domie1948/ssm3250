package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 下载列表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 14:29:16
 */
@TableName("xiazailiebiao")
public class XiazailiebiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiazailiebiaoEntity() {
		
	}
	
	public XiazailiebiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 歌手名
	 */
					
	private String geshouming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：歌手名
	 */
	public void setGeshouming(String geshouming) {
		this.geshouming = geshouming;
	}
	/**
	 * 获取：歌手名
	 */
	public String getGeshouming() {
		return geshouming;
	}
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
