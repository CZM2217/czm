package com.jnshu.carrots.homeservice.controller;


import com.github.pagehelper.Page;
import com.jnshu.carrots.homeservice.model.*;
import com.jnshu.carrots.homeservice.service.BannerService;
import com.jnshu.carrots.homeservice.service.JobOneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class homeController {

    @Autowired
    private BannerService bannerService;

    @Autowired
    private JobOneService jobOneService;

    @ApiOperation(value="轮播图", notes="前台的轮播图接口",produces = "application/json")
    @GetMapping("/a/banner")
    public Info firstBanner(Integer imageType,int num){

        Map data = new HashMap();
        Info info = new Info();
        try {
            List<Banner> banner = bannerService.selectByImageType(imageType, num);
            data.put("banner_list", banner);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;
    }


    @ApiOperation(value="最新20个职位", notes="用于首页")
    @GetMapping("/a/index/job")
    public Info newJob(){

        Map data = new HashMap();
        Info info = new Info();
        try {
            List<JobOne> jobOne= jobOneService.selectNewJob();
            data.put("new_job_list", jobOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);

        return info;

    }

    @ApiOperation(value="职位列表", notes="根据输入的信息进行职位的搜索，并分页展示")
    @PostMapping("/a/findjob/list")
    public Info jobList(JobList jobList, @RequestParam(defaultValue = "1")int currentPage,
                        @RequestParam(defaultValue = "10")int size){


        Map data = new HashMap();
        Info info = new Info();

        Page<JobOne> jobOne= jobOneService.selectJobList(jobList,currentPage,size);
        Long total=jobOne.getTotal();
        if(total>0){
            data.put("total",total);
            data.put("jobList", jobOne);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }else {
            Integer count=3;
            List<JobOne> jobOnes= jobOneService.selectRcmd(count);
            data.put("rcmdJobList", jobOnes);
            info.setCode(0001);
            info.setMessage("null");
            info.setData(data);
        }

        return info;

    }


}
