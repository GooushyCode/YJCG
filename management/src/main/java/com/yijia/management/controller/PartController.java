package com.yijia.management.controller;
import com.yijia.management.common.ServerResponse;
import com.yijia.management.service.PartsService;
import com.yijia.management.vo.Parts;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/parts")
public class PartController {

    @Resource
    private PartsService partsService;
    //查询所有配件
    @RequestMapping("/findAll")
    public ServerResponse<List<Parts>> getAll(){
        ServerResponse<List<Parts>> response = partsService.findAll();
        return response;
    }
}
