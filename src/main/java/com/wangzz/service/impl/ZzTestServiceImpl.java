package com.wangzz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangzz.entity.ZzTest;
import com.wangzz.service.ZzTestService;
import com.wangzz.mapper.ZzTestMapper;
import org.springframework.stereotype.Service;

@Service
public class ZzTestServiceImpl extends ServiceImpl<ZzTestMapper, ZzTest>
implements ZzTestService{

}
