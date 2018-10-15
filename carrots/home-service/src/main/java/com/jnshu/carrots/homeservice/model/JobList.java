package com.jnshu.carrots.homeservice.model;

import com.jnshu.carrots.homeservice.util.ArrayToListUtil;

import java.util.ArrayList;

public class JobList {

    private String jobName;

    private String companyArea;

    private Long updateAt;

    private String orderType;

    private ArrayList<Integer> companyTrade;

    private ArrayList<Integer> jobType;

    private ArrayList<Integer> jobLevel;

    private ArrayList<Integer> jobEducation;

    private ArrayList<Integer> jobExperience;

    private ArrayList<Integer> jobSalary;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }


    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ArrayList<Integer> getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(int[] companyTrade) {
        ArrayList<Integer> companyTrad=new ArrayToListUtil().change(companyTrade);
        this.companyTrade = companyTrad;
    }

    public ArrayList<Integer> getJobType() {
        return jobType;
    }

    public void setJobType(int[] jobType) {
        ArrayList<Integer> jobTyp=new ArrayToListUtil().change(jobType);
        this.jobType = jobTyp;
    }

    public ArrayList<Integer> getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int[] jobLevel) {
        ArrayList<Integer> jobLeve=new ArrayToListUtil().change(jobLevel);
        this.jobLevel = jobLeve;
    }

    public ArrayList<Integer> getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(int[] jobEducation) {
        ArrayList<Integer> jobEducatio=new ArrayToListUtil().change(jobEducation);
        this.jobEducation = jobEducatio;
    }

    public ArrayList<Integer> getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(int[] jobExperience) {
        ArrayList<Integer> jobExperienc=new ArrayToListUtil().change(jobExperience);
        this.jobExperience = jobExperienc;
    }

    public ArrayList<Integer> getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(int[] jobSalary) {
        ArrayList<Integer> jobSalar=new ArrayToListUtil().change(jobSalary);
        this.jobSalary = jobSalar;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
