package com.jnshu.carrots.backstageservice.service;




import com.github.pagehelper.Page;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.model.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BannerService {

    Info insert(Banner banner);

    boolean deleteById(Long imageId);

    Info updateImageStatus(Banner banner);

    Info updateById(Banner banner);

    Banner selectById(Long imageId);


    Page<Banner> selectImageList(Banner banner,
                                 @Param("currentPage") int currentPage, @Param("size") int size);

    List<Banner> selectByImageType(Integer imageType, int count);
}