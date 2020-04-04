package me.alphar.sca.storage.dao;

import me.alphar.sca.common.entity.SeataStorage;
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
public interface SeataStorageDao {
    int update(SeataStorage seataStorage);

    SeataStorage getById(@Param("id") Long id);

    SeataStorage getByProductId(Long productId);
}
