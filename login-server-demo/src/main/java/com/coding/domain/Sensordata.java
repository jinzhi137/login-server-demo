package com.coding.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

@Table(name = "sensor_data1")
public class Sensordata extends SensordataKey{
    private static final long serialVersionUID = 1L;
    /**
     * 复合主键
     */
    @EmbeddedId
    private SensordataKey id;

    /**
     * 数据
     */
    @ApiModelProperty("数据")
    private String Mornitor_data;

    /**
     * 传感器所在桥的id
     */
    private String Bridge_id;



}
