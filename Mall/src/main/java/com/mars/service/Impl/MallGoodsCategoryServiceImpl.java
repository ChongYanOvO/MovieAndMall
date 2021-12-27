package com.mars.service.Impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.MallCarousel;
import com.mars.entity.MallGoodsCategory;
import com.mars.mapper.MallCarouselMapper;
import com.mars.mapper.MallGoodsCategoryMapper;
import com.mars.service.MallGoodsCategoryService;
import org.springframework.stereotype.Service;


@Service
public class MallGoodsCategoryServiceImpl extends ServiceImpl<MallGoodsCategoryMapper, MallGoodsCategory> implements MallGoodsCategoryService {

}

