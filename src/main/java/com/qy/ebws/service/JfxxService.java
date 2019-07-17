package com.qy.ebws.service;

import com.qy.ebws.entity.CxJfxx;
import com.qy.ebws.entity.Jfxx;
import com.qy.ebws.entity.Result;

import java.util.Map;

/**
 * Created by Because of you on 2019/7/16.
 */
public interface JfxxService {
    /**
     * 插入缴费信息
     * @param jfxx
     * @return
     */
    public Result insertJfxx(Jfxx jfxx);

    /**
     * 查询缴费信息
     * @param cxJfxx
     * @return
     */
    public Map<String,Object> queryYjfxx(CxJfxx cxJfxx);
}
