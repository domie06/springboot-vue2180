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
 * 汽车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-26 08:38:25
 */
@TableName("qichexinxi")
public class QichexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QichexinxiEntity() {
		
	}
	
	public QichexinxiEntity(T t) {
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
	 * 汽车名称
	 */
					
	private String qichemingcheng;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 颜色
	 */
					
	private String yanse;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 座位
	 */
					
	private String zuowei;
	
	/**
	 * 换挡方式
	 */
					
	private String huandangfangshi;
	
	/**
	 * 汽车排量
	 */
					
	private String qichepailiang;
	
	/**
	 * 上市年份
	 */
					
	private String shangshinianfen;
	
	/**
	 * 上牌时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangpaishijian;
	
	/**
	 * 行驶里程
	 */
					
	private String xingshilicheng;
	
	/**
	 * 汽车详情
	 */
					
	private String qichexiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：汽车名称
	 */
	public void setQichemingcheng(String qichemingcheng) {
		this.qichemingcheng = qichemingcheng;
	}
	/**
	 * 获取：汽车名称
	 */
	public String getQichemingcheng() {
		return qichemingcheng;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：颜色
	 */
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
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
	 * 设置：座位
	 */
	public void setZuowei(String zuowei) {
		this.zuowei = zuowei;
	}
	/**
	 * 获取：座位
	 */
	public String getZuowei() {
		return zuowei;
	}
	/**
	 * 设置：换挡方式
	 */
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
	/**
	 * 设置：汽车排量
	 */
	public void setQichepailiang(String qichepailiang) {
		this.qichepailiang = qichepailiang;
	}
	/**
	 * 获取：汽车排量
	 */
	public String getQichepailiang() {
		return qichepailiang;
	}
	/**
	 * 设置：上市年份
	 */
	public void setShangshinianfen(String shangshinianfen) {
		this.shangshinianfen = shangshinianfen;
	}
	/**
	 * 获取：上市年份
	 */
	public String getShangshinianfen() {
		return shangshinianfen;
	}
	/**
	 * 设置：上牌时间
	 */
	public void setShangpaishijian(Date shangpaishijian) {
		this.shangpaishijian = shangpaishijian;
	}
	/**
	 * 获取：上牌时间
	 */
	public Date getShangpaishijian() {
		return shangpaishijian;
	}
	/**
	 * 设置：行驶里程
	 */
	public void setXingshilicheng(String xingshilicheng) {
		this.xingshilicheng = xingshilicheng;
	}
	/**
	 * 获取：行驶里程
	 */
	public String getXingshilicheng() {
		return xingshilicheng;
	}
	/**
	 * 设置：汽车详情
	 */
	public void setQichexiangqing(String qichexiangqing) {
		this.qichexiangqing = qichexiangqing;
	}
	/**
	 * 获取：汽车详情
	 */
	public String getQichexiangqing() {
		return qichexiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
