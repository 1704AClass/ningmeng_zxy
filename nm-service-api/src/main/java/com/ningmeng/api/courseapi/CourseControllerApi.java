package com.ningmeng.api.courseapi;

import com.ningmeng.framework.domain.course.Teachplan;
import com.ningmeng.framework.domain.course.ext.TeachplanNode;
import com.ningmeng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "课程管理API",description = "课程管理API，提供课程管理的增、删、改、查")
public interface CourseControllerApi {

    /**
     * 根据课程Id查询Three树 数据
     * @param courseId
     * @return
     */
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);
}
