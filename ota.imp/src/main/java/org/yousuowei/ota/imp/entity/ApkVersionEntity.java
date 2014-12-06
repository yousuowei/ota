/**
 * Copyright © 2014 yousuowei. All rights reserved.
 * @Title: ApkVersionInfo.java
 * @Prject: ota.ifc
 * @Package: org.yousuowei.ota.ifc.info
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午8:27:44
 * @version: V1.0
 */

package org.yousuowei.ota.imp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.yousuowei.base.imp.entity.BaseEntity;

/**
 * @ClassName: ApkVersionInfo
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午8:27:44
 */
@Entity
@Table(name = "tb_apk_version")
public class ApkVersionEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;
    private String name;// 应用包名
    private String url;// apk文件地址
    private int version;// apk版本
    private String fileMd5;// 文件md5值
    private String desc;// 版本描述

    @Column(name = "av_name")
    public String getName() {
	return name;
    }

    @Column(name = "av_url")
    public String getUrl() {
	return url;
    }

    @Column(name = "av_version")
    public int getVersion() {
	return version;
    }

    @Column(name = "av_file_md5")
    public String getFileMd5() {
	return fileMd5;
    }

    @Column(name = "av_desc")
    public String getDesc() {
	return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
