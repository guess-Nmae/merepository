package com.zb.service.impl;

import com.zb.dto.Dto;
import com.zb.feign.DetailFeign;
import com.zb.pojo.Detail;
import com.zb.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:18
 */
@Service
public class DetailServiceImpl implements DetailService {
    @Autowired(required = false)
    private DetailFeign detailFeign;
    @Override
    public Dto findDetailPage(Integer sortId, Integer index, Integer size) {
        Map<String,Object>map=new HashMap<>();
        map.put("index",index);
        map.put("size",size);
        map.put("sortId",sortId);
        System.out.println(map);
        return detailFeign.findDetailPage(map);
    }

    @Override
    public Detail getDetailById(Long id) throws Exception {
        return detailFeign.getDetailById(id);
    }

    @Override
    public Integer updateDetail(Detail detail) throws Exception {
        return detailFeign.updateDetail(detail);
    }
}
