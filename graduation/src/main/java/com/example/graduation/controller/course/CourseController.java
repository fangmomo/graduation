package com.example.graduation.controller.course;

import com.example.graduation.request.BaseRequest;
import com.example.graduation.request.course.*;
import com.example.graduation.response.BaseResponse;
import com.example.graduation.response.course.*;
import com.example.graduation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/course")
public class CourseController{

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CourseListResponse getCourseList(BaseRequest request){
        return courseService.getCourseList(request);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public BaseResponse saveCourse(@RequestBody CourseSaveRequest courseSaveRequest){
        return courseService.saveCourse(courseSaveRequest);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public BaseResponse updateCourse(@RequestBody CourseUpdateRequest courseUpdateRequest){
        return courseService.updateCourse(courseUpdateRequest);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public BaseResponse deleteCourse(@RequestBody BaseRequest request){
        return courseService.deleteCourse(request);
    }

    @RequestMapping(value = "/structure/list",method = RequestMethod.GET)
    public CourseStructureListResponse getCourseStructureList(BaseRequest request){
        return courseService.getStructureList(request);
    }

    @RequestMapping(value = "/module/list",method = RequestMethod.GET)
    public CourseModuleListResponse getCourseModuleList(BaseRequest request){
        return courseService.getModuleList(request);
    }

    @RequestMapping(value = "/eva",method = RequestMethod.POST)
    public BaseResponse evaCourse(@RequestBody CourseEvaRequest request){
        return courseService.evaCourse(request);
    }

    @RequestMapping(value = "/pointCourse/list",method = RequestMethod.GET)
    public GraPointCourseListResponse getGraPointCourseList(GraPointCourseListRequest request){
        return courseService.getGraPointCourseList(request);
    }

    @RequestMapping(value = "/pointCourse/eva",method = RequestMethod.POST)
    public BaseResponse evaGraPointCourse(@RequestBody GraPointCourseEvaRequest request){
        return courseService.evaGraPointCourse(request);
    }

    @RequestMapping(value = "/point/eva",method = RequestMethod.POST)
    public BaseResponse evaPoint(@RequestBody GraPointEvaRequest request){
        return courseService.evaGraPoint(request);
    }

    @RequestMapping(value = "/teacher/add",method = RequestMethod.POST)
    public BaseResponse addCourseTeacher(@RequestBody CourseTeacherSaveRequest request){
        return courseService.addCourseTeacher(request);
    }

    @RequestMapping(value = "/teacher/update",method = RequestMethod.POST)
    public BaseResponse updateCourseTeacher(@RequestBody CourseTeacherUpdateRequest request){
        return courseService.updateCourseTeacher(request);
    }

    @RequestMapping(value = "/student/graPoint/list",method = RequestMethod.GET)
    public StudentGraPointListResponse studentGraPointList( StudentGraPointListRequest request){
        return courseService.getStudentGraPoints(request);
    }

    @RequestMapping(value = "/student/graPoint/cal",method = RequestMethod.GET)
    public BaseResponse studentGraPointCal(StudentGraPointListRequest request){
        return courseService.calStudentGraPoint(request);
    }

    @RequestMapping(value = "/student/save")
    public BaseResponse studentCourseGradeSave(@RequestBody StudentCourseGradeSaveRequest request){
        return courseService.saveStudentCourseGrade(request);
    }

}
