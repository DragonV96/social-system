package com.glw.api.service.impl;

import com.glw.api.dao.LabelDao;
import com.glw.api.entity.TLabel;
import com.glw.api.request.LabelRequest;
import com.glw.api.service.LabelService;
import com.glw.common.enums.ErrorCode;
import com.glw.common.exception.GlobalException;
import com.glw.common.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 16:42
 * @Description : 标签业务层实现
 */
@Slf4j
@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Override
    public List<TLabel> findAll() {
        return labelDao.findAll();
    }

    @Override
    public TLabel findById(Integer id) {
        return labelDao.findById(id).get();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(LabelRequest request) {
        if (StringUtils.isEmpty(request)) {
            throw new GlobalException(ErrorCode.PARAM_EMPTY);
        }

        TLabel entity = new TLabel();
        BeanUtils.copyProperties(request, entity);
        log.info(" entity = {}", entity);
        labelDao.save(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(Integer labelId, LabelRequest request) {
        if (StringUtils.isEmpty(labelId) || StringUtils.isEmpty(request)) {
            throw new GlobalException(ErrorCode.PARAM_EMPTY);
        }

        TLabel label = this.findById(labelId);
        if (StringUtils.isEmpty(label)) {
            throw new GlobalException(ErrorCode.NOT_EXIST);
        }

        TLabel entity = new TLabel();
        BeanUtils.copyProperties(request, entity);
        labelDao.save(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Integer id) {
        labelDao.deleteById(id);
    }
}
