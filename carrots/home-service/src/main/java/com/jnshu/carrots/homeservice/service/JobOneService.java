package com.jnshu.carrots.homeservice.service;


import com.github.pagehelper.Page;
import com.jnshu.carrots.homeservice.model.JobList;
import com.jnshu.carrots.homeservice.model.JobOne;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JobOneService {


    List<JobOne> selectNewJob();

    List<JobOne> selectRcmd(Integer count);

    List<JobOne> selectNewEight();

    List<JobOne> selectJobById(Long jobId);

    Integer selectJobAtCount(String companyName);

    List<JobOne> selectJobAtList(int currentPage,int size,String companyName);

    Page<JobOne> selectJobList(@Param("jobList")JobList jobList,
                               @Param("currentPage")int currentPage, @Param("size")int size);
}