package com.jnshu.carrots.backstageservice.controller;


import com.github.pagehelper.Page;
import com.jnshu.carrots.backstageservice.model.CompanyOne;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.service.CompanyOneService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/a/u/company")
@RestController
public class CompanyController {

    @Autowired
    private CompanyOneService companyOneService;

    @ApiOperation(value = "获取公司列表", notes = "获取所有公司列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info companyList(CompanyOne companyOne,@RequestParam(defaultValue = "1")int currentPage,
                            @RequestParam(defaultValue = "10")int size){

        Map data = new HashMap();
        Info info = new Info();

        Page<CompanyOne> companyOnes= companyOneService.selectBackCompanyList(companyOne, currentPage, size);
        Long total=companyOnes.getTotal();
        data.put("total",total);
        data.put("CompanyList", companyOnes);
        info.setCode(0000);
        info.setMessage("success");
        info.setData(data);
        return info;
    }


    @ApiOperation(value = "公司详情", notes = "根据id获取公司详情", produces = "application/json")
    @GetMapping
    public Info get(Long companyId) {

        Map data = new HashMap();
        Info info = new Info();
        try {
            CompanyOne companyOne= companyOneService.selectCompanyById(companyId);
            data.put("company", companyOne);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }catch (Exception e){
            info.setMessage("fail");
            info.setCode(1000);
        }
        return info;

    }

    @ApiOperation(value = "修改冻结状态", notes = "根据id修改公司冻结状态", produces = "application/json")
    @PutMapping(value = "/status")
    public Info status(CompanyOne companyOne){


        Info info = new Info();
        try {
            companyOneService.updateStatusById(companyOne);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){

            info.setCode(1000);
            info.setMessage("fail");
        }

        return info;

    }

    @ApiOperation(value = "公司信息修改", notes = "根据id修改公司信息", produces = "application/json")
    @PutMapping
    public Info update(CompanyOne companyOne){

        Info info=companyOneService.updateById(companyOne);
        return info;

    }



    @ApiOperation(value = "新增公司", notes = "增加新的公司", produces = "application/json")
    @PostMapping
    public Info add(CompanyOne companyOne){

        Info info = new Info();
        companyOneService.insert(companyOne);
        info.setCode(0000);
        info.setMessage("success");
        return info;

    }



    @ApiOperation(value = "删除公司", notes = "根据id删除公司", produces = "application/json")
    @DeleteMapping
    public Info delete(Long companyId) {

        Info info = new Info();
        try{
            companyOneService.deleteById(companyId);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            info.setCode(1000);
            info.setMessage("fail");
        }

        return info;

    }


}



