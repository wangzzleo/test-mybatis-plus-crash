package com.wangzz.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wangzz.entity.ZzTest;
import com.wangzz.service.ZzTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ZzTestService zzTestService;

    @GetMapping("/test")
    public String testMybatis() {
        ZzTest byId = zzTestService.getById(1);
        return String.valueOf(byId);
    }

    @GetMapping("/testerr")
    public String testErrMybatis() {
        IPage<ZzTest> page = new Page<>(1, 10);
        IPage<ZzTest> pageRet = zzTestService.page(page);
        return String.valueOf(pageRet);
    }

}
