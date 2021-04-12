package top.soft1921.bili.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.soft1921.bili.api.common.AjaxResponse;
import top.soft1921.bili.api.service.MustWatchService;

import javax.annotation.Resource;

/**
 * @author: 蛋宝
 * @date: 2021/4/12 0:46
 * @description: 入门必刷模块接口
 */
@RestController
@RequestMapping(value = "api/mustwatch")
public class MustWatchController {

    @Resource
    private MustWatchService mustWatchService;
    @GetMapping("hello")
    public String Hello(){
        return "这是入门必刷模块";
    }
    @GetMapping("all")
    public AjaxResponse getMustWatchList(){
        return  AjaxResponse.success(mustWatchService.getAll());

    }
    @GetMapping("{id}")
    public AjaxResponse getMustWatchById(@PathVariable("id")int id){
        return AjaxResponse.success(mustWatchService.findById(id));
    }

}