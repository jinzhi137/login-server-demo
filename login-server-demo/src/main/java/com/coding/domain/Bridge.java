package com.coding.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@DynamicInsert

@Table(name = "bridge_detail")
public class Bridge implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 桥的名字
     */
    @Column(name = "Bridge_name")
    private String Bridge_name;

    /**
     * 桥的位置
     */
    @Column(name = "Bridge_loc")
    private String Bridge_loc;
    /**
     * 桥的具体信息
     */
    @Column(name = "Bridge_inf")
    private String Bridge_inf;
    /**
        * 桥的id
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sensor_detail")
    private Sensordetail sensordetail;

}
