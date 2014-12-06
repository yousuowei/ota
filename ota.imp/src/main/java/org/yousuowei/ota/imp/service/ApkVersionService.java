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

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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

    public ApkVersionInfo getNewestVersion(String pkName, int vCode) {
	Criterion namecCriterion = Restrictions.eq("name", pkName);
	Criterion versionCriterion = Restrictions.gt("version", vCode);
	List<ApkVersionEntity> entityList = find(namecCriterion,
		versionCriterion);
	if (null != entityList && entityList.size() != 0) {
	    return entityToInfo(entityList.get(0));
	} else {
	    return null;
	}
    }
}
