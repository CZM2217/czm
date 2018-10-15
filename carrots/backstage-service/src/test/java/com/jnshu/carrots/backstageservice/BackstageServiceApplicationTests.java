package com.jnshu.carrots.backstageservice;

import com.jnshu.carrots.backstageservice.dao.BannerMapper;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.util.Timestamp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.jnshu.carrots.backstageservice.dao")
public class BackstageServiceApplicationTests {

	@Autowired
	private BannerMapper bannerMapper;


	@Test
	public void contextLoads() {

//		Banner banners=null;
//		banners.setImageId(1L);
//		List<Banner> banner= bannerMapper.selectImageList(banners);


		Timestamp timestamp=new Timestamp();
		long a=timestamp.time();
		System.out.println("1111111111111"+a);
	}









}
