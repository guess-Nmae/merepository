package com.zb.service;

import com.zb.dto.Page;
import com.zb.pojo.Detail;
import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:00
 */
public interface DetailService {

    Page<Detail> findDetailPage(Map<String,Object>map) throws Exception;

    public Detail getDetailById(Long id)throws Exception;

    public Integer updateDetail(Detail detail)throws Exception;
}
