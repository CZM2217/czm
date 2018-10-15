package com.jnshu.carrots.backstageservice.dao;


import com.github.pagehelper.Page;

import com.jnshu.carrots.backstageservice.model.JobList;
import com.jnshu.carrots.backstageservice.model.JobOne;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobOneMapper {

    void insertOne(JobOne jobOne);

    void insertTwo(JobOne jobOne);

    boolean deleteById(Long jobId);

    boolean updateStatusById(JobOne jobOne);

    boolean updateById(JobOne jobOne);

    JobOne selectBackJobById(Long jobId);

    Page<JobOne> selectBackJobList(JobOne jobOne);



    List<JobOne> selectNewJob();

    List<JobOne> selectRcmd(Integer count);

    List<JobOne> selectNewEight();

    List<JobOne> selectJobById(Long jobId);

    Integer selectJobAtCount(String companyName);

    List<JobOne> selectJobAtList(String companyName);

    Page<JobOne> selectJobList(JobList jobList);

}