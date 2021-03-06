package com.ssm.entity;

import java.time.LocalDateTime;

/**
 * @author ZhangRunKai
 * @date 2020/7/21 9:53
 */
public class Blog implements Comparable<Blog>{

    private Integer blogId;
    private String title;//标题
    private String description;//摘要
    private String content;//内容
    private LocalDateTime created;//创建时间，最后编辑时间
    private Boolean status;
    private Integer userId;

    public Blog() {

    }

    public Blog(Integer blogId, String title, String description, String content, LocalDateTime created, Boolean status, Integer userId) {
        this.blogId = blogId;
        this.title = title;
        this.description = description;
        this.content = content;
        this.created = created;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public int compareTo(Blog o) {
        return this.getCreated().compareTo(o.getCreated());
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
