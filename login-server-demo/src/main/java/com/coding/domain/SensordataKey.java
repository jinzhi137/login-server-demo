package com.coding.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class SensordataKey implements Serializable {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Mornitor_time")
        @ApiModelProperty("Sensor_time")
        private String Mornitor_time;

        @Column(name = "Mornitor_id")
        @ApiModelProperty("Sensor_id")
        private String Mornitor_id;

}
