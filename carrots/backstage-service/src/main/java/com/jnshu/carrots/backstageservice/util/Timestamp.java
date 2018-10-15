package com.jnshu.carrots.backstageservice.util;

import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.model.CompanyOne;
import com.jnshu.carrots.backstageservice.model.JobOne;

public class Timestamp {

    public Long time(){

        return System.currentTimeMillis();

    }


    public JobOne insertTime(JobOne jobOne){

        jobOne.setCreateTime(time());
        jobOne.setUpdateAt(time());

        return jobOne;
    }

    public JobOne updateTime(JobOne jobOne){

        jobOne.setCreateTime(time());
        jobOne.setUpdateAt(time());

        return jobOne;
    }

    public Banner insertTime(Banner banner){

        banner.setCreateTime(time());
        banner.setUpdateAt(time());

        return banner;
    }

    public Banner updateTime(Banner banner){

        banner.setCreateTime(time());
        banner.setUpdateAt(time());

        return banner;
    }


    public CompanyOne insertTime(CompanyOne companyOne){

        companyOne.setCreateTime(time());
        companyOne.setUpdateAt(time());

        return companyOne;
    }

    public CompanyOne updateTime(CompanyOne companyOne){

        companyOne.setCreateTime(time());
        companyOne.setUpdateAt(time());

        return companyOne;
    }

}
