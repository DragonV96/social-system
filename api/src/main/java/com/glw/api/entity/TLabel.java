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
 * @time : 16:36
 * @Description : 标签表
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_label")
public class TLabel implements Serializable {
    /**
     * 标签ID
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 标签名称
     */
    @Column(name = "labelname")
    private String labelname;

    /**
     * 状态
     */
    @Column(name = "state")
    private String state;

    /**
     * 使用数量
     */
    @Column(name = "count")
    private Long count;

    /**
     * 是否推荐
     */
    @Column(name = "recommend")
    private String recommend;

    /**
     * 粉丝数
     */
    @Column(name = "fans")
    private Long fans;
}
