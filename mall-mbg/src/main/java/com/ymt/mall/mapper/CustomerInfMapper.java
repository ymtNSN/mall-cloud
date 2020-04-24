package com.ymt.mall.mapper;

import com.ymt.mall.model.CustomerInf;
import com.ymt.mall.model.CustomerInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfMapper {
    long countByExample(CustomerInfExample example);

    int deleteByExample(CustomerInfExample example);

    int deleteByPrimaryKey(Integer customerInfId);

    int insert(CustomerInf record);

    int insertSelective(CustomerInf record);

    List<CustomerInf> selectByExample(CustomerInfExample example);

    CustomerInf selectByPrimaryKey(Integer customerInfId);

    int updateByExampleSelective(@Param("record") CustomerInf record, @Param("example") CustomerInfExample example);

    int updateByExample(@Param("record") CustomerInf record, @Param("example") CustomerInfExample example);

    int updateByPrimaryKeySelective(CustomerInf record);

    int updateByPrimaryKey(CustomerInf record);
}