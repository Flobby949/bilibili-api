package top.soft1921.bili.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.soft1921.bili.api.common.AjaxResponse;
import top.soft1921.bili.api.service.UserService;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :用户模块接口
 */
@RestController
@RequestMapping(value = "api/user")
@Api(tags = "用户模块管理接口")
public class UserController {
    @Resource
    private UserService userService;


    @GetMapping("hello")
    public String Hello(){
        return "这是用户模块";
    }
    @GetMapping("all")
    @ApiOperation("获取所有用户信息")
    public AjaxResponse getUserList(){
        return AjaxResponse.success(userService.getAll());
    }
    @GetMapping("{id}")
    @ApiOperation("根据id查询信息")
    public AjaxResponse getById(@PathVariable("id") int id){
        return AjaxResponse.success(userService.findById(id));
    }

}
