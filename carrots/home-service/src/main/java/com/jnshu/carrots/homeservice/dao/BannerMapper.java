package com.jnshu.carrots.homeservice.dao;


import com.jnshu.carrots.homeservice.model.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {


    List<Banner> selectByImageType(@Param("imageType") Integer imageType, @Param("count") int count);
}