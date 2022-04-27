package com.coding.controller;

import com.coding.common.Const;
import com.coding.common.PageParam;
import com.coding.domain.Sensordata;
import com.coding.domain.User;
import com.coding.mapper.SensorDataMapper;
import com.coding.mapper.UserMapper;
import com.coding.service.SensorDataService;
import com.coding.service.UserService;
import com.github.pagehelper.PageHelper;
import com.guanweiming.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Api(tags = "传感器接口")
@AllArgsConstructor
@RequestMapping(Const.API + "sensordata")
@RestController
public class SensorDataController {

    private final SensorDataService sensordataService;
    private final SensorDataMapper sensordataMapper;

    @ApiOperation("查询对应传感器数据")
    @GetMapping("sensorselect")
    public Result<List<Sensordata>> sensorselect(@RequestParam String Sensor_id) {
        return sensordataService.getsensor(Sensor_id);
    }


}
