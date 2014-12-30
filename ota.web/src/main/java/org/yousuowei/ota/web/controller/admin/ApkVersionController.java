package org.yousuowei.ota.web.controller.admin;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.yousuowei.base.web.controller.admin.BaseController;
import org.yousuowei.common.baidu.BaiduFile;
import org.yousuowei.common.baidu.BaiduFileUploadInfo;
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
@RequestMapping("admin/apkversion")
public class ApkVersionController extends BaseController<ApkVersionInfo> {

    @Override
    protected String getViewName() {
	return "apkversion";
    }

    @RequestMapping(value = { "/addWithFile" }, method = RequestMethod.POST)
    public String create(ApkVersionInfo model,
	    @RequestParam("file") CommonsMultipartFile file) throws Exception {
	BaiduFileUploadInfo fileInfo = uploadApkFile(file);
	model.setFileMd5(fileInfo.getMd5());
	model.setUrl(fileInfo.getUrl());
	return super.create(model);
    }

    private BaiduFileUploadInfo uploadApkFile(CommonsMultipartFile file) {
	BaiduFileUploadInfo info = null;
	try {
	    info = BaiduFile.uploadFile(file.getInputStream());
	} catch (IOException e) {
	}
	return info;
    }

}
