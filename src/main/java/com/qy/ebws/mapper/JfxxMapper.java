package com.qy.ebws.mapper;

import com.qy.ebws.entity.CxJfxx;
import com.qy.ebws.entity.Jfxx;
import com.qy.ebws.entity.RetJfxx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Because of you on 2019/7/16.
 */
@Repository
public interface JfxxMapper {
    /**
     * 插入收费登记表
     * @return
     */
    public void insertSfdj(@Param("jfxx") Jfxx jfxx);

    /**
     * 插入收费明细表
     * @param jfxx
     */
    public void insertSfmx(@Param("jfxx") Jfxx jfxx);

    /**
     * 查询已缴费信息
     * @return
     */
    public List<RetJfxx> queryYjfxx(@Param("cxjfxx") CxJfxx cxJfxx);

}
