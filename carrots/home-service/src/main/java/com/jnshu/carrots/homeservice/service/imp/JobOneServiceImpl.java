package com.jnshu.carrots.homeservice.service.imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jnshu.carrots.homeservice.dao.JobOneMapper;
import com.jnshu.carrots.homeservice.model.JobList;
import com.jnshu.carrots.homeservice.model.JobOne;
import com.jnshu.carrots.homeservice.service.JobOneService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobOneServiceImpl implements JobOneService {

    @Autowired
    private JobOneMapper jobOneMapper;


    @Override
    public List<JobOne> selectNewJob() {
        List<JobOne> jobOne=jobOneMapper.selectNewJob();
        return jobOne;
    }


    @Override
    public List<JobOne> selectRcmd(Integer count) {
        List<JobOne> jobOne=jobOneMapper.selectRcmd(count);
        return jobOne;
    }


    @Override
    public List<JobOne> selectNewEight() {
        List<JobOne> jobOne=jobOneMapper.selectNewEight();
        return jobOne;
    }

    @Override
    public List<JobOne> selectJobById(Long jobId){
        List<JobOne> jobOne=jobOneMapper.selectJobById(jobId);
        return jobOne;
    }

    @Override
    public Integer selectJobAtCount(String companyName){
        return jobOneMapper.selectJobAtCount(companyName);

    }

    @Override
    public List<JobOne> selectJobAtList(int currentPage,int size,String companyName){
        PageHelper.startPage(currentPage,size);
        List<JobOne> jobOne=jobOneMapper.selectJobAtList(companyName);
        return jobOne;
    }

    @Override
    public Page<JobOne> selectJobList(@Param("jobList")JobList jobList,
                                      @Param("currentPage")int currentPage, @Param("size")int size){
        PageHelper.startPage(currentPage,size);
        Page<JobOne> jobOne=jobOneMapper.selectJobList(jobList);
        return jobOne;
    }
}
