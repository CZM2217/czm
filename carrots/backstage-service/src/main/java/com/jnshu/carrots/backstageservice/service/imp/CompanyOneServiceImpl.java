package com.jnshu.carrots.backstageservice.service.imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.jnshu.carrots.backstageservice.dao.CompanyOneMapper;
import com.jnshu.carrots.backstageservice.model.CompanyOne;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.service.CompanyOneService;
import com.jnshu.carrots.backstageservice.util.Timestamp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyOneServiceImpl implements CompanyOneService {

    @Autowired
    private CompanyOneMapper companyOneMapper;


    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void insert(CompanyOne companyOne){

        CompanyOne companyOne1=new Timestamp().insertTime(companyOne);
        companyOne1.setCompanyStatus(0);
        companyOneMapper.insertOne(companyOne1);
        Long companyId=companyOne1.getCompanyId();
        companyOne1.setCompanyOneId(companyId);
        companyOneMapper.insertTwo(companyOne1);
    }

    @Override
    public boolean deleteById(Long companyId){

        return companyOneMapper.deleteById(companyId);
    }

    @Override
    public boolean updateStatusById(CompanyOne companyOne) {

        CompanyOne companyOne1 = new Timestamp().updateTime(companyOne);
        return companyOneMapper.updateStatusById(companyOne1);
    }



    @Override
    public Info updateById(CompanyOne companyOne) {

        Info info = new Info();
        CompanyOne companyOne1 = new Timestamp().updateTime(companyOne);
        try {
            companyOneMapper.updateById(companyOne1);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            info.setCode(1000);
            info.setMessage("fail");
        }
        return info;
    }



    @Override
    public Page<CompanyOne> selectBackCompanyList(CompanyOne companyOne,
                                                  @Param("currentPage")int currentPage,@Param("size")int size) {
        PageHelper.startPage(currentPage,size);
        Page<CompanyOne> companyOne1=companyOneMapper.selectBackCompanyList(companyOne);
        return companyOne1;
    }



    @Override
    public  CompanyOne selectBackCompanyById(Long companyId) {
        CompanyOne companyOne=companyOneMapper.selectBackCompanyById(companyId);
        return companyOne;
    }






    @Override
    public List<CompanyOne> selectCommonCompany() {
        List<CompanyOne> companyOne=companyOneMapper.selectCommonCompany();
        return companyOne;
    }

    @Override
    public CompanyOne selectNewAutoneCompany() {
        CompanyOne companyOne=companyOneMapper.selectNewAutoneCompany();
        return companyOne;
    }


    @Override
    public CompanyOne selectCompanyById(Long companyId) {
        CompanyOne companyOne=companyOneMapper.selectCompanyById(companyId);
        return companyOne;
    }

    @Override
    public List<CompanyOne> selectNewAutCompany(Integer size) {

        List<CompanyOne> companyOne=companyOneMapper.selectNewAutCompany(size);
        return companyOne;
    }



    @Override
    public Page<CompanyOne> selectCompanyList(@Param("companyName") String companyName, @Param("companyArea") String companyArea,
                                              @Param("companyTrade") ArrayList<Integer> companyTrade, @Param("companySize") ArrayList<Integer>  companySize,
                                              @Param("currentPage")int currentPage,@Param("size")int size) {
        PageHelper.startPage(currentPage,size);
        Page<CompanyOne> companyOne=companyOneMapper.selectCompanyList(companyName,companyArea,companyTrade,companySize);

        return companyOne;
    }


    @Override
    public List<CompanyOne> selectCompanyFalse(){
        List<CompanyOne> companyOne=companyOneMapper.selectCompanyFalse();
        return companyOne;
    }
}
