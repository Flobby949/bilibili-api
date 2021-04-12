package top.soft1921.bili.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 蛋宝
 * @date: 2021/4/12 0:46
 * @description: 入门必刷模块接口
 */
@RestController
@RequestMapping(value = "api/mustwatch")
public class MustWatchController {
    @GetMapping("hello")
    public String Hello(){
        return "这是入门必刷模块";
    }
}