package com.itheima.microservice.information.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.itheima.microservice.information.mapper.TbInformationMapper;
import com.itheima.microservice.information.pojo.TbInformation;
import com.itheima.microservice.information.pojo.TbInformationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资讯service
 */
@Service
public class InformationService {

    @Autowired
    private TbInformationMapper mapper;

    /**
     * 查询资讯
     *
     * @param pageNum  页码（默认第一页）
     * @param pageSize 当前页条数（默认每页4条）
     * @param infoType 咨询类型
     * @return
     */
    public List<TbInformation> getMainPageInfo(int pageNum, int pageSize, String infoType) {
        PageHelper.startPage(pageNum, pageSize);
        TbInformationExample example = new TbInformationExample();
        example.createCriteria()
                // // 有效标志为1（有效）
                .andEffectFlagEqualTo("1")
                //删除标志为0（未删除）
                .andDeleteFlagEqualTo("0");
        // 资讯类型（八字，风水，奇门）
        if (StringUtil.isNotEmpty(infoType)) {
            example.getOredCriteria().get(0).andInfoTypeEqualTo(infoType);
        }
        // 按发布时间降序
        example.setOrderByClause("published_time desc");
        List<TbInformation> tbInformations = mapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(tbInformations);
        return tbInformations;
    }
}
