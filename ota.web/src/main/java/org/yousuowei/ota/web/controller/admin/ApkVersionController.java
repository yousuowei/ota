package org.yousuowei.ota.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yousuowei.base.web.controller.admin.BaseController;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;

/**
 * 项目详细功能逻辑接口
 * 
 * @ClassName: FunctionDetailIfc
 * @Description: TODO
 * @author: jie
 * @date: 2014-3-28 下午2:16:51
 */
@Controller
@RequestMapping("/apkversion")
public class ApkVersionController extends BaseController<ApkVersionInfo> {

    @Override
    protected String getViewName() {
	return "apkversion";
    }

}
