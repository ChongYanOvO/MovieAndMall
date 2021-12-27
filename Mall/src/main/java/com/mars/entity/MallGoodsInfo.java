package com.mars.entity;

import lombok.Data;

import java.util.Date;


@Data
public class MallGoodsInfo {
    //商品表主键id
    private Object goodsId;
    //商品名
    private String goodsName;
    //商品简介
    private String goodsIntro;
    //关联分类id
    private Long goodsCategoryId;
    //商品主图
    private String goodsCoverImg;
    //商品轮播图
    private String goodsCarousel;
    //商品详情
    private String goodsDetailContent;
    //商品价格
    private Integer originalPrice;
    //商品实际售价
    private Integer sellingPrice;
    //商品库存数量
    private Object stockNum;
    //商品标签
    private String tag;
    //商品上架状态 1-下架 0-上架
    private Integer goodsSellStatus;
    //添加者主键id
    private Integer createUser;
    //商品添加时间
    private Date createTime;
    //修改者主键id
    private Integer updateUser;
    //商品修改时间
    private Date updateTime;

}

