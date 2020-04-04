package me.alphar.sca.account.dao;

import me.alphar.sca.common.entity.SeataAccount;
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
public interface SeataAccountDao {
    int update(SeataAccount seataAccount);
    SeataAccount getById(@Param("id") Long id);
}
