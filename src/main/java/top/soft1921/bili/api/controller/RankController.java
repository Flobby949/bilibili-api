package top.soft1921.bili.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.soft1921.bili.api.model.entity.Rank;
import top.soft1921.bili.api.service.RankService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/12
 * @description :排行榜接口类
 */
@RestController
@RequestMapping(value = "api/rank")
public class RankController {
    @Resource
    private RankService rankService;

    @GetMapping("all")
    public List<Rank> rankAll(@RequestParam(name = "pageNum",defaultValue = "1", required = false) int pageNum,
                              @RequestParam(name = "pageSize",defaultValue = "10", required = false) int pageSize){
        System.out.println(pageNum);
        return rankService.selectAll(pageNum, pageSize);
    }
}
