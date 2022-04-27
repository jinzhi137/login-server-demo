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

@Table(name = "Sensor_detail")
public class Sensordetail{
    private static final long serialVersionUID = 1L;
    /**
     * 传感器的名字
     */
    private String Sensor_name;
    /**
     * 传感器的id
     */
    @Id
    private String Sensor_id;
    /**
     * 传感器类型
     */
    private String Sensor_type;
    /**
     * 传感器所在的桥的id
     */
    private String Bridge_id;
    /**
     * 传感器的状态
     */
    private String Sensor_state;
}
