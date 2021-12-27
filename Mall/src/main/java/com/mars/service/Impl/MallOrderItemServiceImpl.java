package com.mars.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.MallOrderItem;
import com.mars.mapper.MallOrderItemMapper;
import com.mars.service.MallOrderItemService;
import org.springframework.stereotype.Service;

@Service
public class MallOrderItemServiceImpl extends ServiceImpl<MallOrderItemMapper, MallOrderItem> implements MallOrderItemService {

}

