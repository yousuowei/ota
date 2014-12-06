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

package org.yousuowei.ota.ifc.info;

import org.yousuowei.base.ifc.info.BaseInfo;

/**
 * @ClassName: ApkVersionInfo
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午8:27:44
 */

public class ApkVersionInfo extends BaseInfo {
    private String name;// 应用包名
    private String url;// apk文件地址
    private int version;// apk版本
    private String fileMd5;// 文件md5值
    private String desc;// 版本描述

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public int getVersion() {
	return version;
    }

    public void setVersion(int version) {
	this.version = version;
    }

    public String getFileMd5() {
	return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
	this.fileMd5 = fileMd5;
    }

    public String getDesc() {
	return desc;
    }

    public void setDesc(String desc) {
	this.desc = desc;
    }

}
