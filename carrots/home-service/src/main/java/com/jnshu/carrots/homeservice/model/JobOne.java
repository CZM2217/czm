package com.jnshu.carrots.homeservice.model;

public class JobOne {
    private Long jobId;

    private String jobName;

//    private String jobNameId;

    private String jobCompany;

    private Integer jobSalary;

    private Integer jobPriority;

    private Integer jobType;

    private Integer jobLevel;

    private Integer jobStatus;

    private String createName;

    private Long createTime;

    private String updateName;

    private Long updateAt;

    private Long companyId;

    private String companyLogo;

    private String companyArea;

    private String companyTag;

    private String companyPeople;

    private String companyTrade;

    private Integer jobExperience;

    private Integer jobEducation;

    private String jobCaption;

    private String jobRequirement;

    private String jobWelfare;


    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany == null ? null : jobCompany.trim();
    }

    public Integer getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(Integer jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Integer getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(Integer jobPriority) {
        this.jobPriority = jobPriority;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Integer getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(Integer jobLevel) {
        this.jobLevel = jobLevel;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
    }

    public String getCompanyPeople() {
        return companyPeople;
    }

    public void setCompanyPeople(String companyPeople) {
        this.companyPeople = companyPeople;
    }

    public String getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(String companyTrade) {
        this.companyTrade = companyTrade;
    }

    public Integer getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(Integer jobExperience) {
        this.jobExperience = jobExperience;
    }

    public Integer getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(Integer jobEducation) {
        this.jobEducation = jobEducation;
    }

    public String getJobCaption() {
        return jobCaption;
    }

    public void setJobCaption(String jobCaption) {
        this.jobCaption = jobCaption;
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }

    public String getJobWelfare() {
        return jobWelfare;
    }

    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}