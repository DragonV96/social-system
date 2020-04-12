package com.glw.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author : glw
 * @date : 2019/12/26
 * @time : 0:29
 * @Description : id生成器配置
 */
@Data
public class IdConfig {

    /**
     * 数据中心标识（数据中心标识和机器标识的组合必须唯一）
     */
    @Value("${id.dataCenterId}")
    public int dataCenterId;

    /**
     * 机器标识（数据中心标识和机器标识的组合必须唯一）
     */
    @Value("${id.machineId}")
    public int machineId;

}
