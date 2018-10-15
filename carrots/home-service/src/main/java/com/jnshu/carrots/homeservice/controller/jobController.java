package com.jnshu.carrots.homeservice.controller;


import com.github.pagehelper.Page;
import com.jnshu.carrots.homeservice.model.CompanyOne;
import com.jnshu.carrots.homeservice.model.Info;
import com.jnshu.carrots.homeservice.model.JobOne;
import com.jnshu.carrots.homeservice.service.CompanyOneService;
import com.jnshu.carrots.homeservice.service.JobOneService;
import com.jnshu.carrots.homeservice.util.ArrayToListUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class jobController {

    @Autowired
    private JobOneService jobOneService;

    @Autowired
    private CompanyOneService companyOneService;

    @ApiOperation(value="推荐职位", notes="展示8个推荐职位")
    @GetMapping("/a/findjob/rcmd")
    public Info rcmd(){

        Map data = new HashMap();
        Info info = new Info();
        Integer count=8;
        try {
            List<JobOne> jobOne= jobOneService.selectRcmd(count);
            data.put("rcmd_job_list", jobOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    @ApiOperation(value="最新职位", notes="展示8个最新职位")
    @GetMapping("/a/findjob/new")
    public Info newJob1(){
        Map data = new HashMap();
        Info info = new Info();

        try {
            List<JobOne> jobOne= jobOneService.selectNewEight();
            data.put("newJob8", jobOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;

    }

    @ApiOperation(value="普通公司", notes="按照职位发布的时间顺序显示八个")
    @GetMapping("/a/findjob/company/common")
    public Info commonCompany(){

        Map data = new HashMap();
        Info info = new Info();

        try {
            List<CompanyOne> companyOne=companyOneService.selectCommonCompany();
            data.put("company_one_service", companyOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;

    }

    @ApiOperation(value="最新发布职位的认证公司", notes="根据公司数量来返回认证公司信息")
    @GetMapping("/a/findjob/company/newaut")
    public Info newAut(Integer size){

        Map data = new HashMap();
        Info info = new Info();

        try {
            List<CompanyOne> companyOne =companyOneService.selectNewAutCompany(size);
            data.put("company_service", companyOne);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);

        }catch (Exception e){
            info.setCode(1000);
            info.setMessage("null");

        }
        return info;

    }
    @ApiOperation(value="最新认证公司", notes="根据公司数量来返回认证公司信息")
    @GetMapping("/a/findjob/company/newautone")
    public Info newAutOne(){


        Map data = new HashMap();
        Info info = new Info();
        try {
            CompanyOne companyOne=companyOneService.selectNewAutoneCompany();
            data.put("newAutOne", companyOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;

    }

    @ApiOperation(value="公司列表", notes="按照公司的搜索条件返回公司列表，按更新时间排序")
    @PostMapping("/a/company/list")
    public Info companyList(String companyName, String companyArea, String orderType, int[] companyTrade, int[] companySize,
                            @RequestParam(defaultValue = "1")int currentPage, @RequestParam(defaultValue = "9")int size){


        ArrayList<Integer> companyTrad=new ArrayToListUtil().change(companyTrade);
        ArrayList<Integer> companySiz = new ArrayToListUtil().change(companySize);

        Map data = new HashMap();
        Info info = new Info();

        Page<CompanyOne> companyOne=companyOneService.selectCompanyList(companyName,companyArea,orderType,
                companyTrad,companySiz,currentPage,size);
        Long total=companyOne.getTotal();
        if(total>0){

            data.put("companyList", companyOne);
            data.put("total",total);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);

        }else {
            List<CompanyOne> companyOnes=companyOneService.selectCompanyFalse();
            data.put("companyListNull", companyOnes);
            info.setCode(0001);
            info.setMessage("null");
            info.setData(data);
        }

        return info;

    }



    @ApiOperation(value="公司详情页", notes="根据id来查找详细的公司信息")
    @GetMapping("/a/company")
    public Info company(Long companyId){

        Map data = new HashMap();
        Info info = new Info();
        try {
            CompanyOne companyOne=companyOneService.selectCompanyById(companyId);
            data.put("company", companyOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    @ApiOperation(value="在招职位", notes="根据公司名搜出对应的在招职位")
    @PostMapping("/a/company/job/")
    public Info jobAt(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10")int size, String companyName) {

        Map data = new HashMap();
        Info info = new Info();
        try {
            int countJob=jobOneService.selectJobAtCount(companyName);
            List<JobOne> jobOne=jobOneService.selectJobAtList(currentPage,size,companyName);
            data.put("countJob",countJob);
            data.put("JobAtList",jobOne);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }catch (Exception e){
            info.setCode(0001);
            info.setMessage("fail");
        }
        return info;
    }


    @ApiOperation(value="职位详情", notes="根据职业的id搜出职位的具体信息")
    @GetMapping("/a/job")
    public Info jobDetail(Long jobId){


        Map data = new HashMap();
        Info info = new Info();
        try {
            List<JobOne> jobOne=jobOneService.selectJobById(jobId);
            data.put("job", jobOne);
            info.setCode(0000);

        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
        }
        info.setMessage("success");
        info.setData(data);
        return info;
    }








}
