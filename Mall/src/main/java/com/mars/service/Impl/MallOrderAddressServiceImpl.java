package com.mars.service.Impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mars.entity.MallOrderAddress;
import com.mars.mapper.MallOrderAddressMapper;
import com.mars.service.MallOrderAddressService;
import org.springframework.stereotype.Service;

@Service
public class MallOrderAddressServiceImpl extends ServiceImpl<MallOrderAddressMapper,MallOrderAddress> implements MallOrderAddressService {

}

