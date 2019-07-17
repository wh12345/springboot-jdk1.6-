package com.qy.ebws.serviceimpl;

import com.qy.ebws.entity.CxJfxx;
import com.qy.ebws.entity.Jfxx;
import com.qy.ebws.entity.Result;
import com.qy.ebws.entity.RetJfxx;
import com.qy.ebws.mapper.JfxxMapper;
import com.qy.ebws.service.JfxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Because of you on 2019/7/16.
 */
@Service
public class JfxxServiceImpl implements JfxxService {
    @Autowired
    private JfxxMapper jfxxMapper;
    @Override
    public Result insertJfxx(Jfxx jfxx) {
        Result result = new Result();
        try{
            jfxxMapper.insertSfdj(jfxx);
            String[] sfxms = jfxx.getSfxm().split(",");
            String[] sfjes =jfxx.getSfje().split(",");
            for(int i=0;i<sfxms.length;i++){
                jfxx.setSfxm(sfxms[i]);
                jfxx.setSfje(sfjes[i]);
                jfxxMapper.insertSfmx(jfxx);
            }
            result.setFhjg(1);
            result.setFhxx("正常");
        }catch (Exception e) {
            e.printStackTrace();
            result.setFhjg(2);
            result.setFhxx(e.getMessage());
        }
        return result;
    }

    @Override
    public Map<String, Object> queryYjfxx(CxJfxx cxJfxx) {
        Map<String,Object> retMap = new HashMap<String, Object>();
        Result result = new Result();
        try{
            List<RetJfxx> retJfxxs = jfxxMapper.queryYjfxx(cxJfxx);
            if(retJfxxs==null) {
                result.setFhjg(2);
                result.setFhxx("数据库异常");
                retMap.put("result",result);
            }else if (retJfxxs.size()>0){
                result.setFhjg(1);
                result.setFhxx("正常");
                retMap.put("result",result);
                retMap.put("datalist",retJfxxs);
            }else{
                result.setFhjg(0);
                result.setFhxx("无记录");
                retMap.put("result",result);
            }
        }catch (Exception e) {
            e.printStackTrace();
            result.setFhjg(2);
            result.setFhxx(e.getMessage());
            retMap.put("result",result);
        }
        return retMap;
    }
}
