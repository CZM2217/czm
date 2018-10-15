package com.jnshu.carrots.homeservice.dao;


import com.github.pagehelper.Page;
import com.jnshu.carrots.homeservice.model.JobList;
import com.jnshu.carrots.homeservice.model.JobOne;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobOneMapper {

    List<JobOne> selectNewJob();

    List<JobOne> selectRcmd(Integer count);

    List<JobOne> selectNewEight();

    List<JobOne> selectJobById(Long jobId);

    Integer selectJobAtCount(String companyName);

    List<JobOne> selectJobAtList(String companyName);

    Page<JobOne> selectJobList(JobList jobList);

}