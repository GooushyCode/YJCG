package com.yijia.management.service;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.mapper.PartsMapper;
import com.yijia.management.vo.Parts;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class PartsService {

    @Resource
    private PartsMapper partsMapper;

    // 查询所有配件
    public ServerResponse<List<Parts>> findAll(){
        List<Parts> all = partsMapper.findAll();
        return ServerResponse.createBySuccess("查询成功！",all);
    }

}
