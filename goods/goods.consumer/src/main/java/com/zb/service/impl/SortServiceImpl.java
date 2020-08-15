package com.zb.service.impl;

import com.zb.feign.SortFeign;
import com.zb.pojo.Sort;
import com.zb.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 10:09
 */
@Service
public class SortServiceImpl implements SortService {
    @Autowired(required = false)
    private SortFeign sortFeign;
    @Override
    public List<Sort> getSortList() throws Exception {
        return sortFeign.getSortList();
    }
}
