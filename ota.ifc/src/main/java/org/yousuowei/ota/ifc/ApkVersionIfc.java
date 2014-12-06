/**
 * Copyright © 2014 yousuowei. All rights reserved.
 * @Title: ApkVersionIfc.java
 * @Prject: ota.ifc
 * @Package: org.yousuowei.ota.ifc
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午8:27:23
 * @version: V1.0
 */

package org.yousuowei.ota.ifc;

import org.yousuowei.base.ifc.BaseIfc;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;

/**
 * @ClassName: ApkVersionIfc
 * @Description: TODO
 * @author: jie
 * @date: 2014-8-31 下午8:27:23
 */

public interface ApkVersionIfc extends BaseIfc<ApkVersionInfo> {

    public ApkVersionInfo getNewestVersion(String pkName, int vCode);

}
