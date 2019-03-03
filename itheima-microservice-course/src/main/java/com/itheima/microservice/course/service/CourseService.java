package com.itheima.microservice.course.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.itheima.microservice.course.mapper.TbCourseMapper;
import com.itheima.microservice.course.pojo.TbCourse;
import com.itheima.microservice.course.pojo.TbCourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程service
 */
@Service
public class CourseService {

    @Autowired
    private TbCourseMapper tbCourseMapper;

    public List<TbCourse> getCourseSearchResult(int pageNum, int pageSize, TbCourse course) {
        PageHelper.startPage(pageNum, pageSize);
        TbCourseExample example = new TbCourseExample();
        // 有效标志为1（有效），删除标志为0（未删除）
        example.createCriteria().andEffectFlagEqualTo("1").andDeleteFlagEqualTo("0");
        // 课程名称
        if (StringUtil.isNotEmpty(course.getCourseName())) {
            example.getOredCriteria().get(0).andCourseNameLike("%" + course.getCourseName() + "%");
        }
        // 课程类别
        if (StringUtil.isNotEmpty(course.getCourseType())) {
            example.getOredCriteria().get(0).andCourseTypeEqualTo(course.getCourseType());
        }
        // 课程级别
        if (StringUtil.isNotEmpty(course.getCourseLevel())) {
            example.getOredCriteria().get(0).andCourseLevelEqualTo(course.getCourseLevel());
        }
        // 课程是否线上
        if (StringUtil.isNotEmpty(course.getCourseIsOnline())) {
            example.getOredCriteria().get(0).andCourseIsOnlineEqualTo(course.getCourseIsOnline());
        }
        List<TbCourse> tbCourses = tbCourseMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<>(tbCourses);
        return tbCourses;
    }
}
