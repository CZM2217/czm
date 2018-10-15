package com.jnshu.carrots.homeservice.service;


import com.github.pagehelper.Page;
import com.jnshu.carrots.homeservice.model.CompanyOne;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CompanyOneService {


    List<CompanyOne> selectCommonCompany();

    CompanyOne  selectNewAutoneCompany();

    CompanyOne selectCompanyById(Long companyId);

    List<CompanyOne> selectNewAutCompany(Integer size);

//    Integer selectCompanyAtCount();

    Page<CompanyOne> selectCompanyList(@Param("companyName") String companyName, @Param("companyArea") String companyArea,@Param("orderType")String orderType,
                                       @Param("companyTrade") ArrayList<Integer> companyTrade, @Param("companySize") ArrayList<Integer>  companySize,
                                       @Param("currentPage")int currentPage, @Param("size")int size);

    List<CompanyOne> selectCompanyFalse();
}