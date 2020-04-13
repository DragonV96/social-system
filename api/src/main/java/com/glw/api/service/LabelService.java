package com.glw.api.service;

import com.glw.api.entity.TLabel;
import com.glw.api.request.LabelRequest;
import com.glw.api.request.LabelSearchRequest;

import java.util.List;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 16:41
 * @Description : 标签业务层接口
 */
public interface LabelService {

    /**
     * 查询所有标签
     * @return
     */
    List<TLabel> findAll();

    /**
     * 根据id查询标签
     * @return
     */
    TLabel findById(Integer id);

    /**
     * 新增标签
     * @return
     */
    void save(LabelRequest request);

    /**
     * 根据id更新标签
     * @return
     */
    void update(Integer labelId, LabelRequest request);

    /**
     * 根据id删除标签
     * @return
     */
    void delete(Integer id);

    /**
     * 搜索标签
     * @param request
     * @return
     */
    List<TLabel> findSearch(LabelSearchRequest request);
}
