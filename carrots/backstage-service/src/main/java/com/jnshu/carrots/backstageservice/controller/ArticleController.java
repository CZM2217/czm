package com.jnshu.carrots.backstageservice.controller;


import com.github.pagehelper.Page;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.model.Info;
import com.jnshu.carrots.backstageservice.service.BannerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/a/u/image")
@RestController
public class ArticleController {


    @Autowired
    private BannerService bannerService;




    @ApiOperation(value = "获取图片列表", notes = "获取所有图片列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info imageList(Banner banner,@RequestParam(defaultValue = "1")int currentPage,
                          @RequestParam(defaultValue = "10")int size){

        Map data = new HashMap();
        Info info = new Info();

        Page<Banner> banners= bannerService.selectImageList(banner,currentPage,size);
        Long total=banners.getTotal();
        if(total>0){
            data.put("total",total);
            data.put("bannerList", banners);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }else {
            info.setCode(0001);
            info.setMessage("null");
            info.setData(data);
        }

        return info;

    }


    @ApiOperation(value = "新增图片", notes = "增加新的图片", produces = "application/json")
    @PostMapping
    public Info add(Banner banner){

        Info info=bannerService.insert(banner);
        return info;


    }

    @ApiOperation(value = "图片详情", notes = "根据id获取图片详情", produces = "application/json")
    @GetMapping
    public Info get(Long imageId) {
        Map data = new HashMap();
        Info info = new Info();
        try {
            Banner banner=bannerService.selectById(imageId);
            data.put("banner", banner);
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }catch (Exception e){
            data.put("1000", "a");
            info.setCode(1000);
            info.setMessage("null");
        }

        return info;

    }


    @ApiOperation(value = "删除图片", notes = "根据id删除图片", produces = "application/json")
    @DeleteMapping
    public Info delete(Long imageId) {

        Info info = new Info();
        try {
            bannerService.deleteById(imageId);
            info.setCode(0000);
            info.setMessage("success");
        }catch (Exception e){
            info.setCode(0001);
            info.setMessage("null");
        }

        return info;
    }



    @ApiOperation(value = "修改上线状态", notes = "根据id修改图片上线状态", produces = "application/json")
    @PutMapping(value = "/status")
    public Info status(Banner banner) {

        Info info=bannerService.updateImageStatus(banner);

        return info;
    }


    @ApiOperation(value = "图片信息修改", notes = "根据id修改图片信息", produces = "application/json")
    @PutMapping
    public Info update(Banner banner){

        Info info=bannerService.updateById(banner);

        return info;

    }





}
