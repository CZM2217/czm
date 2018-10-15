package com.jnshu.carrots.backstageservice.service.imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.jnshu.carrots.backstageservice.dao.JobOneMapper;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.model.JobList;
import com.jnshu.carrots.backstageservice.model.JobOne;
import com.jnshu.carrots.backstageservice.service.JobOneService;
import com.jnshu.carrots.backstageservice.util.Timestamp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class JobOneServiceImpl implements JobOneService {

    @Autowired
    private JobOneMapper jobOneMapper;




    @Override
    @Transactional
    public void insert(JobOne jobOne) {

        JobOne jobOne1=new Timestamp().insertTime(jobOne);
        jobOne1.setJobStatus(0);
        jobOneMapper.insertOne(jobOne1);
        Long jobId=jobOne1.getJobId();
        jobOne1.setJobOneId(jobId);
        jobOneMapper.insertTwo(jobOne1);

    }




    @Override
    public boolean deleteById(Long jobId) {

        return jobOneMapper.deleteById(jobId);
    }


    @Override
    public boolean updateStatusById(JobOne jobOne) {

        JobOne jobOne1 = new Timestamp().updateTime(jobOne);
        return jobOneMapper.updateStatusById(jobOne1);
    }


    @Override
    public Info updateById(JobOne jobOne) {

        Info info = new Info();
        JobOne jobOne1 = new Timestamp().updateTime(jobOne);
        try {
            jobOneMapper.updateById(jobOne1);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            System.out.println(e);
            info.setCode(1000);
            info.setMessage("fail");
        }
        return info;
    }


    @Override
    public JobOne selectBackJobById(Long jobId) {
        JobOne jobOne=jobOneMapper.selectBackJobById(jobId);
        return jobOne;
    }


    @Override
    public Page<JobOne> selectBackJobList(@Param("jobOne") JobOne jobOne,
                                          @Param("currentPage")int currentPage, @Param("size")int size){

        PageHelper.startPage(currentPage,size);
        Page<JobOne> jobOnes=jobOneMapper.selectBackJobList(jobOne);
        return jobOnes;
    }


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
