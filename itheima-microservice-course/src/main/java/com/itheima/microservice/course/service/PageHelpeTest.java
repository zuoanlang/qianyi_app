package com.itheima.microservice.course.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.microservice.course.mapper.TbCourseMapper;
import com.itheima.microservice.course.pojo.TbCourse;
import com.itheima.microservice.course.pojo.TbCourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * project:itcast-microservice-user
 * function:
 * author:kangkang
 * date: 2019/2/27
 */
@Service
public class PageHelpeTest {

    @Autowired
    private TbCourseMapper courseMapper;

    public void pageHelperTest(){
        PageHelper.startPage(1,10);
        TbCourseExample courseExample = new TbCourseExample();
        List<TbCourse> courseList = courseMapper.selectByExample(courseExample);

        PageInfo pageInfo = new PageInfo<>(courseList);

        System.out.println(pageInfo.getEndRow());
    }
}
