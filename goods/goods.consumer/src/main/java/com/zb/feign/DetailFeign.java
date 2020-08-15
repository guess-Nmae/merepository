package com.zb.feign;

import com.zb.dto.Dto;
import com.zb.pojo.Detail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:15
 */
@FeignClient(value = "goods-provider")
public interface DetailFeign {

    @GetMapping(value = "/detail/findDetailPage")
    public Dto findDetailPage(@RequestParam Map<String,Object>map);

    @GetMapping(value = "/detail/getDetailById/{id}")
    public Detail getDetailById(@PathVariable(value = "id") Long id) throws Exception ;

    @PostMapping(value = "/detail/updateDetail")
    public Integer updateDetail(@RequestBody Detail detail) throws Exception;

}
