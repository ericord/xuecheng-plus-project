package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程信息编辑接口
 *
 * @author chaonianye
 * @description
 * @date 2023/5/26
 */
@RestController
public class CourseBaseInfoController {
    @GetMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,
                                       @RequestBody QueryCourseParamsDto queryCourseParamsDto) {
        return null;
    }
}
