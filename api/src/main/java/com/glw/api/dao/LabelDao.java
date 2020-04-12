package com.glw.api.dao;

import com.glw.api.entity.TLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 16:39
 * @Description : 标签
 */
public interface LabelDao extends JpaRepository<TLabel, Integer>, JpaSpecificationExecutor<TLabel> {
}
