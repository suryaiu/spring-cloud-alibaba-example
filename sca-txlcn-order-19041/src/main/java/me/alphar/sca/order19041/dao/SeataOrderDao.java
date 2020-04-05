package me.alphar.sca.order19041.dao;

import me.alphar.sca.common.entity.SeataOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author suryai
 * @version V1.0
 * 2020-4-1 12:19
 * modifyTime           author              description
 * -------------------------------------------------------------------
 */
@Mapper
public interface SeataOrderDao {
    int save(SeataOrder seataOrder);
    SeataOrder getById(@Param("id") Long id);
}
