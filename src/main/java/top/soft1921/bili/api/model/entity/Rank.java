package top.soft1921.bili.api.model.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 231
 * @description ${description}
 * @date 2021-04-11 23:25
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_rank")
public class Rank {
    /**
     * 视频主键
     */
    private Integer id;

    /**
     * up主id
     */
    private Integer userId;

    /**
     * 播放量
     */
    private Integer view;

    /**
     * 弹幕数量
     */
    private Integer danmaku;

    /**
     * 收藏数量
     */
    private Integer favorites;

    /**
     * 投币数量
     */
    private Integer coins;

    /**
     * 转发数量
     */
    private Integer share;

    /**
    * 点赞数量
    */
    private Integer likes;

    /**
     * 视频总时长
     */
    private Integer duration;

    /**
     * 发布时间
     */
    private Date pubdate;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频分区
     */
    private Byte type;

    /**
     * 视频封面
     */
    private String pic;

    /**
     * 综合评分
     */
    private Integer score;
}