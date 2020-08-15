package com.zb.service.impl;

import com.zb.dto.Page;
import com.zb.mapper.DetailMapper;
import com.zb.pojo.Detail;
import com.zb.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:04
 */
@Service
public class DetailServiceImpl implements DetailService {
    @Autowired(required = false)
    private DetailMapper detailMapper;
    @Override
    public Page<Detail> findDetailPage(Map<String,Object>map)throws Exception {
        Page<Detail> page=new Page<>();
        map.put("index",map.get("index"));
        map.put("size",map.get("size"));
        map.put("sortId",map.get("sortId"));
        Integer index=Integer.parseInt(map.get("index").toString());
        Integer size=Integer.parseInt(map.get("size").toString());
        page.setCurPage(index);
        page.setPageSize(size);
        String index1 = map.get("index").toString();
        Integer a=Integer.parseInt(map.get("index").toString());
        map.put("index",(a-1)*size);
        page.setPageCount(detailMapper.getDetailCountByMap(map));
        page.setRows(detailMapper.getDetailListByMap(map));
        return page;
    }

    @Override
    public Detail getDetailById(Long id) throws Exception {
        return detailMapper.getDetailById(id);
    }

    @Override
    public Integer updateDetail(Detail detail) throws Exception {
        return detailMapper.updateDetail(detail);
    }
}
