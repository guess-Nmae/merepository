package com.zb.service;

import com.zb.dto.Dto;
import com.zb.pojo.Detail;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:17
 */
public interface DetailService {

    public Dto findDetailPage(Integer sortId, Integer index, Integer size);

    public Detail getDetailById(Long id)throws Exception;

    public Integer updateDetail(Detail detail)throws Exception;
}
