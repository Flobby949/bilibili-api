package top.soft1921.bili.api.model.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loorzve
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 播放量
    */
    private Integer playNumber;

    /**
    * 点赞量
    */
    private Integer likes;

    /**
    * 时长（s）
    */
    private Integer duration;

    /**
    * 标题
    */
    private String title;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 收藏量
    */
    private Integer favorites;

    /**
    * 投币数
    */
    private Integer coins;

    /**
    * 封面
    */
    private String cover;

    /**
    * up链接
    */
    private String upUrl;

    /**
    * 分区id
    */
    private Long partitionId;

    /**
    * 投稿时间
    */
    private Date sendTime;
}