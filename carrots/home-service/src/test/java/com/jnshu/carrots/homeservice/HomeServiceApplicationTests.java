package com.jnshu.carrots.homeservice;

import com.jnshu.carrots.homeservice.dao.CompanyOneMapper;
import com.jnshu.carrots.homeservice.model.CompanyOne;
import com.jnshu.carrots.homeservice.service.BannerService;
import com.jnshu.carrots.homeservice.service.CompanyOneService;
import com.jnshu.carrots.homeservice.service.JobOneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.jnshu.carrots.homeservice.dao")
public class HomeServiceApplicationTests {


	@Autowired
	private BannerService bannerService;

	@Autowired
	private JobOneService jobOneService;

	@Autowired
	private CompanyOneService companyOneService;

	@Autowired
	private CompanyOneMapper companyOneMapper;


	@Test
	public void contextLoads() {
//		User user=userService.selectByPrimaryKey((long) 1);
//		System.out.println(user);

//		Banner banner=bannerService.selectByPrimaryKey(1L);

//		List<Banner> banner1=bannerService.selectByImageType(0,4);
//		System.out.println(banner1);

//		JobOne jobOne= jobOneService.selectByPrimaryKey(1L);
//		System.out.println(jobOne);

//		List<JobOne> jobOnes= jobOneService.selectNewJob();
//		System.out.println(jobOnes);

//		CompanyOne companyOne=companyOneService.selectNewAutoneCompany();
//		System.out.println(companyOne);


		String companyName="";
		String companyArea="";
		String orderType="";
		ArrayList<Integer> companyTrade=new ArrayList<>();
		ArrayList<Integer> companySize=new ArrayList<>();
		companySize.add(1);
		companySize.add(2);
		companyTrade.add(1);
		companyTrade.add(2);

		List<CompanyOne> companyOne=companyOneMapper.selectCompanyList
				(companyName,companyArea,orderType,companyTrade,companySize);
		System.out.println(companyOne);

		System.out.println("000000000000000000000000");

	}

}
