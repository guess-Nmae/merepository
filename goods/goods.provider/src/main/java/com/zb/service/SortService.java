package com.zb.service;

import com.zb.mapper.SortMapper;
import com.zb.pojo.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 10:06
 */
@RestController
@RequestMapping(value = "/sort")
public class SortService {
    @Autowired(required = false)
    private SortMapper sortMapper;
    @GetMapping(value = "/getSortList")
    public List<Sort> getSortList()throws Exception{
        return sortMapper.getSortListByMap();
    }
}
