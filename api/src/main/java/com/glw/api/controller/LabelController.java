package com.glw.api.controller;

import com.glw.api.entity.TLabel;
import com.glw.api.request.LabelRequest;
import com.glw.api.request.LabelSearchRequest;
import com.glw.api.service.LabelService;
import com.glw.common.enums.ErrorCode;
import com.glw.common.vo.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "标签")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @ApiOperation(value = "查询所有标签", notes = "查询所有标签")
    @GetMapping
    public ApiResponse<List<TLabel>> findAll() {
        List<TLabel> labelList = labelService.findAll();
        log.info(" 查询所有标签成功！ labelList = {}", labelList);
        return ApiResponse.success(labelList);
    }

    @ApiOperation(value = "根据id查询标签", notes = "根据id查询标签")
    @GetMapping("/{labelId}")
    public ApiResponse<TLabel> findById(@PathVariable("labelId") Integer labelId) {
        TLabel label = labelService.findById(labelId);
        log.info(" 根据id查询标签成功！ label = {}", label);
        return ApiResponse.success(label);
    }

    @ApiOperation(value = "新增标签", notes = "新增标签")
    @PostMapping
    public ApiResponse save(@RequestBody LabelRequest request) {
        log.info(" request = {}", request);
        labelService.save(request);
        log.info(" 新增标签成功！ request = {}", request);
        return ApiResponse.success();
    }

    @ApiOperation(value = "根据id更新标签", notes = "根据id更新标签")
    @PutMapping("/{labelId}")
    public ApiResponse update(@PathVariable("labelId") Integer labelId, @RequestBody LabelRequest request) {
        labelService.update(labelId, request);
        log.info(" 根据id更新标签成功！ labelId = {} request = {}", labelId, request);
        return ApiResponse.success();
    }

    @ApiOperation(value = "根据id删除标签", notes = "根据id删除标签")
    @DeleteMapping("/{labelId}")
    public ApiResponse deleteById(@PathVariable("labelId") Integer labelId) {
        labelService.delete(labelId);
        log.info(" 根据id删除标签成功！ labelId = {}", labelId);
        return ApiResponse.success();
    }

    @ApiOperation(value = "搜索标签", notes = "搜索标签")
    @PostMapping("/search")
    public ApiResponse findSearch(@RequestBody LabelSearchRequest request) {
        List<TLabel> labelList = labelService.findSearch(request);
        log.info(" 搜索标签成功！ labelList = {}", labelList);
        return ApiResponse.success(labelList);
    }
}
