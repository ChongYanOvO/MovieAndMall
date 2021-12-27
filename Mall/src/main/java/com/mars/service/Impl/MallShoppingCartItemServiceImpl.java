package com.mars.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.MallShoppingCartItem;
import com.mars.mapper.MallShoppingCartItemMapper;
import com.mars.service.MallShoppingCartItemService;
import org.springframework.stereotype.Service;

@Service
public class MallShoppingCartItemServiceImpl extends ServiceImpl<MallShoppingCartItemMapper,MallShoppingCartItem> implements MallShoppingCartItemService {

}

