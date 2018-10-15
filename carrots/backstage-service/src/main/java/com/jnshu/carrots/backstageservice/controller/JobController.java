package com.jnshu.carrots.backstageservice.controller;


import com.github.pagehelper.Page;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.model.JobOne;
import com.jnshu.carrots.backstageservice.service.JobOneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/a/u/job")
@RestController
public class JobController {

    @Autowired
    private JobOneService jobOneService;

    @ApiOperation(value = "获取职位列表", notes = "获取所有职位列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info jobList(JobOne jobOne, @RequestParam(defaultValue = "1")int currentPage,
                        @RequestParam(defaultValue = "10")int size){


        Map data = new HashMap();
        Info info = new Info();

        Page<JobOne> jobOnes= jobOneService.selectBackJobList(jobOne, currentPage, size);
        Long total=jobOnes.getTotal();
            data.put("total",total);
            data.put("jobList", jobOnes);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        return info;
    }

    @ApiOperation(value = "职位详情", notes = "根据id获取职位详情", produces = "application/json")
    @GetMapping
    public Info get(Long jobId) {

        Map data = new HashMap();
        Info info = new Info();
        try {
            JobOne jobOne= jobOneService.selectBackJobById(jobId);
            data.put("job", jobOne);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }catch (Exception e){
            info.setMessage("fail");
            info.setCode(1000);
        }


        return info;


    }

    @ApiOperation(value = "删除职位", notes = "根据id删除职位", produces = "application/json")
    @DeleteMapping
    public Info delete(Long jobId) {


        Info info = new Info();
        try {
            jobOneService.deleteById(jobId);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            info.setMessage("fail");
            info.setCode(1000);
        }

        return info;
    }

    @ApiOperation(value = "修改冻结状态", notes = "根据id修改职位冻结状态", produces = "application/json")
    @PutMapping(value = "/status")

    public Info status(JobOne jobOne){

        Info info = new Info();
        try {
            jobOneService.updateStatusById(jobOne);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            info.setMessage("fail");
            info.setCode(1000);
        }

        return info;

    }



    @ApiOperation(value = "职位信息修改", notes = "根据id修改职位信息", produces = "application/json")
    @PutMapping
    public Info update(JobOne jobOne){

        Info info=jobOneService.updateById(jobOne);
        return info;

    }


    @ApiOperation(value = "新增职位", notes = "增加新的职位", produces = "application/json")
    @PostMapping
    public void add(JobOne jobOne){

        Info info = new Info();
        jobOneService.insert(jobOne);
        info.setCode(0000);
        info.setMessage("success");
    }



}
