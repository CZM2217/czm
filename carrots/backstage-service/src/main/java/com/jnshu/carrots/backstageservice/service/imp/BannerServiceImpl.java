package com.jnshu.carrots.backstageservice.service.imp;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jnshu.carrots.backstageservice.dao.BannerMapper;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.service.BannerService;
import com.jnshu.carrots.backstageservice.util.Timestamp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;


    @Override
    public Info insert(Banner banner) {

        Integer imageTrade=banner.getImageTrade();
        Info info = new Info();

        if(imageTrade!=null) {

            String imageName = bannerMapper.selectByImageTrade(imageTrade);

            if (imageName == null) {
                try {
                    Banner banner1 = new Timestamp().insertTime(banner);
                    bannerMapper.insert(banner1);
                    info.setCode(0000);
                    info.setMessage("success");
                }catch (Exception e){
                    info.setCode(1002);
                    info.setMessage("插入异常");
                }
            } else {
                info.setCode(1000);
                info.setMessage("存在上线");
            }
        }else {
            try {
                int a=1;
                Banner banner1 = new Timestamp().insertTime(banner);
                bannerMapper.insert(banner1);
                info.setCode(0000);
                info.setMessage("success");
            }catch (Exception e){
                info.setCode(1002);
                info.setMessage("插入异常");
            }
        }

        return info;
    }



    @Override
    public boolean deleteById(Long imageId) {
        return bannerMapper.deleteById(imageId);
    }


    @Override
    public Info updateImageStatus(Banner banner){


        Integer imageTrade=banner.getImageTrade();
        Info info = new Info();
        Map data = new HashMap();

        if(imageTrade!=null) {

            String imageName = bannerMapper.selectByImageTrade(imageTrade);

            if (imageName == null) {

                info.setCode(0000);
                info.setMessage("success");

            } else {
                data.put("imageName",imageName);
                info.setCode(1000);
                info.setMessage("存在上线");
                info.setData(data);
            }
        }else {
            Banner banner1=new Timestamp().updateTime(banner);
            bannerMapper.updateStatusById(banner1);
            info.setCode(0000);
            info.setMessage("success");

        }
        return info;
    }



    @Override
    public Info updateById(Banner banner) {


//        boolean a=bannerMapper.updateById(banner);
//        return a;
        Integer imageTrade=banner.getImageTrade();
        Info info = new Info();

        if(imageTrade!=null) {

            String imageName = bannerMapper.selectByImageTrade(imageTrade);

            if (imageName == null) {
                try {
                    Banner banner1 = new Timestamp().updateTime(banner);
                    bannerMapper.updateById(banner1);
                    info.setCode(0000);
                    info.setMessage("success");
                }catch (Exception e){
                    info.setCode(1002);
                    info.setMessage("修改异常");
                }
            } else {
                info.setCode(1000);
                info.setMessage("存在上线");
            }
        }else {
            try {
                int a=1;
                Banner banner1 = new Timestamp().updateTime(banner);
                bannerMapper.updateById(banner1);
                info.setCode(0000);
                info.setMessage("success");
            }catch (Exception e){
                info.setCode(1002);
                info.setMessage("修改异常");
            }
        }

        return info;
    }


    @Override
    public Banner selectById(Long imageId) {
        Banner banner=bannerMapper.selectById(imageId);
        return banner;
    }


    @Override
    public Page<Banner> selectImageList(Banner banner,
                                        @Param("currentPage") int currentPage, @Param("size") int size) {
        PageHelper.startPage(currentPage,size);
        Page<Banner> banners=bannerMapper.selectImageList(banner);
        return banners;

    }


    @Override
    public List<Banner> selectByImageType(Integer imageType, int count){
        List<Banner> banner=bannerMapper.selectByImageType(imageType,count);
        return banner;
    }
}
