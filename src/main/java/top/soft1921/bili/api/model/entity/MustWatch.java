package top.soft1921.bili.api.model.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@TableName(value = "t_must_watch")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MustWatch {
    /**
    * 主键id
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
    * 弹幕数
    */
    private Integer danmaku;

    /**
    * 收藏
    */
    private Integer favorite;

    /**
    * 硬币
    */
    private Integer conis;

    /**
    * 分享
    */
    private Integer share;

    /**
    * 点赞
    */
    private Integer like;

    /**
    * 时长（s）
    */
    private Integer duration;

    /**
    * 发布时间
    */
    private Date pubdate;

    /**
    * 标题
    */
    private String title;

    /**
    * 视频封面
    */
    private String pic;

    /**
    * 成就
    */
    private String achievent;
}