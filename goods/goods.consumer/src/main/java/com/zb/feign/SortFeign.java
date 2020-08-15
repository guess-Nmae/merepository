package com.zb.feign;

import com.zb.pojo.Sort;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 10:09
 */
@FeignClient(value = "goods-provider")
public interface SortFeign {
    @GetMapping(value = "/sort/getSortList")
    public List<Sort> getSortList()throws Exception;
}
