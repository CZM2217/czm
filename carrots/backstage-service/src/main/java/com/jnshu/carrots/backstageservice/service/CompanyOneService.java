package com.jnshu.carrots.backstageservice.service;


import com.github.pagehelper.Page;

import com.jnshu.carrots.backstageservice.model.CompanyOne;
import com.jnshu.carrots.backstageservice.model.Info;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface CompanyOneService {

    void insert(CompanyOne companyOne);

    boolean deleteById(Long companyId);

    Info updateById(CompanyOne companyOne);

    boolean updateStatusById(CompanyOne companyOne);

    Page<CompanyOne> selectBackCompanyList(CompanyOne companyOne,
                                                  @Param("currentPage")int currentPage,@Param("size")int size);

    CompanyOne selectBackCompanyById(Long companyId);



    List<CompanyOne> selectCommonCompany();

    CompanyOne  selectNewAutoneCompany();

    CompanyOne selectCompanyById(Long companyId);

    List<CompanyOne> selectNewAutCompany(Integer size);

//    Integer selectCompanyAtCount();

    Page<CompanyOne> selectCompanyList(@Param("companyName") String companyName, @Param("companyArea") String companyArea,
                                       @Param("companyTrade") ArrayList<Integer> companyTrade, @Param("companySize") ArrayList<Integer> companySize,
                                       @Param("currentPage") int currentPage, @Param("size") int size);

    List<CompanyOne> selectCompanyFalse();
}