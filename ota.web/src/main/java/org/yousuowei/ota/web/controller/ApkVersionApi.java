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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yousuowei.base.web.controller.BaseApi;
import org.yousuowei.ota.ifc.ApkVersionIfc;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;

/**
 * @ClassName: ApkVersionController
 * @Description: TODO
 * @author: jie
 * @date: 2014-9-14 下午4:33:21
 */
@Controller
@RequestMapping("/apkversion")
public class ApkVersionApi extends BaseApi<ApkVersionInfo> {

    @RequestMapping(value = "/checkNewVersion", method = RequestMethod.GET)
    @ResponseBody
    public ApkVersionInfo checkNewVersion(@RequestParam String pkName,
	    @RequestParam int vCode) {
	Logger logger = LoggerFactory.getLogger(ApkVersionApi.class);
	logger.info("checkNewVersion pkName:" + pkName + " vCode:" + vCode);
	ApkVersionInfo info = ((ApkVersionIfc) service).getNewestVersion(
		pkName, vCode);
	logger.info("checkNewVersion info:"
		+ (null == info ? "null" : info.toString()));
	return info;
    }
}
