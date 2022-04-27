package com.coding.mapper;

import com.coding.domain.Sensordata;
import com.coding.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface SensorDataMapper extends Mapper<Sensordata>, SelectByIdListMapper<Sensordata,Long> {
}
