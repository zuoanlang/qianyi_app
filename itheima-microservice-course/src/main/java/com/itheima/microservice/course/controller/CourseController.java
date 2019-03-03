package com.itheima.microservice.course.controller;

import com.itheima.microservice.course.pojo.TbCourse;
import com.itheima.microservice.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 课程controller
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService service;

    /**
     * 根据条件查询课程
     *
     * @param course   查询条件
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/searchCourse")
    @ResponseBody
    public List<TbCourse> getCourseSearchResult(@RequestParam(defaultValue = "1") int pageNum,
                                                @RequestParam(defaultValue = "6") int pageSize,
                                                TbCourse course) {
        return service.getCourseSearchResult(pageNum, pageSize, course);
    }
}
