/**
 * Copyright © 2014 yousuowei. All rights reserved.
 * @Title: ApkVersionController.java
 * @Prject: ota.web
 * @Package: org.yousuowei.ota.web.controller
 * @Description: TODO
 * @author: jie
 * @date: 2014-9-14 下午4:33:21
 * @version: V1.0
 */

package org.yousuowei.ota.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yousuowei.ota.ifc.ApkVersionIfc;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;
import org.yousuowei.ota.web.controller.resp.ResultResp;
import org.yousuowei.ota.web.controller.resp.ResultResp.STATUS;

/**
 * @ClassName: ApkVersionController
 * @Description: TODO
 * @author: jie
 * @date: 2014-9-14 下午4:33:21
 */
@Controller
@RequestMapping("api/apkversion")
public class ApkVersionApi {

    @Autowired
    private ApkVersionIfc service;

    private ResultResp result;

    public void setService(ApkVersionIfc service) {
	this.service = service;
    }

    @RequestMapping(value = "/checkApkVersion")
    @ResponseBody
    public ResultResp checkApkVersion(String packageName, Integer version) {
	ApkVersionInfo info = service.checkApkVersion(packageName, version);
	result = new ResultResp();
	if (null == info) {
	    result.setStatus(STATUS.FAILED);
	    result.setMsg("软件没有更新！");
	} else {
	    result.setStatus(STATUS.SUCESS);
	    result.setData(info);
	}
	return result;
    }

}
