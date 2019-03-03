package com.itheima.microservice.information.controller;

import com.itheima.microservice.information.pojo.TbInformation;
import com.itheima.microservice.information.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 资讯controller
 */
@RestController
public class InformationController {

    @Autowired
    private InformationService service;


    /**
     * 查询资讯
     *
     * @param pageNum  页码（默认第一页）
     * @param pageSize 当前页条数（默认每页4条）
     * @param infoType 咨询类型（为空查询全部类型）
     * @return
     */
    public List<TbInformation> getMainPageInfo(@RequestParam(defaultValue = "1") int pageNum,
                                               @RequestParam(defaultValue = "4") int pageSize,
                                               String infoType) {
        return service.getMainPageInfo(pageNum, pageSize, infoType);
    }
}
