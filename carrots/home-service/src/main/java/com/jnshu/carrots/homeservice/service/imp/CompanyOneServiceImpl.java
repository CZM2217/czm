package com.jnshu.carrots.homeservice.service.imp;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jnshu.carrots.homeservice.dao.CompanyOneMapper;
import com.jnshu.carrots.homeservice.model.CompanyOne;
import com.jnshu.carrots.homeservice.service.CompanyOneService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyOneServiceImpl implements CompanyOneService {

    @Autowired
    private CompanyOneMapper companyOneMapper;




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
    public Page<CompanyOne> selectCompanyList(@Param("companyName") String companyName, @Param("companyArea") String companyArea,@Param("orderType")String orderType,
                                              @Param("companyTrade") ArrayList<Integer> companyTrade, @Param("companySize") ArrayList<Integer>  companySize,
                                              @Param("currentPage")int currentPage,@Param("size")int size) {
        PageHelper.startPage(currentPage,size);
        Page<CompanyOne> companyOne=companyOneMapper.selectCompanyList(companyName,companyArea,orderType,companyTrade,companySize);

        return companyOne;
    }


    @Override
    public List<CompanyOne> selectCompanyFalse(){
        List<CompanyOne> companyOne=companyOneMapper.selectCompanyFalse();
        return companyOne;
    }
}
