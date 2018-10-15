package com.jnshu.carrots.homeservice.service;


import com.jnshu.carrots.homeservice.model.Banner;

import java.util.List;


public interface BannerService {


    List<Banner> selectByImageType(Integer imageType, int count);
}