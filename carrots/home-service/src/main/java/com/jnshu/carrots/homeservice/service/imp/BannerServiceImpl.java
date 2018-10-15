package com.jnshu.carrots.homeservice.service.imp;

import com.jnshu.carrots.homeservice.dao.BannerMapper;
import com.jnshu.carrots.homeservice.model.Banner;
import com.jnshu.carrots.homeservice.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;



    public List<Banner> selectByImageType(Integer imageType, int count){
        List<Banner> banner=bannerMapper.selectByImageType(imageType,count);
        return banner;
    }
}
