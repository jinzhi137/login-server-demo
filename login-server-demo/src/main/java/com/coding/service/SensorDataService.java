package com.coding.service;

import com.coding.domain.Sensordata;
import com.coding.domain.SensordataKey;
import com.coding.domain.User;
import com.coding.mapper.SensorDataMapper;
import com.coding.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.guanweiming.common.utils.HttpKit;
import com.guanweiming.common.utils.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Slf4j
@AllArgsConstructor
@Service
public class SensorDataService {

    private final SensorDataMapper sensordataMapper;


    public Result<List<Sensordata>> getsensor(String Monitor_id) {
        Sensordata record = new Sensordata();
        SensordataKey sensordataKey= new SensordataKey();
        sensordataKey.
        record.setId()
                setMornitor_id(Monitor_id);
        List<Sensordata> list = sensordataMapper.select(record);
        return Result.createBySuccess(list);
    }





}
