/**
 * Copyright © 2014 yousuowei. All rights reserved.
 * @Title: ApkVersionService.java
 * @Prject: ota.imp
 * @Package: org.yousuowei.ota.imp
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午9:32:16
 * @version: V1.0
 */

package org.yousuowei.ota.imp.service;

import org.springframework.stereotype.Service;
import org.yousuowei.base.imp.service.BaseService;
import org.yousuowei.ota.ifc.ApkVersionIfc;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;
import org.yousuowei.ota.imp.entity.ApkVersionEntity;

/**
 * @ClassName: ApkVersionService
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午9:32:16
 */
@Service
public class ApkVersionService extends
	BaseService<ApkVersionEntity, ApkVersionInfo> implements ApkVersionIfc {

    public ApkVersionInfo checkApkVersion(String name, Integer oldVersion) {
	ApkVersionEntity entity = findUniqueBy("name", name);
	if (null == entity) {
	    return null;
	}
	if (null == oldVersion || entity.getVersion() > oldVersion) {
	    return entityToInfo(entity);
	}
	return null;
    }

}
