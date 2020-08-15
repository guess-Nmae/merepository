package com.zb.controller;

import com.zb.pojo.Sort;
import com.zb.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 10:10
 */
@RestController
@RequestMapping(value = "/sort")
public class SortController {
    @Autowired
    private SortService sortService;
    @GetMapping(value = "/getSortList")
    public List<Sort> getSortList()throws Exception{
        return sortService.getSortList();
    }
}
