package com.zb.controller;

import com.zb.dto.Dto;
import com.zb.dto.DtoUtil;
import com.zb.dto.Page;
import com.zb.pojo.Detail;
import com.zb.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/3 - 上午 9:08
 */
@RestController
@RequestMapping(value = "/detail")
public class DetailController {
    @Autowired
    private DetailService detailService;
    @GetMapping(value = "/findDetailPage")
    public Dto findDetailPage(@RequestParam Map<String,Object>map){
        try {
            Page<Detail> detailPage = detailService.findDetailPage(map);
            return DtoUtil.returnSuccess("信息",detailPage);
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("信息输入错误","1001");
        }
    }

    @GetMapping(value = "/getDetailById/{id}")
    public Detail getDetailById(@PathVariable(value = "id") Long id) throws Exception {
        return detailService.getDetailById(id);
    }

    @PostMapping(value = "/updateDetail")
    public Integer updateDetail(@RequestBody Detail detail) throws Exception {
        return detailService.updateDetail(detail);
    }

}
