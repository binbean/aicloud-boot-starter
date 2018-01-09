/* 
 * Copyright © 2017 www.aicloud.kim
 */

/*
 * 修订记录:
 * @author 周天琪 2017-09-04 11:20 创建
 */
package com.aicloud.boot.jpa;

import com.aicloud.common.util.tostring.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * 抽象实体
 */
@MappedSuperclass
public abstract class AbstractEntity {
    // id主键
    @Id
    @GeneratedValue
    @Column
    private Long id;

    // 创建时间
    @CreationTimestamp
    @Column
    private Date createTime;

    // 更新时间
    @UpdateTimestamp
    @Column
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return ToString.toString(this);
    }
}
