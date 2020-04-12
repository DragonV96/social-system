package com.glw.api.controller;

import com.glw.api.entity.TLabel;
import com.glw.api.request.LabelRequest;
import com.glw.api.service.LabelService;
import com.glw.common.enums.ErrorCode;
import com.glw.common.vo.ApiResponse;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 12:30
 * @Description : 标签控制层
 */
@Slf4j
@RestController
@RequestMapping("/label")
@CrossOrigin
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询所有标签
     * @return
     */
    @GetMapping
    public ApiResponse findAll() {
        List<TLabel> labelList = labelService.findAll();
        log.info(" 查询所有标签成功！ labelList = {}", labelList);
        return ApiResponse.success(labelList);
    }

    /**
     * 根据id查询标签
     * @param labelId
     * @return
     */
    @GetMapping("/{labelId}")
    public ApiResponse findById(@PathVariable("labelId") Integer labelId) {
        TLabel label = labelService.findById(labelId);
        log.info(" 根据id查询标签成功！ label = {}", label);
        return ApiResponse.success(label);
    }

    /**
     * 新增标签
     * @param request
     * @return
     */
    @PostMapping
    public ApiResponse save(@RequestBody LabelRequest request) {
        log.info(" request = {}", request);
        labelService.save(request);
        log.info(" 新增标签成功！ request = {}", request);
        return ApiResponse.success();
    }

    /**
     * 根据id更新标签
     * @param labelId
     * @param request
     * @return
     */
    @PutMapping("/{labelId}")
    public ApiResponse update(@PathVariable("labelId") Integer labelId, @RequestBody LabelRequest request) {
        labelService.update(labelId, request);
        log.info(" 根据id更新标签成功！ labelId = {} request = {}", labelId, request);
        return ApiResponse.success();
    }

    /**
     * 根据id删除标签
     * @param labelId
     * @return
     */
    @DeleteMapping("/{labelId}")
    public ApiResponse deleteById(@PathVariable("labelId") Integer labelId) {
        labelService.delete(labelId);
        log.info(" 根据id删除标签成功！ labelId = {}", labelId);
        return ApiResponse.success();
    }
}
