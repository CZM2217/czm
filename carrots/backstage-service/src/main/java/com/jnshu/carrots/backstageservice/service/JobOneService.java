package com.jnshu.carrots.backstageservice.service;


import com.github.pagehelper.Page;


import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.model.JobList;
import com.jnshu.carrots.backstageservice.model.JobOne;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface JobOneService {


    void insert(JobOne jobOne);

    boolean deleteById(Long jobId);

    boolean updateStatusById(JobOne jobOne);

    Info updateById(JobOne jobOne);

    JobOne selectBackJobById(Long jobId);

    Page<JobOne> selectBackJobList(@Param("jobOne") JobOne jobOne,
                                   @Param("currentPage")int currentPage, @Param("size")int size);

    List<JobOne> selectNewJob();

    List<JobOne> selectRcmd(Integer count);

    List<JobOne> selectNewEight();

    List<JobOne> selectJobById(Long jobId);

    Integer selectJobAtCount(String companyName);

    List<JobOne> selectJobAtList(int currentPage, int size, String companyName);

    Page<JobOne> selectJobList(@Param("jobList") JobList jobList,
                               @Param("currentPage") int currentPage, @Param("size") int size);
}