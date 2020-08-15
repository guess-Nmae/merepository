package com.zb.controller;

import com.zb.dto.Dto;
import com.zb.pojo.Detail;
import com.zb.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:20
 */
@RestController
@RequestMapping(value = "/detail")
public class DetailController {
    @Autowired
    private DetailService detailService;
    @GetMapping(value = "/findDetailPage")
    public Dto findDetailPage(Integer sortId,
                              @RequestParam(defaultValue = "1")Integer index,
                                  @RequestParam(defaultValue = "2")Integer size){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return detailService.findDetailPage(sortId,index,size);
    }
    @GetMapping(value = "/getDetailById/{id}")
    public Detail getDetailById(@PathVariable(value = "id") Long id) throws Exception {
        return detailService.getDetailById(id);
    }

    @PostMapping(value = "/updateDetail")
    public Integer updateDetail(Detail detail) throws Exception {
        System.out.println(detail);
        return detailService.updateDetail(detail);
    }
}
