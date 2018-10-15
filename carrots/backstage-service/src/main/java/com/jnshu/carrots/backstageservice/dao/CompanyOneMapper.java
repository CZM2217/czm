package com.jnshu.carrots.backstageservice.dao;


import com.github.pagehelper.Page;

import com.jnshu.carrots.backstageservice.model.CompanyOne;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CompanyOneMapper {


    void insertOne(CompanyOne companyOne);

    void insertTwo(CompanyOne companyOne);

    boolean deleteById(Long companyId);

    boolean updateById(CompanyOne companyOne);

    boolean updateStatusById(CompanyOne companyOne);

    CompanyOne selectBackCompanyById(Long companyId);

    Page<CompanyOne> selectBackCompanyList(CompanyOne companyOne);





    List<CompanyOne> selectCommonCompany();

    CompanyOne  selectNewAutoneCompany();

    CompanyOne selectCompanyById(Long companyId);

    List<CompanyOne> selectNewAutCompany(Integer size);

    Page<CompanyOne> selectCompanyList(@Param("companyName") String companyName, @Param("companyArea") String companyArea,
                                       @Param("companyTrade") ArrayList<Integer> companyTrade, @Param("companySize") ArrayList<Integer> companySize);

    List<CompanyOne> selectCompanyFalse();
}