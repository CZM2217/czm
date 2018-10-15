package com.jnshu.carrots.homeservice.model;

public class CompanyOne {
    private Long companyId;

    private String companyName;

    private String companyLogo;

    private String companyTrade;

    private String companyTag;

    private Integer companyAut;

    private String companyPeople;

    private Integer companyStatus;

    private String createName;

    private Long createTime;

    private String updateName;

    private Long updateAt;

    private String companyArea;

    private String companySlogan;

    private Integer companySize;

    private String companyProductName;

    private String companyProductLogo;

    private String companyProductSlogan;

    private String companyPhone;

    private String companyEmail;

    private String companyAddr;

    private String companyMap;

    private String companyCaption;

    private String companyProductCaption;

    private String jobName;

    private Integer countJob;

//    private Integer orderType;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyTrade() {
        return companyTrade;
    }

    public void setCompanyTrade(String companyTrade) {
        this.companyTrade = companyTrade == null ? null : companyTrade.trim();
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag == null ? null : companyTag.trim();
    }

    public Integer getCompanyAut() {
        return companyAut;
    }

    public void setCompanyAut(Integer companyAut) {
        this.companyAut = companyAut;
    }

    public String getCompanyPeople() {
        return companyPeople;
    }

    public void setCompanyPeople(String companyPeople) {
        this.companyPeople = companyPeople == null ? null : companyPeople.trim();
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
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

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan;
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public String getCompanyProductName() {
        return companyProductName;
    }

    public void setCompanyProductName(String companyProductName) {
        this.companyProductName = companyProductName;
    }

    public String getCompanyProductLogo() {
        return companyProductLogo;
    }

    public void setCompanyProductLogo(String companyProductLogo) {
        this.companyProductLogo = companyProductLogo;
    }

    public String getCompanyProductSlogan() {
        return companyProductSlogan;
    }

    public void setCompanyProductSlogan(String companyProductSlogan) {
        this.companyProductSlogan = companyProductSlogan;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }

    public String getCompanyMap() {
        return companyMap;
    }

    public void setCompanyMap(String companyMap) {
        this.companyMap = companyMap;
    }

    public String getCompanyCaption() {
        return companyCaption;
    }

    public void setCompanyCaption(String companyCaption) {
        this.companyCaption = companyCaption;
    }

    public String getCompanyProductCaption() {
        return companyProductCaption;
    }

    public void setCompanyProductCaption(String companyProductCaption) {
        this.companyProductCaption = companyProductCaption;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getCountJob() {
        return countJob;
    }

    public void setCountJob(Integer countJob) {
        this.countJob = countJob;
    }

    @Override
    public String toString() {
        return "CompanyOne{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                ", companyTrade='" + companyTrade + '\'' +
                ", companyTag='" + companyTag + '\'' +
                ", companyAut=" + companyAut +
                ", companyPeople='" + companyPeople + '\'' +
                ", companyStatus=" + companyStatus +
                ", createName='" + createName + '\'' +
                ", createTime=" + createTime +
                ", updateName='" + updateName + '\'' +
                ", updateAt=" + updateAt +
                ", companyArea='" + companyArea + '\'' +
                ", companySlogan='" + companySlogan + '\'' +
                ", companySize=" + companySize +
                ", companyProductName='" + companyProductName + '\'' +
                ", companyProductLogo='" + companyProductLogo + '\'' +
                ", companyProductSlogan='" + companyProductSlogan + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", companyAddr='" + companyAddr + '\'' +
                ", companyMap='" + companyMap + '\'' +
                ", companyCaption='" + companyCaption + '\'' +
                ", companyProductCaption='" + companyProductCaption + '\'' +
                ", jobName='" + jobName + '\'' +
                ", countJob=" + countJob +
                '}';
    }
}