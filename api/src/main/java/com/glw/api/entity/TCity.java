package com.glw.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 16:28
 * @Description : 城市表
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_city")
public class TCity implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 城市名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 是否热门
     */
    @Column(name = "hot")
    private String hot;
}
