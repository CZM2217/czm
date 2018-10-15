package com.jnshu.carrots.backstageservice.dao;



import com.github.pagehelper.Page;
import com.jnshu.carrots.backstageservice.model.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {


    boolean insert(Banner banner);

    boolean deleteById(Long imageId);

    boolean updateStatusById(Banner banner);

    boolean updateById(Banner banner);

    Banner selectById(Long imageId);

    String selectByImageTrade(Integer imageTrade);

    Page<Banner> selectImageList(Banner banner);

    List<Banner> selectByImageType(@Param("imageType") Integer imageType, @Param("count") int count);
}