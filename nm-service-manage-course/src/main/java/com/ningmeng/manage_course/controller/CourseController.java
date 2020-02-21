package com.ningmeng.manage_course.controller;

import com.ningmeng.api.courseapi.CourseControllerApi;
import com.ningmeng.framework.domain.course.CourseBase;
import com.ningmeng.framework.domain.course.CourseMarket;
import com.ningmeng.framework.domain.course.Teachplan;
import com.ningmeng.framework.domain.course.ext.CategoryNode;
import com.ningmeng.framework.domain.course.ext.TeachplanNode;
import com.ningmeng.framework.domain.system.SysDictionary;
import com.ningmeng.framework.model.response.QueryResponseResult;
import com.ningmeng.framework.model.response.ResponseResult;
import com.ningmeng.manage_course.service.CategoryService;
import com.ningmeng.manage_course.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController implements CourseControllerApi {

    @Autowired
    private CourseService courseService;

    @Autowired
    private CategoryService categoryService;

    //获取课程基础信息
    @GetMapping("/course/getCourseBaseById/{courseId}")
    @Override
    public CourseBase getCourseBaseById(@PathVariable("courseId") String courseId) throws RuntimeException {
        return courseService.getCourseBaseById(courseId);
    }
    //更新课程基础信息
    @PostMapping("/course/updateCourseBase")
    @Override
    public ResponseResult updateCourseBase(@RequestBody CourseBase courseBase) {
        return courseService.updateCourseBase(courseBase);
    }

    //获取课程营销信息
    @GetMapping("/course/getCourseMarketById/{courseId}")
    @Override
    public CourseMarket getCourseMarketById(String courseId) {
        return courseService.getCourseMarketById(courseId);
    }

    //更新课程营销信息
    @PostMapping("/course/updateCourseMarket")
    @Override
    public ResponseResult updateCourseMarket(@RequestBody CourseMarket courseMarket) {
        return courseService.updateCourseMarket(courseMarket);
    }

    //查询课程计划
    @GetMapping("/teachplan/findTeachplanList/{courseId}")
    @Override
    public TeachplanNode findTeachplanList(@PathVariable("courseId") String courseId) {
        return courseService.findTeachplanList(courseId);
    }

    //添加课程计划
    @PostMapping("/teachplan/addTeachplan")
    @Override
    public ResponseResult addTeachplan(@RequestBody Teachplan teachplan) {
        return courseService.addTeachplan(teachplan);
    }

    //分页查询课程列表
    @GetMapping("/course/findCourseList/{page}/{pagesize}")
    @Override
    public QueryResponseResult findCourseList(@PathVariable("page") int page, @PathVariable("pagesize") int pagesize, String id) {
        return courseService.findCourseList(page,pagesize,id);
    }

    //新增课程
    @PostMapping("/course/addCourseBase")
    @Override
    public ResponseResult addCourseBase(@RequestBody CourseBase courseBase) {
        return courseService.addCourseBase(courseBase);
    }
}
