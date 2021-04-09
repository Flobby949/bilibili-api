package top.soft1921.bili.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :用户模块接口
 */
@RestController
@RequestMapping(value = "api/user")
public class UserController {
    @GetMapping("hello")
    public String Hello(){
        return "这是用户模块";
    }
}
