package com.glw.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 16:35
 * @Description : 城市标签关联表
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_city_label")
public class TCityLabel implements Serializable {
    /**
     * 城市id
     */
    @Id
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 标签id
     */
    @Id
    @Column(name = "label_id")
    private Integer labelId;
}
